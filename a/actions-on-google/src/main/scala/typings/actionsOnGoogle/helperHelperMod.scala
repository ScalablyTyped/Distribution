package typings.actionsOnGoogle

import typings.actionsOnGoogle.commonMod.ProtoAny
import typings.actionsOnGoogle.conversationConversationMod.InputValueSpec
import typings.actionsOnGoogle.conversationConversationMod.Intent
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2ExpectedIntent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperHelperMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/helper", "Helper")
  @js.native
  class Helper[TIntent /* <: Intent */, TValueSpec] protected () extends GoogleActionsV2ExpectedIntent {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
    
    @JSName("inputValueData")
    var inputValueData_Helper: ProtoAny[InputValueSpec, TValueSpec] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/helper", "SoloHelper")
  @js.native
  class SoloHelper[TIntent /* <: Intent */, TValueSpec] protected () extends Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @js.native
  trait HelperOptions[TIntent /* <: Intent */, TValueSpec] extends StObject {
    
    var data: js.UndefOr[TValueSpec] = js.native
    
    var intent: TIntent = js.native
    
    var `type`: InputValueSpec = js.native
  }
  object HelperOptions {
    
    @scala.inline
    def apply[TIntent /* <: Intent */, TValueSpec](intent: TIntent, `type`: InputValueSpec): HelperOptions[TIntent, TValueSpec] = {
      val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelperOptions[TIntent, TValueSpec]]
    }
    
    @scala.inline
    implicit class HelperOptionsMutableBuilder[Self <: HelperOptions[_, _], TIntent /* <: Intent */, TValueSpec] (val x: Self with (HelperOptions[TIntent, TValueSpec])) extends AnyVal {
      
      @scala.inline
      def setData(value: TValueSpec): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setIntent(value: TIntent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: InputValueSpec): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
