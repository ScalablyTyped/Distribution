package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.Alias
import typings.awsLambda.anon.ConfirmationStatus
import typings.awsLambda.anon.Content
import typings.awsLambda.anon.ContentType
import typings.awsLambda.anon.OriginalValue
import typings.awsLambda.awsLambdaStrings.Close
import typings.awsLambda.awsLambdaStrings.ConfirmIntent
import typings.awsLambda.awsLambdaStrings.Delegate
import typings.awsLambda.awsLambdaStrings.DialogCodeHook
import typings.awsLambda.awsLambdaStrings.ElicitIntent
import typings.awsLambda.awsLambdaStrings.ElicitSlot
import typings.awsLambda.awsLambdaStrings.Failed_
import typings.awsLambda.awsLambdaStrings.Fulfilled
import typings.awsLambda.awsLambdaStrings.FulfillmentCodeHook
import typings.awsLambda.awsLambdaStrings.Text
import typings.awsLambda.awsLambdaStrings.Voice_
import typings.awsLambda.awsLambdaStrings.`1Dot0`
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lexMod {
  
  type LexCallback = Callback[LexResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.lexMod.LexDialogActionClose
    - typings.awsLambda.lexMod.LexDialogActionElicitIntent
    - typings.awsLambda.lexMod.LexDialogActionElicitSlot
    - typings.awsLambda.lexMod.LexDialogActionConfirmIntent
    - typings.awsLambda.lexMod.LexDialogActionDelegate
  */
  trait LexDialogAction extends StObject
  object LexDialogAction {
    
    @scala.inline
    def LexDialogActionClose(fulfillmentState: Fulfilled | Failed_): typings.awsLambda.lexMod.LexDialogActionClose = {
      val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Close")
      __obj.asInstanceOf[typings.awsLambda.lexMod.LexDialogActionClose]
    }
    
    @scala.inline
    def LexDialogActionConfirmIntent(intentName: String, slots: StringDictionary[String | Null]): typings.awsLambda.lexMod.LexDialogActionConfirmIntent = {
      val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ConfirmIntent")
      __obj.asInstanceOf[typings.awsLambda.lexMod.LexDialogActionConfirmIntent]
    }
    
    @scala.inline
    def LexDialogActionDelegate(slots: StringDictionary[String | Null]): typings.awsLambda.lexMod.LexDialogActionDelegate = {
      val __obj = js.Dynamic.literal(slots = slots.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Delegate")
      __obj.asInstanceOf[typings.awsLambda.lexMod.LexDialogActionDelegate]
    }
    
    @scala.inline
    def LexDialogActionElicitIntent(): typings.awsLambda.lexMod.LexDialogActionElicitIntent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ElicitIntent")
      __obj.asInstanceOf[typings.awsLambda.lexMod.LexDialogActionElicitIntent]
    }
    
    @scala.inline
    def LexDialogActionElicitSlot(intentName: String, slotToElicit: String, slots: StringDictionary[String | Null]): typings.awsLambda.lexMod.LexDialogActionElicitSlot = {
      val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slotToElicit = slotToElicit.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ElicitSlot")
      __obj.asInstanceOf[typings.awsLambda.lexMod.LexDialogActionElicitSlot]
    }
  }
  
  trait LexDialogActionBase extends StObject {
    
    var message: js.UndefOr[Content] = js.undefined
    
    var responseCard: js.UndefOr[ContentType] = js.undefined
    
    var `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent
  }
  object LexDialogActionBase {
    
    @scala.inline
    def apply(`type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent): LexDialogActionBase = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexDialogActionBase]
    }
    
    @scala.inline
    implicit class LexDialogActionBaseMutableBuilder[Self <: LexDialogActionBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: Content): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setResponseCard(value: ContentType): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
      
      @scala.inline
      def setType(value: Close | ElicitIntent | ElicitSlot | ConfirmIntent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LexDialogActionClose
    extends StObject
       with LexDialogActionBase
       with LexDialogAction {
    
    var fulfillmentState: Fulfilled | Failed_
    
    @JSName("type")
    var type_LexDialogActionClose: Close
  }
  object LexDialogActionClose {
    
    @scala.inline
    def apply(fulfillmentState: Fulfilled | Failed_): LexDialogActionClose = {
      val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Close")
      __obj.asInstanceOf[LexDialogActionClose]
    }
    
    @scala.inline
    implicit class LexDialogActionCloseMutableBuilder[Self <: LexDialogActionClose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFulfillmentState(value: Fulfilled | Failed_): Self = StObject.set(x, "fulfillmentState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LexDialogActionConfirmIntent
    extends StObject
       with LexDialogActionBase
       with LexDialogAction {
    
    var intentName: String
    
    var slots: StringDictionary[String | Null]
    
    @JSName("type")
    var type_LexDialogActionConfirmIntent: ConfirmIntent
  }
  object LexDialogActionConfirmIntent {
    
    @scala.inline
    def apply(intentName: String, slots: StringDictionary[String | Null]): LexDialogActionConfirmIntent = {
      val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ConfirmIntent")
      __obj.asInstanceOf[LexDialogActionConfirmIntent]
    }
    
    @scala.inline
    implicit class LexDialogActionConfirmIntentMutableBuilder[Self <: LexDialogActionConfirmIntent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntentName(value: String): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlots(value: StringDictionary[String | Null]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ConfirmIntent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LexDialogActionDelegate
    extends StObject
       with LexDialogAction {
    
    var slots: StringDictionary[String | Null]
    
    var `type`: Delegate
  }
  object LexDialogActionDelegate {
    
    @scala.inline
    def apply(slots: StringDictionary[String | Null]): LexDialogActionDelegate = {
      val __obj = js.Dynamic.literal(slots = slots.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Delegate")
      __obj.asInstanceOf[LexDialogActionDelegate]
    }
    
    @scala.inline
    implicit class LexDialogActionDelegateMutableBuilder[Self <: LexDialogActionDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSlots(value: StringDictionary[String | Null]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Delegate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LexDialogActionElicitIntent
    extends StObject
       with LexDialogActionBase
       with LexDialogAction {
    
    @JSName("type")
    var type_LexDialogActionElicitIntent: ElicitIntent
  }
  object LexDialogActionElicitIntent {
    
    @scala.inline
    def apply(): LexDialogActionElicitIntent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ElicitIntent")
      __obj.asInstanceOf[LexDialogActionElicitIntent]
    }
    
    @scala.inline
    implicit class LexDialogActionElicitIntentMutableBuilder[Self <: LexDialogActionElicitIntent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ElicitIntent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LexDialogActionElicitSlot
    extends StObject
       with LexDialogActionBase
       with LexDialogAction {
    
    var intentName: String
    
    var slotToElicit: String
    
    var slots: StringDictionary[String | Null]
    
    @JSName("type")
    var type_LexDialogActionElicitSlot: ElicitSlot
  }
  object LexDialogActionElicitSlot {
    
    @scala.inline
    def apply(intentName: String, slotToElicit: String, slots: StringDictionary[String | Null]): LexDialogActionElicitSlot = {
      val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slotToElicit = slotToElicit.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ElicitSlot")
      __obj.asInstanceOf[LexDialogActionElicitSlot]
    }
    
    @scala.inline
    implicit class LexDialogActionElicitSlotMutableBuilder[Self <: LexDialogActionElicitSlot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntentName(value: String): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotToElicit(value: String): Self = StObject.set(x, "slotToElicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlots(value: StringDictionary[String | Null]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ElicitSlot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LexEvent extends StObject {
    
    var bot: Alias
    
    var currentIntent: ConfirmationStatus
    
    var inputTranscript: String
    
    var invocationSource: DialogCodeHook | FulfillmentCodeHook
    
    var messageVersion: `1Dot0`
    
    var outputDialogMode: Text | Voice_
    
    var requestAttributes: StringDictionary[String] | Null
    
    var sessionAttributes: StringDictionary[String]
    
    var userId: String
  }
  object LexEvent {
    
    @scala.inline
    def apply(
      bot: Alias,
      currentIntent: ConfirmationStatus,
      inputTranscript: String,
      invocationSource: DialogCodeHook | FulfillmentCodeHook,
      outputDialogMode: Text | Voice_,
      sessionAttributes: StringDictionary[String],
      userId: String
    ): LexEvent = {
      val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], currentIntent = currentIntent.asInstanceOf[js.Any], inputTranscript = inputTranscript.asInstanceOf[js.Any], invocationSource = invocationSource.asInstanceOf[js.Any], messageVersion = "1.0", outputDialogMode = outputDialogMode.asInstanceOf[js.Any], sessionAttributes = sessionAttributes.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], requestAttributes = null)
      __obj.asInstanceOf[LexEvent]
    }
    
    @scala.inline
    implicit class LexEventMutableBuilder[Self <: LexEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBot(value: Alias): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentIntent(value: ConfirmationStatus): Self = StObject.set(x, "currentIntent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTranscript(value: String): Self = StObject.set(x, "inputTranscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationSource(value: DialogCodeHook | FulfillmentCodeHook): Self = StObject.set(x, "invocationSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageVersion(value: `1Dot0`): Self = StObject.set(x, "messageVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputDialogMode(value: Text | Voice_): Self = StObject.set(x, "outputDialogMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestAttributes(value: StringDictionary[String]): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestAttributesNull: Self = StObject.set(x, "requestAttributes", null)
      
      @scala.inline
      def setSessionAttributes(value: StringDictionary[String]): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait LexGenericAttachment extends StObject {
    
    var attachmentLinkUrl: String
    
    var buttons: js.Array[typings.awsLambda.anon.Text]
    
    var imageUrl: String
    
    var subTitle: String
    
    var title: String
  }
  object LexGenericAttachment {
    
    @scala.inline
    def apply(
      attachmentLinkUrl: String,
      buttons: js.Array[typings.awsLambda.anon.Text],
      imageUrl: String,
      subTitle: String,
      title: String
    ): LexGenericAttachment = {
      val __obj = js.Dynamic.literal(attachmentLinkUrl = attachmentLinkUrl.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexGenericAttachment]
    }
    
    @scala.inline
    implicit class LexGenericAttachmentMutableBuilder[Self <: LexGenericAttachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachmentLinkUrl(value: String): Self = StObject.set(x, "attachmentLinkUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtons(value: js.Array[typings.awsLambda.anon.Text]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsVarargs(value: typings.awsLambda.anon.Text*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type LexHandler = Handler[LexEvent, LexResult]
  
  trait LexResult extends StObject {
    
    var dialogAction: LexDialogAction
    
    var sessionAttributes: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object LexResult {
    
    @scala.inline
    def apply(dialogAction: LexDialogAction): LexResult = {
      val __obj = js.Dynamic.literal(dialogAction = dialogAction.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexResult]
    }
    
    @scala.inline
    implicit class LexResultMutableBuilder[Self <: LexResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDialogAction(value: LexDialogAction): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionAttributes(value: StringDictionary[String]): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionAttributesUndefined: Self = StObject.set(x, "sessionAttributes", js.undefined)
    }
  }
  
  type LexSlotDetails = StringDictionary[OriginalValue]
  
  trait LexSlotResolution extends StObject {
    
    var value: String
  }
  object LexSlotResolution {
    
    @scala.inline
    def apply(value: String): LexSlotResolution = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexSlotResolution]
    }
    
    @scala.inline
    implicit class LexSlotResolutionMutableBuilder[Self <: LexSlotResolution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
