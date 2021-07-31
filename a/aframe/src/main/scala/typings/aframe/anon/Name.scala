package typings.aframe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var id: String
  
  var name: String
  
  var newData: js.Any
  
  var oldData: js.Any
}
object Name {
  
  @scala.inline
  def apply(id: String, name: String, newData: js.Any, oldData: js.Any): Name = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewData(value: js.Any): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldData(value: js.Any): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
  }
}
