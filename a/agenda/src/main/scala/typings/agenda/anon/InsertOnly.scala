package typings.agenda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOnly extends js.Object {
  var insertOnly: js.UndefOr[Boolean] = js.undefined
}

object InsertOnly {
  @scala.inline
  def apply(insertOnly: js.UndefOr[Boolean] = js.undefined): InsertOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertOnly)) __obj.updateDynamic("insertOnly")(insertOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOnly]
  }
}

