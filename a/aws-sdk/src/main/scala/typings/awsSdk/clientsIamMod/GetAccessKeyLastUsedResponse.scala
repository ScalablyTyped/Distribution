package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessKeyLastUsedResponse extends StObject {
  
  /**
    * Contains information about the last time the access key was used.
    */
  var AccessKeyLastUsed: js.UndefOr[typings.awsSdk.clientsIamMod.AccessKeyLastUsed] = js.undefined
  
  /**
    * The name of the IAM user that owns this access key. 
    */
  var UserName: js.UndefOr[existingUserNameType] = js.undefined
}
object GetAccessKeyLastUsedResponse {
  
  inline def apply(): GetAccessKeyLastUsedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessKeyLastUsedResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessKeyLastUsedResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyLastUsed(value: AccessKeyLastUsed): Self = StObject.set(x, "AccessKeyLastUsed", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyLastUsedUndefined: Self = StObject.set(x, "AccessKeyLastUsed", js.undefined)
    
    inline def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
