package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointUser extends StObject {
  
  /**
    * One or more custom attributes that describe the user by associating a name with an array of values. For example, the value of an attribute named Interests might be: ["Science", "Music", "Travel"]. You can use these attributes as filter criteria when you create segments. Attribute names are case sensitive. An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters. When you define the name of a custom attribute, avoid using the following characters: number sign (#), colon (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display attribute names that contain these characters. This restriction doesn't apply to attribute values.
    */
  var UserAttributes: js.UndefOr[MapOfListOfString] = js.undefined
  
  /**
    * The unique identifier for the user.
    */
  var UserId: js.UndefOr[string] = js.undefined
}
object EndpointUser {
  
  inline def apply(): EndpointUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointUser]
  }
  
  extension [Self <: EndpointUser](x: Self) {
    
    inline def setUserAttributes(value: MapOfListOfString): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
    
    inline def setUserId(value: string): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
