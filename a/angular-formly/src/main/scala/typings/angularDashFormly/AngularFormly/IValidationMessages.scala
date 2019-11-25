package typings.angularDashFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/formlyvalidationmessages#addtemplateoptionvaluemessage
	 */
trait IValidationMessages extends js.Object {
  var messages: StringDictionary[
    js.Function3[/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope, String]
  ]
  def addStringMessage(name: String, string: String): Unit
  def addTemplateOptionValueMessage(name: String, prop: String, prefix: String, suffix: String, alternate: String): Unit
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
}

