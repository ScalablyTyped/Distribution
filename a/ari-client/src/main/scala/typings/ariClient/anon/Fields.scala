package typings.ariClient.anon

import typings.ariClient.mod.Containers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends StObject {
  
  var configClass: String = js.native
  
  var fields: js.UndefOr[Containers] = js.native
  
  var id: String = js.native
  
  var objectType: String = js.native
}
object Fields {
  
  @scala.inline
  def apply(configClass: String, id: String, objectType: String): Fields = {
    val __obj = js.Dynamic.literal(configClass = configClass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigClass(value: String): Self = StObject.set(x, "configClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: Containers): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
  }
}
