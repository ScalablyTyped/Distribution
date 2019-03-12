package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupFunctions extends js.Object {
  def bindingBehaviors(name: java.lang.String): js.Any
  def valueConverters(name: java.lang.String): js.Any
}

object LookupFunctions {
  @scala.inline
  def apply(bindingBehaviors: java.lang.String => js.Any, valueConverters: java.lang.String => js.Any): LookupFunctions = {
    val __obj = js.Dynamic.literal(bindingBehaviors = js.Any.fromFunction1(bindingBehaviors), valueConverters = js.Any.fromFunction1(valueConverters))
  
    __obj.asInstanceOf[LookupFunctions]
  }
}

