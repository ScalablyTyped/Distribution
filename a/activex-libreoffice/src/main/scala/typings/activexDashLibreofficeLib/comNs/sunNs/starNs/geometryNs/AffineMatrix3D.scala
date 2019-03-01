package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure defines a 3 by 4 affine matrix.
  *
  * The matrix defined by this structure constitutes an affine mapping of a point in 3D to another point in 3D. The last line of a complete 4 by 4 matrix
  * is omitted, since it is implicitly assumed to be [0,0,0,1].
  *
  * An affine mapping, as performed by this matrix, can be written out as follows, where `xs, ys` and `zs` are the source, and `xd, yd` and `zd` the
  * corresponding result coordinates:
  *
  * ` xd = m00*xs + m01*ys + m02*zs + m03; yd = m10*xs + m11*ys + m12*zs + m13; zd = m20*xs + m21*ys + m22*zs + m23; `
  *
  * Thus, in common matrix language, with M being the {@link AffineMatrix3D} and vs=[xs,ys,zs]^T, vd=[xd,yd,zd]^T two 3D vectors, the affine
  * transformation is written as vd=M*vs. Concatenation of transformations amounts to multiplication of matrices, i.e. a translation, given by T, followed
  * by a rotation, given by R, is expressed as vd=R*(T*vs) in the above notation. Since matrix multiplication is associative, this can be shortened to
  * vd=(R*T)*vs=M'*vs. Therefore, a set of consecutive transformations can be accumulated into a single {@link AffineMatrix3D} , by multiplying the
  * current transformation with the additional transformation from the left.
  *
  * Due to this transformational approach, all geometry data types are points in abstract integer or real coordinate spaces, without any physical
  * dimensions attached to them. This physical measurement units are typically only added when using these data types to render something onto a physical
  * output device. For 3D coordinates there is also a projection from 3D to 2D device coordinates needed. Only then the total transformation matrix
  * (including projection to 2D) and the device resolution determine the actual measurement unit in 3D.
  * @since OOo 2.0
  */
trait AffineMatrix3D extends js.Object {
  var m00: scala.Double
  var m01: scala.Double
  var m02: scala.Double
  var m03: scala.Double
  var m10: scala.Double
  var m11: scala.Double
  var m12: scala.Double
  var m13: scala.Double
  var m20: scala.Double
  var m21: scala.Double
  var m22: scala.Double
  var m23: scala.Double
}

object AffineMatrix3D {
  @scala.inline
  def apply(
    m00: scala.Double,
    m01: scala.Double,
    m02: scala.Double,
    m03: scala.Double,
    m10: scala.Double,
    m11: scala.Double,
    m12: scala.Double,
    m13: scala.Double,
    m20: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    m23: scala.Double
  ): AffineMatrix3D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("m00")(m00)
    __obj.updateDynamic("m01")(m01)
    __obj.updateDynamic("m02")(m02)
    __obj.updateDynamic("m03")(m03)
    __obj.updateDynamic("m10")(m10)
    __obj.updateDynamic("m11")(m11)
    __obj.updateDynamic("m12")(m12)
    __obj.updateDynamic("m13")(m13)
    __obj.updateDynamic("m20")(m20)
    __obj.updateDynamic("m21")(m21)
    __obj.updateDynamic("m22")(m22)
    __obj.updateDynamic("m23")(m23)
    __obj.asInstanceOf[AffineMatrix3D]
  }
}

