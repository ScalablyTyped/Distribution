package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreserveFolds extends js.Object {
  var preserveFolds: js.UndefOr[scala.Boolean] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_PreserveFolds {
  @scala.inline
  def apply(
    preserveFolds: js.UndefOr[scala.Boolean] = js.undefined,
    reversed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_PreserveFolds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveFolds)) __obj.updateDynamic("preserveFolds")(preserveFolds)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_PreserveFolds]
  }
}

