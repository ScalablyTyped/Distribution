package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsSystem extends js.Object {
  var isSystem: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IsSystem {
  @scala.inline
  def apply(isSystem: js.UndefOr[scala.Boolean] = js.undefined): Anon_IsSystem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSystem)) __obj.updateDynamic("isSystem")(isSystem)
    __obj.asInstanceOf[Anon_IsSystem]
  }
}

