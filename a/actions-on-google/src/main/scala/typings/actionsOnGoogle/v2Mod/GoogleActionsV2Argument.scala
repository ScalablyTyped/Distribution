package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2Argument extends js.Object {
  
  /**
    * Specified when query pattern includes a `$org.schema.type.YesNo` type or
    * expected input has a built-in intent: `actions.intent.CONFIRMATION`.
    * NOTE: if the boolean value is missing, it represents `false`.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /**
    * Specified for the built-in intent: `actions.intent.DATETIME`.
    */
  var datetimeValue: js.UndefOr[GoogleActionsV2DateTime] = js.native
  
  /**
    * Extension whose type depends on the argument.
    * For example, if the argument name is `SIGN_IN` for the
    * `actions.intent.SIGN_IN` intent, then this extension will
    * contain a SignInValue value.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Specified for built-in intent: \"actions.intent.NUMBER\"
    */
  var floatValue: js.UndefOr[Double] = js.native
  
  /**
    * Specified when query pattern includes a $org.schema.type.Number type or
    * expected input has a built-in intent: \"assistant.intent.action.NUMBER\".
    */
  var intValue: js.UndefOr[String] = js.native
  
  /**
    * Name of the argument being provided for the input.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specified when query pattern includes a $org.schema.type.Location type or
    * expected input has a built-in intent: \"actions.intent.PLACE\".
    */
  var placeValue: js.UndefOr[GoogleActionsV2Location] = js.native
  
  /**
    * The raw text, typed or spoken, that provided the value for the argument.
    */
  var rawText: js.UndefOr[String] = js.native
  
  /**
    * Specified when an error was encountered while computing the argument. For
    * example, the built-in intent \"actions.intent.PLACE\" can return an error
    * status if the user denied the permission to access their device location.
    */
  var status: js.UndefOr[GoogleRpcStatus] = js.native
  
  /**
    * Specified when Google needs to pass data value in JSON format.
    */
  var structuredValue: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Specified when query pattern includes a `$org.schema.type.Text` type or
    * expected input has a built-in intent: `actions.intent.TEXT`, or
    * `actions.intent.OPTION`. Note that for the `OPTION` intent, we set the
    * `text_value` as option key, the `raw_text` above will indicate the raw
    * span in user's query.
    */
  var textValue: js.UndefOr[String] = js.native
}
object GoogleActionsV2Argument {
  
  @scala.inline
  def apply(): GoogleActionsV2Argument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Argument]
  }
  
  @scala.inline
  implicit class GoogleActionsV2ArgumentOps[Self <: GoogleActionsV2Argument] (val x: Self) extends AnyVal {
    
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    
    @scala.inline
    def setDatetimeValue(value: GoogleActionsV2DateTime): Self = this.set("datetimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatetimeValue: Self = this.set("datetimeValue", js.undefined)
    
    @scala.inline
    def setExtension(value: ApiClientObjectMap[_]): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setFloatValue(value: Double): Self = this.set("floatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatValue: Self = this.set("floatValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = this.set("intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntValue: Self = this.set("intValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlaceValue(value: GoogleActionsV2Location): Self = this.set("placeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceValue: Self = this.set("placeValue", js.undefined)
    
    @scala.inline
    def setRawText(value: String): Self = this.set("rawText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawText: Self = this.set("rawText", js.undefined)
    
    @scala.inline
    def setStatus(value: GoogleRpcStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStructuredValue(value: ApiClientObjectMap[_]): Self = this.set("structuredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructuredValue: Self = this.set("structuredValue", js.undefined)
    
    @scala.inline
    def setTextValue(value: String): Self = this.set("textValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextValue: Self = this.set("textValue", js.undefined)
  }
}
