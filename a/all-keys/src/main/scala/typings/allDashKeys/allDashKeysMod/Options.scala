package typings.allDashKeys.allDashKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Include `Object.prototype` properties like `isPrototypeOf`.
  		@default true
  		*/
  val includeObjectPrototype: js.UndefOr[Boolean] = js.undefined
  /**
  		Include [`Symbol`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol) keys.
  		@default true
  		*/
  val includeSymbols: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    includeObjectPrototype: js.UndefOr[Boolean] = js.undefined,
    includeSymbols: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeObjectPrototype)) __obj.updateDynamic("includeObjectPrototype")(includeObjectPrototype.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSymbols)) __obj.updateDynamic("includeSymbols")(includeSymbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

