package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameExpression extends js.Object {
  def createBinding(target: js.Any): Binding
}

object NameExpression {
  @scala.inline
  def apply(createBinding: js.Any => Binding): NameExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
  
    __obj.asInstanceOf[NameExpression]
  }
}

