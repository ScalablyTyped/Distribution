package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2DialogSpec extends StObject {
  
  /**
    * Holds helper specific dialog specs if any. For example:
    * ConfirmationDialogSpec for confirmation helper.
    */
  var `extension`: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
}
object GoogleActionsV2DialogSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2DialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DialogSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DialogSpecMutableBuilder[Self <: GoogleActionsV2DialogSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
  }
}
