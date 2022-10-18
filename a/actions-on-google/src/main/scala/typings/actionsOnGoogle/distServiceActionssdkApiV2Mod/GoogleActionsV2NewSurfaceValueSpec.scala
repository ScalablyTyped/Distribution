package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2NewSurfaceValueSpec extends StObject {
  
  /**
    * The list of capabilities required from the surface. Eg,
    * [\"actions.capability.SCREEN_OUTPUT\"]
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Context describing the content the user will receive on the new surface.
    * Eg, \"[Sure, I know of 10 that are really popular. The highest-rated one is
    * at Mount Marcy.] Is it okay if I send that to your phone?\"
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the notification which prompts the user to continue on the new
    * surface.
    */
  var notificationTitle: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2NewSurfaceValueSpec {
  
  inline def apply(): GoogleActionsV2NewSurfaceValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2NewSurfaceValueSpec]
  }
  
  extension [Self <: GoogleActionsV2NewSurfaceValueSpec](x: Self) {
    
    inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setNotificationTitle(value: String): Self = StObject.set(x, "notificationTitle", value.asInstanceOf[js.Any])
    
    inline def setNotificationTitleUndefined: Self = StObject.set(x, "notificationTitle", js.undefined)
  }
}
