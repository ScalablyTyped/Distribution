package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2NewSurfaceValueSpec extends StObject {
  
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
  implicit class GoogleActionsV2NewSurfaceValueSpecMutableBuilder[Self <: GoogleActionsV2NewSurfaceValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setNotificationTitle(value: String): Self = StObject.set(x, "notificationTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTitleUndefined: Self = StObject.set(x, "notificationTitle", js.undefined)
  }
}
