package typings.antd.transferMod

import typings.antd.anon.PartialTransferLocale
import typings.antd.listBodyMod.TransferListBodyProps
import typings.antd.transferInterfaceMod.PaginationType
import typings.antd.transferListMod.TransferListProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ TransferListBodyProps, ReactNode]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.Array[TransferItem]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterOption: js.UndefOr[js.Function2[/* inputValue */ String, /* item */ TransferItem, Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, ReactNode]] = js.undefined
  var listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties
  var locale: js.UndefOr[PartialTransferLocale] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* targetKeys */ js.Array[String], 
      /* direction */ String, 
      /* moveKeys */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var onScroll: js.UndefOr[
    js.Function2[
      /* direction */ TransferDirection, 
      /* e */ SyntheticEvent[HTMLUListElement, Event], 
      Unit
    ]
  ] = js.undefined
  var onSearch: js.UndefOr[js.Function2[/* direction */ TransferDirection, /* value */ String, Unit]] = js.undefined
  var onSelectChange: js.UndefOr[
    js.Function2[
      /* sourceSelectedKeys */ js.Array[String], 
      /* targetSelectedKeys */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var oneWay: js.UndefOr[Boolean] = js.undefined
  var operationStyle: js.UndefOr[CSSProperties] = js.undefined
  var operations: js.UndefOr[js.Array[String]] = js.undefined
  var pagination: js.UndefOr[PaginationType] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[TransferRender] = js.undefined
  var rowKey: js.UndefOr[js.Function1[/* record */ TransferItem, String]] = js.undefined
  var selectAllLabels: js.UndefOr[js.Array[SelectAllLabel]] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var showSelectAll: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var targetKeys: js.UndefOr[js.Array[String]] = js.undefined
  var titles: js.UndefOr[js.Array[String]] = js.undefined
}

object TransferProps {
  @scala.inline
  def apply(
    dataSource: js.Array[TransferItem],
    listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties,
    children: /* props */ TransferListBodyProps => ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* inputValue */ String, /* item */ TransferItem) => Boolean = null,
    footer: /* props */ TransferListProps => ReactNode = null,
    locale: PartialTransferLocale = null,
    onChange: (/* targetKeys */ js.Array[String], /* direction */ String, /* moveKeys */ js.Array[String]) => Unit = null,
    onScroll: (/* direction */ TransferDirection, /* e */ SyntheticEvent[HTMLUListElement, Event]) => Unit = null,
    onSearch: (/* direction */ TransferDirection, /* value */ String) => Unit = null,
    onSelectChange: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Unit = null,
    oneWay: js.UndefOr[Boolean] = js.undefined,
    operationStyle: CSSProperties = null,
    operations: js.Array[String] = null,
    pagination: PaginationType = null,
    prefixCls: String = null,
    render: /* item */ TransferItem => RenderResult = null,
    rowKey: /* record */ TransferItem => String = null,
    selectAllLabels: js.Array[SelectAllLabel] = null,
    selectedKeys: js.Array[String] = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showSelectAll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetKeys: js.Array[String] = null,
    titles: js.Array[String] = null
  ): TransferProps = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2(filterOption))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction2(onScroll))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (onSelectChange != null) __obj.updateDynamic("onSelectChange")(js.Any.fromFunction2(onSelectChange))
    if (!js.isUndefined(oneWay)) __obj.updateDynamic("oneWay")(oneWay.get.asInstanceOf[js.Any])
    if (operationStyle != null) __obj.updateDynamic("operationStyle")(operationStyle.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (rowKey != null) __obj.updateDynamic("rowKey")(js.Any.fromFunction1(rowKey))
    if (selectAllLabels != null) __obj.updateDynamic("selectAllLabels")(selectAllLabels.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectAll)) __obj.updateDynamic("showSelectAll")(showSelectAll.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetKeys != null) __obj.updateDynamic("targetKeys")(targetKeys.asInstanceOf[js.Any])
    if (titles != null) __obj.updateDynamic("titles")(titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferProps]
  }
}

