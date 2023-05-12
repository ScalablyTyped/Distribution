package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSourceServerActionRequest extends StObject {
  
  /**
    * Source server post migration custom action ID.
    */
  var actionID: ActionID
  
  /**
    * Source server post migration custom action name.
    */
  var actionName: ActionName
  
  /**
    * Source server post migration custom action active status.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Source server post migration custom action category.
    */
  var category: js.UndefOr[ActionCategory] = js.undefined
  
  /**
    * Source server post migration custom action description.
    */
  var description: js.UndefOr[ActionDescription] = js.undefined
  
  /**
    * Source server post migration custom action document identifier.
    */
  var documentIdentifier: BoundedString
  
  /**
    * Source server post migration custom action document version.
    */
  var documentVersion: js.UndefOr[DocumentVersion] = js.undefined
  
  /**
    * Source server post migration custom action external parameters.
    */
  var externalParameters: js.UndefOr[SsmDocumentExternalParameters] = js.undefined
  
  /**
    * Source server post migration custom action must succeed for cutover.
    */
  var mustSucceedForCutover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Source server post migration custom action order.
    */
  var order: OrderType
  
  /**
    * Source server post migration custom action parameters.
    */
  var parameters: js.UndefOr[SsmDocumentParameters] = js.undefined
  
  /**
    * Source server ID.
    */
  var sourceServerID: SourceServerID
  
  /**
    * Source server post migration custom action timeout in seconds.
    */
  var timeoutSeconds: js.UndefOr[StrictlyPositiveInteger] = js.undefined
}
object PutSourceServerActionRequest {
  
  inline def apply(
    actionID: ActionID,
    actionName: ActionName,
    documentIdentifier: BoundedString,
    order: OrderType,
    sourceServerID: SourceServerID
  ): PutSourceServerActionRequest = {
    val __obj = js.Dynamic.literal(actionID = actionID.asInstanceOf[js.Any], actionName = actionName.asInstanceOf[js.Any], documentIdentifier = documentIdentifier.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSourceServerActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSourceServerActionRequest] (val x: Self) extends AnyVal {
    
    inline def setActionID(value: ActionID): Self = StObject.set(x, "actionID", value.asInstanceOf[js.Any])
    
    inline def setActionName(value: ActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCategory(value: ActionCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: ActionDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocumentIdentifier(value: BoundedString): Self = StObject.set(x, "documentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
    
    inline def setExternalParameters(value: SsmDocumentExternalParameters): Self = StObject.set(x, "externalParameters", value.asInstanceOf[js.Any])
    
    inline def setExternalParametersUndefined: Self = StObject.set(x, "externalParameters", js.undefined)
    
    inline def setMustSucceedForCutover(value: Boolean): Self = StObject.set(x, "mustSucceedForCutover", value.asInstanceOf[js.Any])
    
    inline def setMustSucceedForCutoverUndefined: Self = StObject.set(x, "mustSucceedForCutover", js.undefined)
    
    inline def setOrder(value: OrderType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: SsmDocumentParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSeconds(value: StrictlyPositiveInteger): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
