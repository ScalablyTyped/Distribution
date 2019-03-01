package typings
package adoneLib.adoneNs.promiseNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyOptions extends js.Object {
  /**
    * Context to bind to new function
    */
  var context: js.UndefOr[js.Object] = js.undefined
}

object PromisifyOptions {
  @scala.inline
  def apply(context: js.Object = null): PromisifyOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[PromisifyOptions]
  }
}

