package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPLACE
import typings.actionsOnGoogle.helperHelperMod.SoloHelper
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Location
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2PlaceValueSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/place", "Place")
  @js.native
  class Place protected () extends SoloHelper[actionsDotintentDotPLACE, GoogleActionsV2PlaceValueSpec] {
    /**
      * @param options Place options
      * @public
      */
    def this(options: PlaceOptions) = this()
  }
  
  type PlaceArgument = js.UndefOr[GoogleActionsV2Location]
  
  trait PlaceOptions extends StObject {
    
    /**
      * This is the context for seeking permissions.
      * For example: "To find a place to pick you up"
      * Prompt to user: "*To find a place to pick you up*, I just need to check your location.
      *     Can I get that from Google?".
      * @public
      */
    var context: String
    
    /**
      * This is the initial response by location sub-dialog.
      * For example: "Where do you want to get picked up?"
      * @public
      */
    var prompt: String
  }
  object PlaceOptions {
    
    @scala.inline
    def apply(context: String, prompt: String): PlaceOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaceOptions]
    }
    
    @scala.inline
    implicit class PlaceOptionsMutableBuilder[Self <: PlaceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    }
  }
}
