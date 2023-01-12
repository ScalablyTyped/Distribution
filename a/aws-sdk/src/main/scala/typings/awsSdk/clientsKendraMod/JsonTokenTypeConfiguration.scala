package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonTokenTypeConfiguration extends StObject {
  
  /**
    * The group attribute field.
    */
  var GroupAttributeField: String
  
  /**
    * The user name attribute field.
    */
  var UserNameAttributeField: String
}
object JsonTokenTypeConfiguration {
  
  inline def apply(GroupAttributeField: String, UserNameAttributeField: String): JsonTokenTypeConfiguration = {
    val __obj = js.Dynamic.literal(GroupAttributeField = GroupAttributeField.asInstanceOf[js.Any], UserNameAttributeField = UserNameAttributeField.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonTokenTypeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonTokenTypeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setGroupAttributeField(value: String): Self = StObject.set(x, "GroupAttributeField", value.asInstanceOf[js.Any])
    
    inline def setUserNameAttributeField(value: String): Self = StObject.set(x, "UserNameAttributeField", value.asInstanceOf[js.Any])
  }
}
