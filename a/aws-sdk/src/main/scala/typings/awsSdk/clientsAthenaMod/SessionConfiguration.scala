package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionConfiguration extends StObject {
  
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The ARN of the execution role used for the session.
    */
  var ExecutionRole: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The idle timeout in seconds for the session.
    */
  var IdleTimeoutSeconds: js.UndefOr[Long] = js.undefined
  
  /**
    * The Amazon S3 location that stores information for the notebook.
    */
  var WorkingDirectory: js.UndefOr[ResultOutputLocation] = js.undefined
}
object SessionConfiguration {
  
  inline def apply(): SessionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setExecutionRole(value: RoleArn): Self = StObject.set(x, "ExecutionRole", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleUndefined: Self = StObject.set(x, "ExecutionRole", js.undefined)
    
    inline def setIdleTimeoutSeconds(value: Long): Self = StObject.set(x, "IdleTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutSecondsUndefined: Self = StObject.set(x, "IdleTimeoutSeconds", js.undefined)
    
    inline def setWorkingDirectory(value: ResultOutputLocation): Self = StObject.set(x, "WorkingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "WorkingDirectory", js.undefined)
  }
}
