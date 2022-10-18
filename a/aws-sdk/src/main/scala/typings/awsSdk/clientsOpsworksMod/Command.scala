package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  /**
    * Date and time when the command was acknowledged.
    */
  var AcknowledgedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The command ID.
    */
  var CommandId: js.UndefOr[String] = js.undefined
  
  /**
    * Date when the command completed.
    */
  var CompletedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Date and time when the command was run.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The command deployment ID.
    */
  var DeploymentId: js.UndefOr[String] = js.undefined
  
  /**
    * The command exit code.
    */
  var ExitCode: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the instance where the command was executed.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the command log.
    */
  var LogUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The command status:   failed   successful   skipped   pending  
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The command type:    configure     deploy     execute_recipes     install_dependencies     restart     rollback     setup     start     stop     undeploy     update_custom_cookbooks     update_dependencies   
    */
  var Type: js.UndefOr[String] = js.undefined
}
object Command {
  
  inline def apply(): Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Command]
  }
  
  extension [Self <: Command](x: Self) {
    
    inline def setAcknowledgedAt(value: DateTime): Self = StObject.set(x, "AcknowledgedAt", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgedAtUndefined: Self = StObject.set(x, "AcknowledgedAt", js.undefined)
    
    inline def setCommandId(value: String): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "CommandId", js.undefined)
    
    inline def setCompletedAt(value: DateTime): Self = StObject.set(x, "CompletedAt", value.asInstanceOf[js.Any])
    
    inline def setCompletedAtUndefined: Self = StObject.set(x, "CompletedAt", js.undefined)
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    inline def setExitCode(value: Integer): Self = StObject.set(x, "ExitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "ExitCode", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setLogUrl(value: String): Self = StObject.set(x, "LogUrl", value.asInstanceOf[js.Any])
    
    inline def setLogUrlUndefined: Self = StObject.set(x, "LogUrl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
