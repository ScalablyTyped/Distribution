package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmDocument extends StObject {
  
  /**
    * User-friendly name for the AWS Systems Manager Document.
    */
  var actionName: BoundedString
  
  /**
    * AWS Systems Manager Document external parameters.
    */
  var externalParameters: js.UndefOr[SsmDocumentExternalParameters] = js.undefined
  
  /**
    * If true, Cutover will not be enabled if the document has failed.
    */
  var mustSucceedForCutover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * AWS Systems Manager Document parameters.
    */
  var parameters: js.UndefOr[SsmDocumentParameters] = js.undefined
  
  /**
    * AWS Systems Manager Document name or full ARN.
    */
  var ssmDocumentName: SsmDocumentName
  
  /**
    * AWS Systems Manager Document timeout seconds.
    */
  var timeoutSeconds: js.UndefOr[StrictlyPositiveInteger] = js.undefined
}
object SsmDocument {
  
  inline def apply(actionName: BoundedString, ssmDocumentName: SsmDocumentName): SsmDocument = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], ssmDocumentName = ssmDocumentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsmDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmDocument] (val x: Self) extends AnyVal {
    
    inline def setActionName(value: BoundedString): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setExternalParameters(value: SsmDocumentExternalParameters): Self = StObject.set(x, "externalParameters", value.asInstanceOf[js.Any])
    
    inline def setExternalParametersUndefined: Self = StObject.set(x, "externalParameters", js.undefined)
    
    inline def setMustSucceedForCutover(value: Boolean): Self = StObject.set(x, "mustSucceedForCutover", value.asInstanceOf[js.Any])
    
    inline def setMustSucceedForCutoverUndefined: Self = StObject.set(x, "mustSucceedForCutover", js.undefined)
    
    inline def setParameters(value: SsmDocumentParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSsmDocumentName(value: SsmDocumentName): Self = StObject.set(x, "ssmDocumentName", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSeconds(value: StrictlyPositiveInteger): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
