package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3Action extends StObject {
  
  /**
    * Metadata associated with an action.
    */
  var actionMetadata: js.UndefOr[GoogleActionsOrdersV3ActionActionMetadata] = js.undefined
  
  /**
    * Action to take.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
  
  /**
    * Title or label of the action, displayed to the user.
    * Max allowed length is 100 chars.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Required: Type of action.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3ActionType] = js.undefined
}
object GoogleActionsOrdersV3Action {
  
  inline def apply(): GoogleActionsOrdersV3Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Action]
  }
  
  extension [Self <: GoogleActionsOrdersV3Action](x: Self) {
    
    inline def setActionMetadata(value: GoogleActionsOrdersV3ActionActionMetadata): Self = StObject.set(x, "actionMetadata", value.asInstanceOf[js.Any])
    
    inline def setActionMetadataUndefined: Self = StObject.set(x, "actionMetadata", js.undefined)
    
    inline def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
    
    inline def setOpenUrlActionUndefined: Self = StObject.set(x, "openUrlAction", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: GoogleActionsOrdersV3ActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
