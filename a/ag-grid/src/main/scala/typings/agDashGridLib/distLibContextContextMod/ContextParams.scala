package typings
package agDashGridLib.distLibContextContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextParams extends js.Object {
  var beans: js.Array[_]
  var components: js.Array[ComponentMeta]
  var debug: scala.Boolean
  var overrideBeans: js.Array[_]
  var seed: js.Any
}

object ContextParams {
  @scala.inline
  def apply(
    beans: js.Array[_],
    components: js.Array[ComponentMeta],
    debug: scala.Boolean,
    overrideBeans: js.Array[_],
    seed: js.Any
  ): ContextParams = {
    val __obj = js.Dynamic.literal(beans = beans, components = components, debug = debug, overrideBeans = overrideBeans, seed = seed)
  
    __obj.asInstanceOf[ContextParams]
  }
}

