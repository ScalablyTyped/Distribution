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

