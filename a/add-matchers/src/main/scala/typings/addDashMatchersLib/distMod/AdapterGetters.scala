package typings
package addDashMatchersLib.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdapterGetters extends js.Object {
  var getJasmineV1Adapter: js.Any
  var getJasmineV2Adapter: js.Any
  var getJestAdapter: js.Any
}

object AdapterGetters {
  @scala.inline
  def apply(getJasmineV1Adapter: js.Any, getJasmineV2Adapter: js.Any, getJestAdapter: js.Any): AdapterGetters = {
    val __obj = js.Dynamic.literal(getJasmineV1Adapter = getJasmineV1Adapter, getJasmineV2Adapter = getJasmineV2Adapter, getJestAdapter = getJestAdapter)
  
    __obj.asInstanceOf[AdapterGetters]
  }
}

