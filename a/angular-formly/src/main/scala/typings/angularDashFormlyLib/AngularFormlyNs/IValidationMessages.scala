package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/formlyvalidationmessages#addtemplateoptionvaluemessage
	 */
trait IValidationMessages extends js.Object {
  var messages: org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* $viewValue */ js.Any, 
      /* $modelValue */ js.Any, 
      /* scope */ ITemplateScope, 
      java.lang.String
    ]
  ]
  def addStringMessage(name: java.lang.String, string: java.lang.String): scala.Unit
  def addTemplateOptionValueMessage(
    name: java.lang.String,
    prop: java.lang.String,
    prefix: java.lang.String,
    suffix: java.lang.String,
    alternate: java.lang.String
  ): scala.Unit
}

object IValidationMessages {
  @scala.inline
  def apply(
    addStringMessage: (java.lang.String, java.lang.String) => scala.Unit,
    addTemplateOptionValueMessage: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    messages: org.scalablytyped.runtime.StringDictionary[
      js.Function3[
        /* $viewValue */ js.Any, 
        /* $modelValue */ js.Any, 
        /* scope */ ITemplateScope, 
        java.lang.String
      ]
    ]
  ): IValidationMessages = {
    val __obj = js.Dynamic.literal(addStringMessage = js.Any.fromFunction2(addStringMessage), addTemplateOptionValueMessage = js.Any.fromFunction5(addTemplateOptionValueMessage), messages = messages)
  
    __obj.asInstanceOf[IValidationMessages]
  }
}

