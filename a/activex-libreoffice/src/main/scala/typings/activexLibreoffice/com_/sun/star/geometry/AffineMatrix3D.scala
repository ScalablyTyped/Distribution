package typings.activexLibreoffice.com_.sun.star.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait AffineMatrix3D extends StObject {
  
  var m00: Double
  
  var m01: Double
  
  var m02: Double
  
  var m03: Double
  
  var m10: Double
  
  var m11: Double
  
  var m12: Double
  
  var m13: Double
  
  var m20: Double
  
  var m21: Double
  
  var m22: Double
  
  var m23: Double
}
object AffineMatrix3D {
  
  inline def apply(
    m00: Double,
    m01: Double,
    m02: Double,
    m03: Double,
    m10: Double,
    m11: Double,
    m12: Double,
    m13: Double,
    m20: Double,
    m21: Double,
    m22: Double,
    m23: Double
  ): AffineMatrix3D = {
    val __obj = js.Dynamic.literal(m00 = m00.asInstanceOf[js.Any], m01 = m01.asInstanceOf[js.Any], m02 = m02.asInstanceOf[js.Any], m03 = m03.asInstanceOf[js.Any], m10 = m10.asInstanceOf[js.Any], m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m13 = m13.asInstanceOf[js.Any], m20 = m20.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m23 = m23.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffineMatrix3D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AffineMatrix3D] (val x: Self) extends AnyVal {
    
    inline def setM00(value: Double): Self = StObject.set(x, "m00", value.asInstanceOf[js.Any])
    
    inline def setM01(value: Double): Self = StObject.set(x, "m01", value.asInstanceOf[js.Any])
    
    inline def setM02(value: Double): Self = StObject.set(x, "m02", value.asInstanceOf[js.Any])
    
    inline def setM03(value: Double): Self = StObject.set(x, "m03", value.asInstanceOf[js.Any])
    
    inline def setM10(value: Double): Self = StObject.set(x, "m10", value.asInstanceOf[js.Any])
    
    inline def setM11(value: Double): Self = StObject.set(x, "m11", value.asInstanceOf[js.Any])
    
    inline def setM12(value: Double): Self = StObject.set(x, "m12", value.asInstanceOf[js.Any])
    
    inline def setM13(value: Double): Self = StObject.set(x, "m13", value.asInstanceOf[js.Any])
    
    inline def setM20(value: Double): Self = StObject.set(x, "m20", value.asInstanceOf[js.Any])
    
    inline def setM21(value: Double): Self = StObject.set(x, "m21", value.asInstanceOf[js.Any])
    
    inline def setM22(value: Double): Self = StObject.set(x, "m22", value.asInstanceOf[js.Any])
    
    inline def setM23(value: Double): Self = StObject.set(x, "m23", value.asInstanceOf[js.Any])
  }
}
