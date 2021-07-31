package typings.actionsOnGoogle.v2Mod

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
  
  @scala.inline
  def apply(): GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpecMutableBuilder[Self <: GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestConfirmationText(value: String): Self = StObject.set(x, "requestConfirmationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestConfirmationTextUndefined: Self = StObject.set(x, "requestConfirmationText", js.undefined)
  }
}
