package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSessionRequest extends StObject {
  
  /**
    * A unique case-sensitive string used to ensure the request to create the session is idempotent (executes only once). If another StartSessionRequest is received, the same response is returned and another session is not created. If a parameter has changed, an error is returned.  This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK for Java) auto-generate the token for users. If you are not using the Amazon Web Services SDK or the Amazon Web Services CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The session description.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Contains engine data processing unit (DPU) configuration settings and parameter mappings.
    */
  var EngineConfiguration: typings.awsSdk.clientsAthenaMod.EngineConfiguration
  
  /**
    * The notebook version. This value is supplied automatically for notebook sessions in the Athena console and is not required for programmatic session access. The only valid notebook version is Athena notebook version 1. If you specify a value for NotebookVersion, you must also specify a value for NotebookId. See EngineConfiguration$AdditionalConfigs.
    */
  var NotebookVersion: js.UndefOr[NameString] = js.undefined
  
  /**
    * The idle timeout in minutes for the session.
    */
  var SessionIdleTimeoutInMinutes: js.UndefOr[typings.awsSdk.clientsAthenaMod.SessionIdleTimeoutInMinutes] = js.undefined
  
  /**
    * The workgroup to which the session belongs.
    */
  var WorkGroup: WorkGroupName
}
object StartSessionRequest {
  
  inline def apply(EngineConfiguration: EngineConfiguration, WorkGroup: WorkGroupName): StartSessionRequest = {
    val __obj = js.Dynamic.literal(EngineConfiguration = EngineConfiguration.asInstanceOf[js.Any], WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngineConfiguration(value: EngineConfiguration): Self = StObject.set(x, "EngineConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotebookVersion(value: NameString): Self = StObject.set(x, "NotebookVersion", value.asInstanceOf[js.Any])
    
    inline def setNotebookVersionUndefined: Self = StObject.set(x, "NotebookVersion", js.undefined)
    
    inline def setSessionIdleTimeoutInMinutes(value: SessionIdleTimeoutInMinutes): Self = StObject.set(x, "SessionIdleTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setSessionIdleTimeoutInMinutesUndefined: Self = StObject.set(x, "SessionIdleTimeoutInMinutes", js.undefined)
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
