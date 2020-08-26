package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * see http://docs.angular-formly.com/docs/formlyvalidationmessages#addtemplateoptionvaluemessage
  */
@js.native
trait IValidationMessages extends js.Object {
  var messages: StringDictionary[
    js.Function3[/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope, String]
  ] = js.native
  def addStringMessage(name: String, string: String): Unit = js.native
  def addTemplateOptionValueMessage(name: String, prop: String, prefix: String, suffix: String, alternate: String): Unit = js.native
}

object IValidationMessages {
  @scala.inline
  def apply(
    addStringMessage: (String, String) => Unit,
    addTemplateOptionValueMessage: (String, String, String, String, String) => Unit,
    messages: StringDictionary[
      js.Function3[/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope, String]
    ]
  ): IValidationMessages = {
    val __obj = js.Dynamic.literal(addStringMessage = js.Any.fromFunction2(addStringMessage), addTemplateOptionValueMessage = js.Any.fromFunction5(addTemplateOptionValueMessage), messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationMessages]
  }
  @scala.inline
  implicit class IValidationMessagesOps[Self <: IValidationMessages] (val x: Self) extends AnyVal {
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
    def setAddStringMessage(value: (String, String) => Unit): Self = this.set("addStringMessage", js.Any.fromFunction2(value))
    @scala.inline
    def setAddTemplateOptionValueMessage(value: (String, String, String, String, String) => Unit): Self = this.set("addTemplateOptionValueMessage", js.Any.fromFunction5(value))
    @scala.inline
    def setMessages(
      value: StringDictionary[
          js.Function3[/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope, String]
        ]
    ): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
  
}

