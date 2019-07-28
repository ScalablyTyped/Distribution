package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingExpression extends js.Object {
  def createBinding(target: js.Any): Binding
}

object BindingExpression {
  @scala.inline
  def apply(createBinding: js.Any => Binding): BindingExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
  
    __obj.asInstanceOf[BindingExpression]
  }
}

