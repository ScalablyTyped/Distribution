package typings
package antdLib.libTransferListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferList
  extends reactLib.reactMod.Component[TransferListProps, TransferListState, js.Any] {
  var timer: scala.Double = js.native
  var triggerScrollTimer: scala.Double = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTransferList(): scala.Unit = js.native
  def getCheckBox(
    filteredItems: js.Array[antdLib.libTransferMod.TransferItem],
    onItemSelectAll: js.Function2[
      /* dataSource */ js.Array[java.lang.String], 
      /* checkAll */ scala.Boolean, 
      scala.Unit
    ]
  ): antdLib.antdLibNumbers.`false` | reactLib.reactMod.Global.JSXNs.Element = js.native
  def getCheckBox(
    filteredItems: js.Array[antdLib.libTransferMod.TransferItem],
    onItemSelectAll: js.Function2[
      /* dataSource */ js.Array[java.lang.String], 
      /* checkAll */ scala.Boolean, 
      scala.Unit
    ],
    showSelectAll: scala.Boolean
  ): antdLib.antdLibNumbers.`false` | reactLib.reactMod.Global.JSXNs.Element = js.native
  def getCheckBox(
    filteredItems: js.Array[antdLib.libTransferMod.TransferItem],
    onItemSelectAll: js.Function2[
      /* dataSource */ js.Array[java.lang.String], 
      /* checkAll */ scala.Boolean, 
      scala.Unit
    ],
    showSelectAll: scala.Boolean,
    disabled: scala.Boolean
  ): antdLib.antdLibNumbers.`false` | reactLib.reactMod.Global.JSXNs.Element = js.native
  def getCheckStatus(filteredItems: js.Array[antdLib.libTransferMod.TransferItem]): antdLib.antdLibStrings.all | antdLib.antdLibStrings.none | antdLib.antdLibStrings.part = js.native
  def getFilteredItems(dataSource: js.Array[antdLib.libTransferMod.TransferItem], filterValue: java.lang.String): antdLib.Anon_FilteredItemsFilteredRenderItems = js.native
  def getListBody(
    prefixCls: java.lang.String,
    searchPlaceholder: java.lang.String,
    filterValue: java.lang.String,
    filteredItems: js.Array[antdLib.libTransferMod.TransferItem],
    notFoundContent: reactLib.reactMod.ReactNode,
    bodyDom: reactLib.reactMod.ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[java.lang.String]
  ): reactLib.reactMod.ReactNode = js.native
  def getListBody(
    prefixCls: java.lang.String,
    searchPlaceholder: java.lang.String,
    filterValue: java.lang.String,
    filteredItems: js.Array[antdLib.libTransferMod.TransferItem],
    notFoundContent: reactLib.reactMod.ReactNode,
    bodyDom: reactLib.reactMod.ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[java.lang.String],
    renderList: RenderListFunction
  ): reactLib.reactMod.ReactNode = js.native
  def getListBody(
    prefixCls: java.lang.String,
    searchPlaceholder: java.lang.String,
    filterValue: java.lang.String,
    filteredItems: js.Array[antdLib.libTransferMod.TransferItem],
    notFoundContent: reactLib.reactMod.ReactNode,
    bodyDom: reactLib.reactMod.ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[java.lang.String],
    renderList: RenderListFunction,
    showSearch: scala.Boolean
  ): reactLib.reactMod.ReactNode = js.native
  def getListBody(
    prefixCls: java.lang.String,
    searchPlaceholder: java.lang.String,
    filterValue: java.lang.String,
    filteredItems: js.Array[antdLib.libTransferMod.TransferItem],
    notFoundContent: reactLib.reactMod.ReactNode,
    bodyDom: reactLib.reactMod.ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[java.lang.String],
    renderList: RenderListFunction,
    showSearch: scala.Boolean,
    disabled: scala.Boolean
  ): reactLib.reactMod.ReactNode = js.native
  def handleClear(): scala.Unit = js.native
  def handleFilter(e: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def matchFilter(text: java.lang.String, item: antdLib.libTransferMod.TransferItem): scala.Boolean = js.native
  def renderItem(item: antdLib.libTransferMod.TransferItem): RenderedItem = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTransferList(args: js.Any*): js.Any = js.native
}

