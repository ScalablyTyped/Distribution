package typings.antd.tableInterfaceMod

import typings.antd.anon.PartialOmitCheckboxPropsc
import typings.antd.useSelectionMod.INTERNAL_SELECTION_ITEM
import typings.rcTable.interfaceMod.RenderedCell
import typings.react.mod.ReactNode
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRowSelection[T] extends js.Object {
  
  var checkStrictly: js.UndefOr[Boolean] = js.native
  
  var columnTitle: js.UndefOr[String | ReactNode] = js.native
  
  var columnWidth: js.UndefOr[String | Double] = js.native
  
  var fixed: js.UndefOr[Boolean] = js.native
  
  var getCheckboxProps: js.UndefOr[js.Function1[/* record */ T, PartialOmitCheckboxPropsc]] = js.native
  
  var hideSelectAll: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[
    js.Function2[/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T], Unit]
  ] = js.native
  
  var onSelect: js.UndefOr[SelectionSelectFn[T]] = js.native
  
  /** @deprecated This function is meaningless and should use `onChange` instead */
  var onSelectAll: js.UndefOr[
    js.Function3[
      /* selected */ Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      Unit
    ]
  ] = js.native
  
  /** @deprecated This function is meaningless and should use `onChange` instead */
  var onSelectInvert: js.UndefOr[js.Function1[/* selectedRowKeys */ js.Array[Key], Unit]] = js.native
  
  var onSelectMultiple: js.UndefOr[
    js.Function3[
      /* selected */ Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      Unit
    ]
  ] = js.native
  
  /** Keep the selection keys in list even the key not exist in `dataSource` anymore */
  var preserveSelectedRowKeys: js.UndefOr[Boolean] = js.native
  
  var renderCell: js.UndefOr[
    js.Function4[
      /* value */ Boolean, 
      /* record */ T, 
      /* index */ Double, 
      /* originNode */ ReactNode, 
      ReactNode | RenderedCell[T]
    ]
  ] = js.native
  
  var selectedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  
  var selections: js.UndefOr[js.Array[INTERNAL_SELECTION_ITEM] | Boolean] = js.native
  
  var `type`: js.UndefOr[RowSelectionType] = js.native
}
object TableRowSelection {
  
  @scala.inline
  def apply[T](): TableRowSelection[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowSelection[T]]
  }
  
  @scala.inline
  implicit class TableRowSelectionOps[Self <: TableRowSelection[_], T] (val x: Self with TableRowSelection[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckStrictly(value: Boolean): Self = this.set("checkStrictly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckStrictly: Self = this.set("checkStrictly", js.undefined)
    
    @scala.inline
    def setColumnTitle(value: String | ReactNode): Self = this.set("columnTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnTitle: Self = this.set("columnTitle", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: String | Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setGetCheckboxProps(value: /* record */ T => PartialOmitCheckboxPropsc): Self = this.set("getCheckboxProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetCheckboxProps: Self = this.set("getCheckboxProps", js.undefined)
    
    @scala.inline
    def setHideSelectAll(value: Boolean): Self = this.set("hideSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideSelectAll: Self = this.set("hideSelectAll", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: (T, /* selected */ Boolean, /* selectedRows */ js.Array[js.Object], /* nativeEvent */ Event) => Unit
    ): Self = this.set("onSelect", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnSelectAll(
      value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Unit
    ): Self = this.set("onSelectAll", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSelectAll: Self = this.set("onSelectAll", js.undefined)
    
    @scala.inline
    def setOnSelectInvert(value: /* selectedRowKeys */ js.Array[Key] => Unit): Self = this.set("onSelectInvert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectInvert: Self = this.set("onSelectInvert", js.undefined)
    
    @scala.inline
    def setOnSelectMultiple(
      value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Unit
    ): Self = this.set("onSelectMultiple", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSelectMultiple: Self = this.set("onSelectMultiple", js.undefined)
    
    @scala.inline
    def setPreserveSelectedRowKeys(value: Boolean): Self = this.set("preserveSelectedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveSelectedRowKeys: Self = this.set("preserveSelectedRowKeys", js.undefined)
    
    @scala.inline
    def setRenderCell(
      value: (/* value */ Boolean, /* record */ T, /* index */ Double, /* originNode */ ReactNode) => ReactNode | RenderedCell[T]
    ): Self = this.set("renderCell", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteRenderCell: Self = this.set("renderCell", js.undefined)
    
    @scala.inline
    def setSelectedRowKeysVarargs(value: Key*): Self = this.set("selectedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedRowKeys(value: js.Array[Key]): Self = this.set("selectedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRowKeys: Self = this.set("selectedRowKeys", js.undefined)
    
    @scala.inline
    def setSelectionsVarargs(value: INTERNAL_SELECTION_ITEM*): Self = this.set("selections", js.Array(value :_*))
    
    @scala.inline
    def setSelections(value: js.Array[INTERNAL_SELECTION_ITEM] | Boolean): Self = this.set("selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelections: Self = this.set("selections", js.undefined)
    
    @scala.inline
    def setType(value: RowSelectionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
