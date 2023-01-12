package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDATETIME
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DateTime
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DateTimeValueSpec
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.SoloHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperDatetimeMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/datetime", "DateTime")
  @js.native
  open class DateTime protected () extends SoloHelper[actionsDotintentDotDATETIME, GoogleActionsV2DateTimeValueSpec] {
    /**
      * @param options DateTime options
      * @public
      */
    def this(options: DateTimeOptions) = this()
  }
  
  type DateTimeArgument = GoogleActionsV2DateTime
  
  trait DateTimeOptions extends StObject {
    
    /**
      * Prompts for the user
      * @public
      */
    var prompts: js.UndefOr[DateTimeOptionsPrompts] = js.undefined
  }
  object DateTimeOptions {
    
    inline def apply(): DateTimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateTimeOptions] (val x: Self) extends AnyVal {
      
      inline def setPrompts(value: DateTimeOptionsPrompts): Self = StObject.set(x, "prompts", value.asInstanceOf[js.Any])
      
      inline def setPromptsUndefined: Self = StObject.set(x, "prompts", js.undefined)
    }
  }
  
  trait DateTimeOptionsPrompts extends StObject {
    
    /**
      * The prompt used to specifically ask for the date if not provided by user.
      * If not provided, Google will use a generic prompt.
      * @public
      */
    var date: js.UndefOr[String] = js.undefined
    
    /**
      * The initial prompt used to ask for a date and time.
      * If not provided, Google will use a generic prompt.
      * @public
      */
    var initial: js.UndefOr[String] = js.undefined
    
    /**
      * The prompt used to specifically ask for the time if not provided by user.
      * If not provided, Google will use a generic prompt.
      * @public
      */
    var time: js.UndefOr[String] = js.undefined
  }
  object DateTimeOptionsPrompts {
    
    inline def apply(): DateTimeOptionsPrompts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeOptionsPrompts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateTimeOptionsPrompts] (val x: Self) extends AnyVal {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
