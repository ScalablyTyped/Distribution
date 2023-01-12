package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessKeyLastUsedRequest extends StObject {
  
  /**
    * The identifier of an access key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var AccessKeyId: accessKeyIdType
}
object GetAccessKeyLastUsedRequest {
  
  inline def apply(AccessKeyId: accessKeyIdType): GetAccessKeyLastUsedRequest = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessKeyLastUsedRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessKeyLastUsedRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: accessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
  }
}
