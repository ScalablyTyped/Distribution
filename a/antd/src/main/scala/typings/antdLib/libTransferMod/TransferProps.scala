package typings
package antdLib.libTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferProps extends js.Object {
  var body: js.UndefOr[
    js.Function1[
      /* props */ antdLib.libTransferListMod.TransferListProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.Array[TransferItem]
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var filterOption: js.UndefOr[js.Function2[/* inputValue */ js.Any, /* item */ js.Any, scala.Boolean]] = js.undefined
  var footer: js.UndefOr[
    js.Function1[
      /* props */ antdLib.libTransferListMod.TransferListProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var `lazy`: js.UndefOr[js.Object | scala.Boolean] = js.undefined
  var listStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var notFoundContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* targetKeys */ js.Array[java.lang.String], 
      /* direction */ java.lang.String, 
      /* moveKeys */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onScroll: js.UndefOr[
    js.Function2[
      /* direction */ TransferDirection, 
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLDivElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onSearch: js.UndefOr[
    js.Function2[/* direction */ TransferDirection, /* value */ java.lang.String, scala.Unit]
  ] = js.undefined
  var onSearchChange: js.UndefOr[
    js.Function2[
      /* direction */ TransferDirection, 
      /* e */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelectChange: js.UndefOr[
    js.Function2[
      /* sourceSelectedKeys */ js.Array[java.lang.String], 
      /* targetSelectedKeys */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var operationStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var operations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var render: js.UndefOr[TransferRender] = js.undefined
  var rowKey: js.UndefOr[js.Function1[/* record */ TransferItem, java.lang.String]] = js.undefined
  var searchPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var showSearch: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var targetKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var titles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TransferProps {
  @scala.inline
  def apply(
    dataSource: js.Array[TransferItem],
    body: js.Function1[
      /* props */ antdLib.libTransferListMod.TransferListProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    filterOption: js.Function2[/* inputValue */ js.Any, /* item */ js.Any, scala.Boolean] = null,
    footer: js.Function1[
      /* props */ antdLib.libTransferListMod.TransferListProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    `lazy`: js.Object | scala.Boolean = null,
    listStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    locale: js.Object = null,
    notFoundContent: reactLib.reactMod.ReactNs.ReactNode = null,
    onChange: js.Function3[
      /* targetKeys */ js.Array[java.lang.String], 
      /* direction */ java.lang.String, 
      /* moveKeys */ js.Any, 
      scala.Unit
    ] = null,
    onScroll: js.Function2[
      /* direction */ TransferDirection, 
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLDivElement, reactLib.Event], 
      scala.Unit
    ] = null,
    onSearch: js.Function2[/* direction */ TransferDirection, /* value */ java.lang.String, scala.Unit] = null,
    onSearchChange: js.Function2[
      /* direction */ TransferDirection, 
      /* e */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ] = null,
    onSelectChange: js.Function2[
      /* sourceSelectedKeys */ js.Array[java.lang.String], 
      /* targetSelectedKeys */ js.Array[java.lang.String], 
      scala.Unit
    ] = null,
    operationStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    operations: js.Array[java.lang.String] = null,
    prefixCls: java.lang.String = null,
    render: TransferRender = null,
    rowKey: js.Function1[/* record */ TransferItem, java.lang.String] = null,
    searchPlaceholder: java.lang.String = null,
    selectedKeys: js.Array[java.lang.String] = null,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    targetKeys: js.Array[java.lang.String] = null,
    titles: js.Array[java.lang.String] = null
  ): TransferProps = {
    val __obj = js.Dynamic.literal(dataSource = dataSource)
    if (body != null) __obj.updateDynamic("body")(body)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onSearch != null) __obj.updateDynamic("onSearch")(onSearch)
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(onSearchChange)
    if (onSelectChange != null) __obj.updateDynamic("onSelectChange")(onSelectChange)
    if (operationStyle != null) __obj.updateDynamic("operationStyle")(operationStyle)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (render != null) __obj.updateDynamic("render")(render)
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey)
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys)
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (style != null) __obj.updateDynamic("style")(style)
    if (targetKeys != null) __obj.updateDynamic("targetKeys")(targetKeys)
    if (titles != null) __obj.updateDynamic("titles")(titles)
    __obj.asInstanceOf[TransferProps]
  }
}

