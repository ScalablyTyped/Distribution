package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a homogeneous matrix by four homogeneous lines. */
trait HomogenMatrix4 extends StObject {
  
  var Line1: HomogenMatrixLine4
  
  var Line2: HomogenMatrixLine4
  
  var Line3: HomogenMatrixLine4
  
  var Line4: HomogenMatrixLine4
}
object HomogenMatrix4 {
  
  inline def apply(
    Line1: HomogenMatrixLine4,
    Line2: HomogenMatrixLine4,
    Line3: HomogenMatrixLine4,
    Line4: HomogenMatrixLine4
  ): HomogenMatrix4 = {
    val __obj = js.Dynamic.literal(Line1 = Line1.asInstanceOf[js.Any], Line2 = Line2.asInstanceOf[js.Any], Line3 = Line3.asInstanceOf[js.Any], Line4 = Line4.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrix4]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HomogenMatrix4] (val x: Self) extends AnyVal {
    
    inline def setLine1(value: HomogenMatrixLine4): Self = StObject.set(x, "Line1", value.asInstanceOf[js.Any])
    
    inline def setLine2(value: HomogenMatrixLine4): Self = StObject.set(x, "Line2", value.asInstanceOf[js.Any])
    
    inline def setLine3(value: HomogenMatrixLine4): Self = StObject.set(x, "Line3", value.asInstanceOf[js.Any])
    
    inline def setLine4(value: HomogenMatrixLine4): Self = StObject.set(x, "Line4", value.asInstanceOf[js.Any])
  }
}
