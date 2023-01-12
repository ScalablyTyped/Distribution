package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKeyMetadata extends StObject {
  
  /**
    * The ID for this access key.
    */
  var AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined
  
  /**
    * The date when the access key was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the access key. Active means that the key is valid for API calls; Inactive means it is not.
    */
  var Status: js.UndefOr[statusType] = js.undefined
  
  /**
    * The name of the IAM user that the key is associated with.
    */
  var UserName: js.UndefOr[userNameType] = js.undefined
}
object AccessKeyMetadata {
  
  inline def apply(): AccessKeyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessKeyMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessKeyMetadata] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: accessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
