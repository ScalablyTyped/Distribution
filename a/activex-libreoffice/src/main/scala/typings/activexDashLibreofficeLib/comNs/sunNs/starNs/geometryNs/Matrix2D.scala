package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure defines a 2 by 2 matrix.
  *
  * This constitutes a linear mapping of a point in 2D to another point in 2D.
  *
  * The matrix defined by this structure constitutes a linear mapping of a point in 2D to another point in 2D. In contrast to the {@link
  * com.sun.star.geometry.AffineMatrix2D} , this matrix does not include any translational components.
  *
  * A linear mapping, as performed by this matrix, can be written out as follows, where `xs` and `ys` are the source, and `xd` and `yd` the corresponding
  * result coordinates:
  *
  * ` xd = m00*xs + m01*ys; yd = m10*xs + m11*ys; `
  *
  * Thus, in common matrix language, with M being the {@link Matrix2D} and vs=[xs,ys]^T, vd=[xd,yd]^T two 2D vectors, the linear mapping is written as
  * vd=M*vs. Concatenation of transformations amounts to multiplication of matrices, i.e. a scaling, given by S, followed by a rotation, given by R, is
  * expressed as vd=R*(S*vs) in the above notation. Since matrix multiplication is associative, this can be shortened to vd=(R*S)*vs=M'*vs. Therefore, a
  * set of consecutive transformations can be accumulated into a single {@link Matrix2D} , by multiplying the current transformation with the additional
  * transformation from the left.
  *
  * Due to this transformational approach, all geometry data types are points in abstract integer or real coordinate spaces, without any physical
  * dimensions attached to them. This physical measurement units are typically only added when using these data types to render something onto a physical
  * output device, like a screen or a printer. Then, the total transformation matrix and the device resolution determine the actual measurement unit.
  * @since OOo 2.0
  */
trait Matrix2D extends js.Object {
  var m00: scala.Double
  var m01: scala.Double
  var m10: scala.Double
  var m11: scala.Double
}

object Matrix2D {
  @scala.inline
  def apply(m00: scala.Double, m01: scala.Double, m10: scala.Double, m11: scala.Double): Matrix2D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("m00")(m00)
    __obj.updateDynamic("m01")(m01)
    __obj.updateDynamic("m10")(m10)
    __obj.updateDynamic("m11")(m11)
    __obj.asInstanceOf[Matrix2D]
  }
}

