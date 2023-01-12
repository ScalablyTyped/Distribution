package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2ConfirmationValueSpec extends StObject {
  
  /**
    * Configures dialog that asks for confirmation.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec] = js.undefined
}
object GoogleActionsV2ConfirmationValueSpec {
  
  inline def apply(): GoogleActionsV2ConfirmationValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ConfirmationValueSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2ConfirmationValueSpec] (val x: Self) extends AnyVal {
    
    inline def setDialogSpec(value: GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec): Self = StObject.set(x, "dialogSpec", value.asInstanceOf[js.Any])
    
    inline def setDialogSpecUndefined: Self = StObject.set(x, "dialogSpec", js.undefined)
  }
}
