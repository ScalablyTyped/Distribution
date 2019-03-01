package typings
package allDashKeysLib.allDashKeysMod.allKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Include `Object.prototype` properties like `isPrototypeOf`.
    * @default true
    */
  var includeObjectPrototype: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include [Symbol](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol) keys.
    * @default true
    */
  var includeSymbols: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    includeObjectPrototype: js.UndefOr[scala.Boolean] = js.undefined,
    includeSymbols: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeObjectPrototype)) __obj.updateDynamic("includeObjectPrototype")(includeObjectPrototype)
    if (!js.isUndefined(includeSymbols)) __obj.updateDynamic("includeSymbols")(includeSymbols)
    __obj.asInstanceOf[Options]
  }
}

