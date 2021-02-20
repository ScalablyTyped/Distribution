package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2PlaceValueSpec extends StObject {
  
  /**
    * Speech configuration for askForPlace dialog. The extension should be used
    * to define the PlaceDialogSpec configuration.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2DialogSpec] = js.native
}
object GoogleActionsV2PlaceValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2PlaceValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PlaceValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2PlaceValueSpecMutableBuilder[Self <: GoogleActionsV2PlaceValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogSpec(value: GoogleActionsV2DialogSpec): Self = StObject.set(x, "dialogSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogSpecUndefined: Self = StObject.set(x, "dialogSpec", js.undefined)
  }
}
