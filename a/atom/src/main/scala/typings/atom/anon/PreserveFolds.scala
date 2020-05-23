package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreserveFolds extends js.Object {
  var preserveFolds: js.UndefOr[Boolean] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object PreserveFolds {
  @scala.inline
  def apply(preserveFolds: js.UndefOr[Boolean] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined): PreserveFolds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveFolds)) __obj.updateDynamic("preserveFolds")(preserveFolds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveFolds]
  }
}

