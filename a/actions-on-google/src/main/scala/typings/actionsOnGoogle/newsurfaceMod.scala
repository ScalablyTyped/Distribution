package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNEW_SURFACE
import typings.actionsOnGoogle.helperHelperMod.SoloHelper
import typings.actionsOnGoogle.surfaceMod.SurfaceCapability
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2NewSurfaceValue
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2NewSurfaceValueSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newsurfaceMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/newsurface", "NewSurface")
  @js.native
  class NewSurface protected () extends SoloHelper[actionsDotintentDotNEW_SURFACE, GoogleActionsV2NewSurfaceValueSpec] {
    /**
      * @param options NewSurface options
      * @public
      */
    def this(options: NewSurfaceOptions) = this()
  }
  
  type NewSurfaceArgument = GoogleActionsV2NewSurfaceValue
  
  trait NewSurfaceOptions extends StObject {
    
    /**
      * The list of capabilities required in the surface.
      * @public
      */
    var capabilities: SurfaceCapability | js.Array[SurfaceCapability]
    
    /**
      * Context why new surface is requested.
      * It's the TTS prompt prefix (action phrase) we ask the user.
      * @public
      */
    var context: String
    
    /**
      * Title of the notification appearing on new surface device.
      * @public
      */
    var notification: String
  }
  object NewSurfaceOptions {
    
    @scala.inline
    def apply(
      capabilities: SurfaceCapability | js.Array[SurfaceCapability],
      context: String,
      notification: String
    ): NewSurfaceOptions = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewSurfaceOptions]
    }
    
    @scala.inline
    implicit class NewSurfaceOptionsMutableBuilder[Self <: NewSurfaceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapabilities(value: SurfaceCapability | js.Array[SurfaceCapability]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilitiesVarargs(value: SurfaceCapability*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotification(value: String): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}
