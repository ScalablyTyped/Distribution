package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2NewSurfaceValueSpec extends js.Object {
  
  /**
    * The list of capabilities required from the surface. Eg,
    * [\"actions.capability.SCREEN_OUTPUT\"]
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Context describing the content the user will receive on the new surface.
    * Eg, \"[Sure, I know of 10 that are really popular. The highest-rated one is
    * at Mount Marcy.] Is it okay if I send that to your phone?\"
    */
  var context: js.UndefOr[String] = js.native
  
  /**
    * Title of the notification which prompts the user to continue on the new
    * surface.
    */
  var notificationTitle: js.UndefOr[String] = js.native
}
object GoogleActionsV2NewSurfaceValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2NewSurfaceValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2NewSurfaceValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2NewSurfaceValueSpecOps[Self <: GoogleActionsV2NewSurfaceValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapabilitiesVarargs(value: String*): Self = this.set("capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setNotificationTitle(value: String): Self = this.set("notificationTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTitle: Self = this.set("notificationTitle", js.undefined)
  }
}
