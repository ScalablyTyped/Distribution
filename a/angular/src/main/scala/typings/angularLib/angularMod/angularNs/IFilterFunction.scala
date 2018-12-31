package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilterFunction
  extends angularLib.angularMod.Global.Function {
  /**
    * By default, filters are only run once the input value changes. By marking the filter as `$stateful`, the filter will be run on every `$digest` to update the output. **This is strongly discouraged.**
    * See https://docs.angularjs.org/guide/filter#stateful-filters
    */
  @JSName("$stateful")
  var $stateful: js.UndefOr[scala.Boolean] = js.native
}

