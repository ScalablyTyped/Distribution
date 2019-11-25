package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreserveFolds extends js.Object {
  var preserveFolds: js.UndefOr[Boolean] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object Anon_PreserveFolds {
  @scala.inline
  def apply(preserveFolds: js.UndefOr[Boolean] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined): Anon_PreserveFolds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveFolds)) __obj.updateDynamic("preserveFolds")(preserveFolds.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PreserveFolds]
  }
}

