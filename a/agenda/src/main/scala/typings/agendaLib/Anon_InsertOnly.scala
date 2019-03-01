package typings
package agendaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertOnly extends js.Object {
  var insertOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_InsertOnly {
  @scala.inline
  def apply(insertOnly: js.UndefOr[scala.Boolean] = js.undefined): Anon_InsertOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertOnly)) __obj.updateDynamic("insertOnly")(insertOnly)
    __obj.asInstanceOf[Anon_InsertOnly]
  }
}

