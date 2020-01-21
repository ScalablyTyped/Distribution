package typings.agGrid.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextParams extends js.Object {
  var beans: js.Array[_]
  var components: js.Array[ComponentMeta]
  var debug: Boolean
  var overrideBeans: js.Array[_]
  var seed: js.Any
}

object ContextParams {
  @scala.inline
  def apply(
    beans: js.Array[_],
    components: js.Array[ComponentMeta],
    debug: Boolean,
    overrideBeans: js.Array[_],
    seed: js.Any
  ): ContextParams = {
    val __obj = js.Dynamic.literal(beans = beans.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], overrideBeans = overrideBeans.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContextParams]
  }
}

