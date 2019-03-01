package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallExpression extends js.Object {
  def createBinding(target: js.Any): Binding
}

object CallExpression {
  @scala.inline
  def apply(createBinding: js.Function1[js.Any, Binding]): CallExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBinding")(createBinding)
    __obj.asInstanceOf[CallExpression]
  }
}

