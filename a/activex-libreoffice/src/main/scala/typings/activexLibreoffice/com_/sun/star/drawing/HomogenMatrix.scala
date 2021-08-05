package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a homogeneous matrix by three homogeneous lines */
trait HomogenMatrix extends StObject {
  
  var Line1: HomogenMatrixLine
  
  var Line2: HomogenMatrixLine
  
  var Line3: HomogenMatrixLine
  
  var Line4: HomogenMatrixLine
}
object HomogenMatrix {
  
  inline def apply(
    Line1: HomogenMatrixLine,
    Line2: HomogenMatrixLine,
    Line3: HomogenMatrixLine,
    Line4: HomogenMatrixLine
  ): HomogenMatrix = {
    val __obj = js.Dynamic.literal(Line1 = Line1.asInstanceOf[js.Any], Line2 = Line2.asInstanceOf[js.Any], Line3 = Line3.asInstanceOf[js.Any], Line4 = Line4.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrix]
  }
  
  extension [Self <: HomogenMatrix](x: Self) {
    
    inline def setLine1(value: HomogenMatrixLine): Self = StObject.set(x, "Line1", value.asInstanceOf[js.Any])
    
    inline def setLine2(value: HomogenMatrixLine): Self = StObject.set(x, "Line2", value.asInstanceOf[js.Any])
    
    inline def setLine3(value: HomogenMatrixLine): Self = StObject.set(x, "Line3", value.asInstanceOf[js.Any])
    
    inline def setLine4(value: HomogenMatrixLine): Self = StObject.set(x, "Line4", value.asInstanceOf[js.Any])
  }
}
