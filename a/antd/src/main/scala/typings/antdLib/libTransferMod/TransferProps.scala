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

