package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameExpression extends js.Object {
  def createBinding(target: js.Any): Binding
}

object NameExpression {
  @scala.inline
  def apply(createBinding: js.Function1[js.Any, Binding]): NameExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBinding")(createBinding)
    __obj.asInstanceOf[NameExpression]
  }
}

