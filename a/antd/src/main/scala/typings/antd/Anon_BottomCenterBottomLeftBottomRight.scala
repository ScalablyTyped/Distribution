package typings.antd

import typings.antd.antdStrings.bottomCenter
import typings.antd.antdStrings.bottomLeft
import typings.antd.antdStrings.bottomRight
import typings.antd.antdStrings.topCenter
import typings.antd.antdStrings.topLeft
import typings.antd.antdStrings.topRight
import typings.antd.libDropdownDropdownDashButtonMod.DropdownButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenterBottomLeftBottomRight extends js.Object {
  var placement: js.UndefOr[bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter] = js.undefined
  var `type`: DropdownButtonType
}

object Anon_BottomCenterBottomLeftBottomRight {
  @scala.inline
  def apply(
    `type`: DropdownButtonType,
    placement: bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = null
  ): Anon_BottomCenterBottomLeftBottomRight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomCenterBottomLeftBottomRight]
  }
}

