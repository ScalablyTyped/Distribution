package typings
package adoneLib.adoneNs.promiseNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyAllOptions extends js.Object {
  /**
    * Context to bind to new functions
    */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * Function to filter keys
    */
  var filter: js.UndefOr[js.Function1[/* key */ java.lang.String, scala.Boolean]] = js.undefined
  /**
    * Suffix to use for keys
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object PromisifyAllOptions {
  @scala.inline
  def apply(
    context: js.Object = null,
    filter: /* key */ java.lang.String => scala.Boolean = null,
    suffix: java.lang.String = null
  ): PromisifyAllOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[PromisifyAllOptions]
  }
}

