package typings.angularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AngularFormly {
  /**
  	 * see http://docs.angular-formly.com/docs/formly-expressions#expressionproperties-validators--messages
  	 */
  type IExpressionFunction = js.Function3[
    /* $viewValue */ js.Any, 
    /* $modelValue */ js.Any, 
    /* scope */ typings.angularFormly.AngularFormly.ITemplateScope, 
    js.Any
  ]
  type IFieldArray = js.Array[
    typings.angularFormly.AngularFormly.IFieldConfigurationObject | typings.angularFormly.AngularFormly.IFieldGroup
  ]
  type ITemplateManipulator = js.Function3[
    /* template */ java.lang.String | typings.std.HTMLElement, 
    /* options */ js.Object, 
    /* scope */ typings.angularFormly.AngularFormly.ITemplateScope, 
    java.lang.String | typings.std.HTMLElement
  ]
}
