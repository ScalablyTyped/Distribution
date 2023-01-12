package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmDocument extends StObject {
  
  /**
    * Source server replication type.
    */
  var actionName: BoundedString
  
  /**
    * Source server replication type.
    */
  var mustSucceedForCutover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Source server replication type.
    */
  var parameters: js.UndefOr[SsmDocumentParameters] = js.undefined
  
  /**
    * Source server replication type.
    */
  var ssmDocumentName: SsmDocumentName
  
  /**
    * Source server replication type.
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
    
    inline def setMustSucceedForCutover(value: Boolean): Self = StObject.set(x, "mustSucceedForCutover", value.asInstanceOf[js.Any])
    
    inline def setMustSucceedForCutoverUndefined: Self = StObject.set(x, "mustSucceedForCutover", js.undefined)
    
    inline def setParameters(value: SsmDocumentParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSsmDocumentName(value: SsmDocumentName): Self = StObject.set(x, "ssmDocumentName", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSeconds(value: StrictlyPositiveInteger): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
