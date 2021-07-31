package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewData extends StObject {
  
  var NewData: String
  
  var Response: Double
}
object NewData {
  
  @scala.inline
  def apply(NewData: String, Response: Double): NewData = {
    val __obj = js.Dynamic.literal(NewData = NewData.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewData]
  }
  
  @scala.inline
  implicit class NewDataMutableBuilder[Self <: NewData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewData(value: String): Self = StObject.set(x, "NewData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Double): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
  }
}
