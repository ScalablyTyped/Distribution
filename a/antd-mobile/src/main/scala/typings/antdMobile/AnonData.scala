package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var MenuSelectContanerPrefixCls: String
  var data: js.Array[scala.Nothing]
  var level: Double
  var multiSelect: Boolean
  var multiSelectMenuBtnsCls: String
  var prefixCls: String
  var radioPrefixCls: String
  var subMenuPrefixCls: String
  def onCancel(): Unit
  def onChange(): Unit
  def onOk(): Unit
}

object AnonData {
  @scala.inline
  def apply(
    MenuSelectContanerPrefixCls: String,
    data: js.Array[scala.Nothing],
    level: Double,
    multiSelect: Boolean,
    multiSelectMenuBtnsCls: String,
    onCancel: () => Unit,
    onChange: () => Unit,
    onOk: () => Unit,
    prefixCls: String,
    radioPrefixCls: String,
    subMenuPrefixCls: String
  ): AnonData = {
    val __obj = js.Dynamic.literal(MenuSelectContanerPrefixCls = MenuSelectContanerPrefixCls.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], multiSelect = multiSelect.asInstanceOf[js.Any], multiSelectMenuBtnsCls = multiSelectMenuBtnsCls.asInstanceOf[js.Any], onCancel = js.Any.fromFunction0(onCancel), onChange = js.Any.fromFunction0(onChange), onOk = js.Any.fromFunction0(onOk), prefixCls = prefixCls.asInstanceOf[js.Any], radioPrefixCls = radioPrefixCls.asInstanceOf[js.Any], subMenuPrefixCls = subMenuPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

