package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure defines a 2 by 3 affine matrix.
  *
  * The matrix defined by this structure constitutes an affine mapping of a point in 2D to another point in 2D. The last line of a complete 3 by 3 matrix
  * is omitted, since it is implicitly assumed to be [0,0,1].
  *
  * An affine mapping, as performed by this matrix, can be written out as follows, where `xs` and `ys` are the source, and `xd` and `yd` the corresponding
  * result coordinates:
  *
  * ` xd = m00*xs + m01*ys + m02; yd = m10*xs + m11*ys + m12; `
  *
  * Thus, in common matrix language, with M being the {@link AffineMatrix2D} and vs=[xs,ys]^T, vd=[xd,yd]^T two 2D vectors, the affine transformation is
  * written as vd=M*vs. Concatenation of transformations amounts to multiplication of matrices, i.e. a translation, given by T, followed by a rotation,
  * given by R, is expressed as vd=R*(T*vs) in the above notation. Since matrix multiplication is associative, this can be shortened to vd=(R*T)*vs=M'*vs.
  * Therefore, a set of consecutive transformations can be accumulated into a single {@link AffineMatrix2D} , by multiplying the current transformation
  * with the additional transformation from the left.
  *
  * Due to this transformational approach, all geometry data types are points in abstract integer or real coordinate spaces, without any physical
  * dimensions attached to them. This physical measurement units are typically only added when using these data types to render something onto a physical
  * output device, like a screen or a printer, Then, the total transformation matrix and the device resolution determine the actual measurement unit.
  * @since OOo 2.0
  */
trait AffineMatrix2D extends js.Object {
  var m00: scala.Double
  var m01: scala.Double
  var m02: scala.Double
  var m10: scala.Double
  var m11: scala.Double
  var m12: scala.Double
}

object AffineMatrix2D {
  @scala.inline
  def apply(
    m00: scala.Double,
    m01: scala.Double,
    m02: scala.Double,
    m10: scala.Double,
    m11: scala.Double,
    m12: scala.Double
  ): AffineMatrix2D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("m00")(m00)
    __obj.updateDynamic("m01")(m01)
    __obj.updateDynamic("m02")(m02)
    __obj.updateDynamic("m10")(m10)
    __obj.updateDynamic("m11")(m11)
    __obj.updateDynamic("m12")(m12)
    __obj.asInstanceOf[AffineMatrix2D]
  }
}

