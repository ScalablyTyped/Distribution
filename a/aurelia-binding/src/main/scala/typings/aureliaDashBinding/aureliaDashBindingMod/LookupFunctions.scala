package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupFunctions extends js.Object {
  def bindingBehaviors(name: String): js.Any
  def valueConverters(name: String): js.Any
}

object LookupFunctions {
  @scala.inline
  def apply(bindingBehaviors: String => js.Any, valueConverters: String => js.Any): LookupFunctions = {
    val __obj = js.Dynamic.literal(bindingBehaviors = js.Any.fromFunction1(bindingBehaviors), valueConverters = js.Any.fromFunction1(valueConverters))
  
    __obj.asInstanceOf[LookupFunctions]
  }
}

