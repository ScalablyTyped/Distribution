package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerExpression extends js.Object {
  def createBinding(target: js.Any): Binding
}

object ListenerExpression {
  @scala.inline
  def apply(createBinding: js.Function1[js.Any, Binding]): ListenerExpression = {
    val __obj = js.Dynamic.literal(createBinding = createBinding)
  
    __obj.asInstanceOf[ListenerExpression]
  }
}

