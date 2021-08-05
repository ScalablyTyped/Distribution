package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotREGISTER_UPDATE
import typings.actionsOnGoogle.helperHelperMod.SoloHelper
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Argument
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2RegisterUpdateValue
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2RegisterUpdateValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2TriggerContextTimeContextFrequency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerupdateMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/registerupdate", "RegisterUpdate")
  @js.native
  class RegisterUpdate protected () extends SoloHelper[actionsDotintentDotREGISTER_UPDATE, GoogleActionsV2RegisterUpdateValueSpec] {
    /**
      * @param options RegisterUpdate options
      * @public
      */
    def this(options: RegisterUpdateOptions) = this()
  }
  
  type RegisterUpdateArgument = GoogleActionsV2RegisterUpdateValue
  
  trait RegisterUpdateOptions extends StObject {
    
    /**
      * The necessary arguments to fulfill the intent triggered on update.
      * These can be retrieved using {@link Arguments#get|conv.arguments.get}.
      * @public
      */
    var arguments: js.Array[GoogleActionsV2Argument]
    
    /**
      * The high-level frequency of the recurring update.
      * @public
      */
    var frequency: GoogleActionsV2TriggerContextTimeContextFrequency
    
    /**
      * The Dialogflow/Actions SDK intent name to be triggered when the update is received.
      * @public
      */
    var intent: String
  }
  object RegisterUpdateOptions {
    
    inline def apply(
      arguments: js.Array[GoogleActionsV2Argument],
      frequency: GoogleActionsV2TriggerContextTimeContextFrequency,
      intent: String
    ): RegisterUpdateOptions = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisterUpdateOptions]
    }
    
    extension [Self <: RegisterUpdateOptions](x: Self) {
      
      inline def setArguments(value: js.Array[GoogleActionsV2Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: GoogleActionsV2Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      inline def setFrequency(value: GoogleActionsV2TriggerContextTimeContextFrequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    }
  }
}
