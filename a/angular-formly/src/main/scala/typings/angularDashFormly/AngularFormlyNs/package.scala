package typings.angularDashFormly

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AngularFormlyNs {
  /**
  	 * see http://docs.angular-formly.com/docs/formly-expressions#expressionproperties-validators--messages
  	 */
  type IExpressionFunction = js.Function3[/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope, js.Any]
  type IFieldArray = js.Array[IFieldConfigurationObject | IFieldGroup]
  type ITemplateManipulator = js.Function3[
    /* template */ String | HTMLElement, 
    /* options */ js.Object, 
    /* scope */ ITemplateScope, 
    String | HTMLElement
  ]
}
