package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2DateTimeValueSpec extends StObject {
  
  /**
    * Control datetime prompts.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec] = js.native
}
object GoogleActionsV2DateTimeValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2DateTimeValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DateTimeValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DateTimeValueSpecMutableBuilder[Self <: GoogleActionsV2DateTimeValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogSpec(value: GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec): Self = StObject.set(x, "dialogSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogSpecUndefined: Self = StObject.set(x, "dialogSpec", js.undefined)
  }
}
