package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfigurationMetadata extends StObject {
  
  /**
    * The time when the logging configuration was created.
    */
  var createdAt: js.Date
  
  /**
    * The ARN of the CW log group to which the vended log data will be published.
    */
  var logGroupArn: LogGroupArn
  
  /**
    * The time when the logging configuration was modified.
    */
  var modifiedAt: js.Date
  
  /**
    * The status of the logging configuration.
    */
  var status: LoggingConfigurationStatus
  
  /**
    * The workspace where the logging configuration exists.
    */
  var workspace: WorkspaceId
}
object LoggingConfigurationMetadata {
  
  inline def apply(
    createdAt: js.Date,
    logGroupArn: LogGroupArn,
    modifiedAt: js.Date,
    status: LoggingConfigurationStatus,
    workspace: WorkspaceId
  ): LoggingConfigurationMetadata = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], logGroupArn = logGroupArn.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfigurationMetadata]
  }
  
  extension [Self <: LoggingConfigurationMetadata](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "logGroupArn", value.asInstanceOf[js.Any])
    
    inline def setModifiedAt(value: js.Date): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: LoggingConfigurationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setWorkspace(value: WorkspaceId): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
