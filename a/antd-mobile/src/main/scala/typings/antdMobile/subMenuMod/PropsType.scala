package typings.antdMobile.subMenuMod

import typings.antdMobile.menuPropsTypeMod.DataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  var radioPrefixCls: js.UndefOr[String] = js.undefined
  var selItem: js.Array[DataItem]
  var showSelect: Boolean
  var subMenuData: js.Array[DataItem]
  var subMenuPrefixCls: js.UndefOr[String] = js.undefined
  def onSel(dataItem: DataItem): Unit
}

object PropsType {
  @scala.inline
  def apply(
    onSel: DataItem => Unit,
    selItem: js.Array[DataItem],
    showSelect: Boolean,
    subMenuData: js.Array[DataItem],
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    radioPrefixCls: String = null,
    subMenuPrefixCls: String = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(onSel = js.Any.fromFunction1(onSel), selItem = selItem.asInstanceOf[js.Any], showSelect = showSelect.asInstanceOf[js.Any], subMenuData = subMenuData.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (radioPrefixCls != null) __obj.updateDynamic("radioPrefixCls")(radioPrefixCls.asInstanceOf[js.Any])
    if (subMenuPrefixCls != null) __obj.updateDynamic("subMenuPrefixCls")(subMenuPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

