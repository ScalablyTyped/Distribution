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
  def apply(
    bindingBehaviors: js.Function1[java.lang.String, js.Any],
    valueConverters: js.Function1[java.lang.String, js.Any]
  ): LookupFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindingBehaviors")(bindingBehaviors)
    __obj.updateDynamic("valueConverters")(valueConverters)
    __obj.asInstanceOf[LookupFunctions]
  }
}

