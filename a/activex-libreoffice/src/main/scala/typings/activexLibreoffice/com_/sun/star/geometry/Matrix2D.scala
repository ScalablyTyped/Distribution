package typings.activexLibreoffice.com_.sun.star.geometry

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
@js.native
trait Matrix2D extends js.Object {
  var m00: Double = js.native
  var m01: Double = js.native
  var m10: Double = js.native
  var m11: Double = js.native
}

object Matrix2D {
  @scala.inline
  def apply(m00: Double, m01: Double, m10: Double, m11: Double): Matrix2D = {
    val __obj = js.Dynamic.literal(m00 = m00.asInstanceOf[js.Any], m01 = m01.asInstanceOf[js.Any], m10 = m10.asInstanceOf[js.Any], m11 = m11.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix2D]
  }
  @scala.inline
  implicit class Matrix2DOps[Self <: Matrix2D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setM00(value: Double): Self = this.set("m00", value.asInstanceOf[js.Any])
    @scala.inline
    def setM01(value: Double): Self = this.set("m01", value.asInstanceOf[js.Any])
    @scala.inline
    def setM10(value: Double): Self = this.set("m10", value.asInstanceOf[js.Any])
    @scala.inline
    def setM11(value: Double): Self = this.set("m11", value.asInstanceOf[js.Any])
  }
  
}

