package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedResource extends StObject {
  
  /**
    * The error code associated with the failure.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.ErrorCode] = js.undefined
  
  /**
    * The error message text associated with the failure.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.ErrorMessage] = js.undefined
  
  /**
    * The ARN of the resource that failed to be added or removed.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.ResourceArn] = js.undefined
}
object FailedResource {
  
  inline def apply(): FailedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedResource] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
