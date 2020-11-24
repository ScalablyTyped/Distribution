package typings.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.Alias
import typings.awsLambda.anon.ConfirmationStatus
import typings.awsLambda.awsLambdaStrings.DialogCodeHook
import typings.awsLambda.awsLambdaStrings.FulfillmentCodeHook
import typings.awsLambda.awsLambdaStrings.Text
import typings.awsLambda.awsLambdaStrings.Voice_
import typings.awsLambda.awsLambdaStrings.`1Dot0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexEvent extends js.Object {
  
  var bot: Alias = js.native
  
  var currentIntent: ConfirmationStatus = js.native
  
  var inputTranscript: String = js.native
  
  var invocationSource: DialogCodeHook | FulfillmentCodeHook = js.native
  
  var messageVersion: `1Dot0` = js.native
  
  var outputDialogMode: Text | Voice_ = js.native
  
  var requestAttributes: StringDictionary[String] | Null = js.native
  
  var sessionAttributes: StringDictionary[String] = js.native
  
  var userId: String = js.native
}
object LexEvent {
  
  @scala.inline
  def apply(
    bot: Alias,
    currentIntent: ConfirmationStatus,
    inputTranscript: String,
    invocationSource: DialogCodeHook | FulfillmentCodeHook,
    messageVersion: `1Dot0`,
    outputDialogMode: Text | Voice_,
    sessionAttributes: StringDictionary[String],
    userId: String
  ): LexEvent = {
    val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], currentIntent = currentIntent.asInstanceOf[js.Any], inputTranscript = inputTranscript.asInstanceOf[js.Any], invocationSource = invocationSource.asInstanceOf[js.Any], messageVersion = messageVersion.asInstanceOf[js.Any], outputDialogMode = outputDialogMode.asInstanceOf[js.Any], sessionAttributes = sessionAttributes.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexEvent]
  }
  
  @scala.inline
  implicit class LexEventOps[Self <: LexEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBot(value: Alias): Self = this.set("bot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIntent(value: ConfirmationStatus): Self = this.set("currentIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTranscript(value: String): Self = this.set("inputTranscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationSource(value: DialogCodeHook | FulfillmentCodeHook): Self = this.set("invocationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageVersion(value: `1Dot0`): Self = this.set("messageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDialogMode(value: Text | Voice_): Self = this.set("outputDialogMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAttributes(value: StringDictionary[String]): Self = this.set("sessionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAttributes(value: StringDictionary[String]): Self = this.set("requestAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAttributesNull: Self = this.set("requestAttributes", null)
  }
}
