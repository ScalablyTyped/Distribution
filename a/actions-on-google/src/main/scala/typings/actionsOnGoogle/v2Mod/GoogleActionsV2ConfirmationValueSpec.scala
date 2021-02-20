package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2ConfirmationValueSpec extends StObject {
  
  /**
    * Configures dialog that asks for confirmation.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec] = js.native
}
object GoogleActionsV2ConfirmationValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2ConfirmationValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ConfirmationValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2ConfirmationValueSpecMutableBuilder[Self <: GoogleActionsV2ConfirmationValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogSpec(value: GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec): Self = StObject.set(x, "dialogSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogSpecUndefined: Self = StObject.set(x, "dialogSpec", js.undefined)
  }
}
