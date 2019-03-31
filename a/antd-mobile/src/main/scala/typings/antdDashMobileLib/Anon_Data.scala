package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var MenuSelectContanerPrefixCls: java.lang.String
  var data: js.Array[scala.Nothing]
  var level: scala.Double
  var multiSelect: scala.Boolean
  var multiSelectMenuBtnsCls: java.lang.String
  var prefixCls: java.lang.String
  var radioPrefixCls: java.lang.String
  var subMenuPrefixCls: java.lang.String
  def onCancel(): scala.Unit
  def onChange(): scala.Unit
  def onOk(): scala.Unit
}

object Anon_Data {
  @scala.inline
  def apply(
    MenuSelectContanerPrefixCls: java.lang.String,
    data: js.Array[scala.Nothing],
    level: scala.Double,
    multiSelect: scala.Boolean,
    multiSelectMenuBtnsCls: java.lang.String,
    onCancel: () => scala.Unit,
    onChange: () => scala.Unit,
    onOk: () => scala.Unit,
    prefixCls: java.lang.String,
    radioPrefixCls: java.lang.String,
    subMenuPrefixCls: java.lang.String
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(MenuSelectContanerPrefixCls = MenuSelectContanerPrefixCls, data = data, level = level, multiSelect = multiSelect, multiSelectMenuBtnsCls = multiSelectMenuBtnsCls, onCancel = js.Any.fromFunction0(onCancel), onChange = js.Any.fromFunction0(onChange), onOk = js.Any.fromFunction0(onOk), prefixCls = prefixCls, radioPrefixCls = radioPrefixCls, subMenuPrefixCls = subMenuPrefixCls)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

