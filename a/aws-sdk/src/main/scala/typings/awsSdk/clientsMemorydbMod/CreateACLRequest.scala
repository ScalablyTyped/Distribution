package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateACLRequest extends StObject {
  
  /**
    * The name of the Access Control List.
    */
  var ACLName: String
  
  /**
    * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value, although null is accepted.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The list of users that belong to the Access Control List.
    */
  var UserNames: js.UndefOr[UserNameListInput] = js.undefined
}
object CreateACLRequest {
  
  inline def apply(ACLName: String): CreateACLRequest = {
    val __obj = js.Dynamic.literal(ACLName = ACLName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateACLRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateACLRequest] (val x: Self) extends AnyVal {
    
    inline def setACLName(value: String): Self = StObject.set(x, "ACLName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserNames(value: UserNameListInput): Self = StObject.set(x, "UserNames", value.asInstanceOf[js.Any])
    
    inline def setUserNamesUndefined: Self = StObject.set(x, "UserNames", js.undefined)
    
    inline def setUserNamesVarargs(value: UserName*): Self = StObject.set(x, "UserNames", js.Array(value*))
  }
}
