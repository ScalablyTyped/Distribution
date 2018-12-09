package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DebounceOptions extends js.Object {
  /**
                   * whether to invoke on the leading edge
                   */
  var leading: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * whether to invoke on the trailing edge, if both are true the trailing call is performed only if the function is invoked more that once during the interval
                   */
  var trailing: js.UndefOr[scala.Boolean] = js.undefined
}

