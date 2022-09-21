package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * see http://docs.angular-formly.com/docs/formlyvalidationmessages#addtemplateoptionvaluemessage
  */
trait IValidationMessages extends StObject {
  
  def addStringMessage(name: String, string: String): Unit
  
  def addTemplateOptionValueMessage(name: String, prop: String, prefix: String, suffix: String, alternate: String): Unit
  
  var messages: StringDictionary[
    js.Function3[/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope, String]
  ]
}
object IValidationMessages {
  
  inline def apply(
    addStringMessage: (String, String) => Unit,
    addTemplateOptionValueMessage: (String, String, String, String, String) => Unit,
    messages: StringDictionary[
      js.Function3[/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope, String]
    ]
  ): IValidationMessages = {
    val __obj = js.Dynamic.literal(addStringMessage = js.Any.fromFunction2(addStringMessage), addTemplateOptionValueMessage = js.Any.fromFunction5(addTemplateOptionValueMessage), messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationMessages]
  }
  
  extension [Self <: IValidationMessages](x: Self) {
    
    inline def setAddStringMessage(value: (String, String) => Unit): Self = StObject.set(x, "addStringMessage", js.Any.fromFunction2(value))
    
    inline def setAddTemplateOptionValueMessage(value: (String, String, String, String, String) => Unit): Self = StObject.set(x, "addTemplateOptionValueMessage", js.Any.fromFunction5(value))
    
    inline def setMessages(
      value: StringDictionary[
          js.Function3[/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope, String]
        ]
    ): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
