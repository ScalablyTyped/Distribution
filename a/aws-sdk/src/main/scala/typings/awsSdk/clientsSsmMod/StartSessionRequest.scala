package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSessionRequest extends StObject {
  
  /**
    * The name of the SSM document you want to use to define the type of session, input parameters, or preferences for the session. For example, SSM-SessionManagerRunShell. You can call the GetDocument API to verify the document exists before attempting to start a session. If no document name is provided, a shell to the managed node is launched by default. For more information, see Start a session in the Amazon Web Services Systems Manager User Guide.
    */
  var DocumentName: js.UndefOr[DocumentARN] = js.undefined
  
  /**
    * The values you want to specify for the parameters defined in the Session document.
    */
  var Parameters: js.UndefOr[SessionManagerParameters] = js.undefined
  
  /**
    * The reason for connecting to the instance. This value is included in the details for the Amazon CloudWatch Events event created when you start the session.
    */
  var Reason: js.UndefOr[SessionReason] = js.undefined
  
  /**
    * The managed node to connect to for the session.
    */
  var Target: SessionTarget
}
object StartSessionRequest {
  
  inline def apply(Target: SessionTarget): StartSessionRequest = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSessionRequest]
  }
  
  extension [Self <: StartSessionRequest](x: Self) {
    
    inline def setDocumentName(value: DocumentARN): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    inline def setParameters(value: SessionManagerParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setReason(value: SessionReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setTarget(value: SessionTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
