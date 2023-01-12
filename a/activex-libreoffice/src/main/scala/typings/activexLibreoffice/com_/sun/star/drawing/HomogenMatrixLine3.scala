package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a single line for a {@link HomogenMatrix3} . */
trait HomogenMatrixLine3 extends StObject {
  
  var Column1: Double
  
  var Column2: Double
  
  var Column3: Double
}
object HomogenMatrixLine3 {
  
  inline def apply(Column1: Double, Column2: Double, Column3: Double): HomogenMatrixLine3 = {
    val __obj = js.Dynamic.literal(Column1 = Column1.asInstanceOf[js.Any], Column2 = Column2.asInstanceOf[js.Any], Column3 = Column3.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrixLine3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HomogenMatrixLine3] (val x: Self) extends AnyVal {
    
    inline def setColumn1(value: Double): Self = StObject.set(x, "Column1", value.asInstanceOf[js.Any])
    
    inline def setColumn2(value: Double): Self = StObject.set(x, "Column2", value.asInstanceOf[js.Any])
    
    inline def setColumn3(value: Double): Self = StObject.set(x, "Column3", value.asInstanceOf[js.Any])
  }
}
