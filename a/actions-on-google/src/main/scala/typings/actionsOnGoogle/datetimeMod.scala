package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDATETIME
import typings.actionsOnGoogle.helperHelperMod.SoloHelper
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2DateTime
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2DateTimeValueSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datetimeMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/datetime", "DateTime")
  @js.native
  class DateTime protected () extends SoloHelper[actionsDotintentDotDATETIME, GoogleActionsV2DateTimeValueSpec] {
    /**
      * @param options DateTime options
      * @public
      */
    def this(options: DateTimeOptions) = this()
  }
  
  type DateTimeArgument = GoogleActionsV2DateTime
  
  @js.native
  trait DateTimeOptions extends StObject {
    
    /**
      * Prompts for the user
      * @public
      */
    var prompts: js.UndefOr[DateTimeOptionsPrompts] = js.native
  }
  object DateTimeOptions {
    
    @scala.inline
    def apply(): DateTimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeOptions]
    }
    
    @scala.inline
    implicit class DateTimeOptionsMutableBuilder[Self <: DateTimeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrompts(value: DateTimeOptionsPrompts): Self = StObject.set(x, "prompts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptsUndefined: Self = StObject.set(x, "prompts", js.undefined)
    }
  }
  
  @js.native
  trait DateTimeOptionsPrompts extends StObject {
    
    /**
      * The prompt used to specifically ask for the date if not provided by user.
      * If not provided, Google will use a generic prompt.
      * @public
      */
    var date: js.UndefOr[String] = js.native
    
    /**
      * The initial prompt used to ask for a date and time.
      * If not provided, Google will use a generic prompt.
      * @public
      */
    var initial: js.UndefOr[String] = js.native
    
    /**
      * The prompt used to specifically ask for the time if not provided by user.
      * If not provided, Google will use a generic prompt.
      * @public
      */
    var time: js.UndefOr[String] = js.native
  }
  object DateTimeOptionsPrompts {
    
    @scala.inline
    def apply(): DateTimeOptionsPrompts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeOptionsPrompts]
    }
    
    @scala.inline
    implicit class DateTimeOptionsPromptsMutableBuilder[Self <: DateTimeOptionsPrompts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
