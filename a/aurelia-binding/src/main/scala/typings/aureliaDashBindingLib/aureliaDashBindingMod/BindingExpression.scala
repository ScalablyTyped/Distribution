package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingExpression extends js.Object {
  def createBinding(target: js.Any): Binding
}

object BindingExpression {
  @scala.inline
  def apply(createBinding: js.Function1[js.Any, Binding]): BindingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBinding")(createBinding)
    __obj.asInstanceOf[BindingExpression]
  }
}

