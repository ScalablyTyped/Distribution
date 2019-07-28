package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerExpression extends js.Object {
  def createBinding(target: js.Any): Binding
}

object ListenerExpression {
  @scala.inline
  def apply(createBinding: js.Any => Binding): ListenerExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
  
    __obj.asInstanceOf[ListenerExpression]
  }
}

