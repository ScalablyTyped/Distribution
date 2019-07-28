package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
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

object Anon_Data {
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
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(MenuSelectContanerPrefixCls = MenuSelectContanerPrefixCls, data = data, level = level, multiSelect = multiSelect, multiSelectMenuBtnsCls = multiSelectMenuBtnsCls, onCancel = js.Any.fromFunction0(onCancel), onChange = js.Any.fromFunction0(onChange), onOk = js.Any.fromFunction0(onOk), prefixCls = prefixCls, radioPrefixCls = radioPrefixCls, subMenuPrefixCls = subMenuPrefixCls)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

