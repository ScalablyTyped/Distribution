package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotLINK
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2LinkValueSpec
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperDeeplinkMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/deeplink", "DeepLink")
  @js.native
  open class DeepLink protected () extends Helper[actionsDotintentDotLINK, GoogleActionsV2LinkValueSpec] {
    /**
      * @param options DeepLink options
      * @deprecated
      * @public
      */
    def this(options: DeepLinkOptions) = this()
  }
  
  type DeepLinkArgument = Unit
  
  trait DeepLinkOptions extends StObject {
    
    /**
      * Android app package name to which to link.
      * @public
      */
    @JSName("package")
    var _package: String
    
    /**
      * The name of the link destination.
      * @public
      */
    var destination: String
    
    /**
      * The reason to transfer the user. This may be appended to a Google-specified prompt.
      * @public
      */
    var reason: js.UndefOr[String] = js.undefined
    
    /**
      * URL of Android deep link.
      * @public
      */
    var url: String
  }
  object DeepLinkOptions {
    
    inline def apply(_package: String, destination: String, url: String): DeepLinkOptions = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepLinkOptions]
    }
    
    extension [Self <: DeepLinkOptions](x: Self) {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
}
