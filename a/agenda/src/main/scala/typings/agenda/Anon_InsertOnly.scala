package typings.agenda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertOnly extends js.Object {
  var insertOnly: js.UndefOr[Boolean] = js.undefined
}

object Anon_InsertOnly {
  @scala.inline
  def apply(insertOnly: js.UndefOr[Boolean] = js.undefined): Anon_InsertOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertOnly)) __obj.updateDynamic("insertOnly")(insertOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InsertOnly]
  }
}

