package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLoggingConfigurationRequest extends StObject {
  
  /**
    * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The ARN of the CW log group to which the vended log data will be published.
    */
  var logGroupArn: LogGroupArn
  
  /**
    * The ID of the workspace to vend logs to.
    */
  var workspaceId: WorkspaceId
}
object UpdateLoggingConfigurationRequest {
  
  inline def apply(logGroupArn: LogGroupArn, workspaceId: WorkspaceId): UpdateLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(logGroupArn = logGroupArn.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "logGroupArn", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
