package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec extends StObject {
  
  /**
    * This is the question asked by confirmation sub-dialog. For example \"Are
    * you sure about that?\"
    */
  var requestConfirmationText: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec {
  
  inline def apply(): GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec]
  }
  
  extension [Self <: GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec](x: Self) {
    
    inline def setRequestConfirmationText(value: String): Self = StObject.set(x, "requestConfirmationText", value.asInstanceOf[js.Any])
    
    inline def setRequestConfirmationTextUndefined: Self = StObject.set(x, "requestConfirmationText", js.undefined)
  }
}
