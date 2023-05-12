package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateActionDocument extends StObject {
  
  /**
    * Template post migration custom action ID.
    */
  var actionID: js.UndefOr[ActionID] = js.undefined
  
  /**
    * Template post migration custom action name.
    */
  var actionName: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * Template post migration custom action active status.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Template post migration custom action category.
    */
  var category: js.UndefOr[ActionCategory] = js.undefined
  
  /**
    * Template post migration custom action description.
    */
  var description: js.UndefOr[ActionDescription] = js.undefined
  
  /**
    * Template post migration custom action document identifier.
    */
  var documentIdentifier: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * Template post migration custom action document version.
    */
  var documentVersion: js.UndefOr[DocumentVersion] = js.undefined
  
  /**
    * Template post migration custom action external parameters.
    */
  var externalParameters: js.UndefOr[SsmDocumentExternalParameters] = js.undefined
  
  /**
    * Template post migration custom action must succeed for cutover.
    */
  var mustSucceedForCutover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Operating system eligible for this template post migration custom action.
    */
  var operatingSystem: js.UndefOr[OperatingSystemString] = js.undefined
  
  /**
    * Template post migration custom action order.
    */
  var order: js.UndefOr[OrderType] = js.undefined
  
  /**
    * Template post migration custom action parameters.
    */
  var parameters: js.UndefOr[SsmDocumentParameters] = js.undefined
  
  /**
    * Template post migration custom action timeout in seconds.
    */
  var timeoutSeconds: js.UndefOr[StrictlyPositiveInteger] = js.undefined
}
object TemplateActionDocument {
  
  inline def apply(): TemplateActionDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateActionDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateActionDocument] (val x: Self) extends AnyVal {
    
    inline def setActionID(value: ActionID): Self = StObject.set(x, "actionID", value.asInstanceOf[js.Any])
    
    inline def setActionIDUndefined: Self = StObject.set(x, "actionID", js.undefined)
    
    inline def setActionName(value: BoundedString): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCategory(value: ActionCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: ActionDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocumentIdentifier(value: BoundedString): Self = StObject.set(x, "documentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdentifierUndefined: Self = StObject.set(x, "documentIdentifier", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
    
    inline def setExternalParameters(value: SsmDocumentExternalParameters): Self = StObject.set(x, "externalParameters", value.asInstanceOf[js.Any])
    
    inline def setExternalParametersUndefined: Self = StObject.set(x, "externalParameters", js.undefined)
    
    inline def setMustSucceedForCutover(value: Boolean): Self = StObject.set(x, "mustSucceedForCutover", value.asInstanceOf[js.Any])
    
    inline def setMustSucceedForCutoverUndefined: Self = StObject.set(x, "mustSucceedForCutover", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystemString): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    inline def setOrder(value: OrderType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setParameters(value: SsmDocumentParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setTimeoutSeconds(value: StrictlyPositiveInteger): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
