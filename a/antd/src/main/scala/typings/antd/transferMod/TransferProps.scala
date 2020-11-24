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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferProps[RecordType] extends js.Object {
  
  var children: js.UndefOr[js.Function1[/* props */ TransferListBodyProps[RecordType], ReactNode]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var dataSource: js.Array[RecordType] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var filterOption: js.UndefOr[js.Function2[/* inputValue */ String, /* item */ RecordType, Boolean]] = js.native
  
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps[RecordType], ReactNode]] = js.native
  
  var listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties = js.native
  
  var locale: js.UndefOr[PartialTransferLocale] = js.native
  
  var onChange: js.UndefOr[
    js.Function3[
      /* targetKeys */ js.Array[String], 
      /* direction */ TransferDirection, 
      /* moveKeys */ js.Array[String], 
      Unit
    ]
  ] = js.native
  
  var onScroll: js.UndefOr[
    js.Function2[
      /* direction */ TransferDirection, 
      /* e */ SyntheticEvent[HTMLUListElement, Event], 
      Unit
    ]
  ] = js.native
  
  var onSearch: js.UndefOr[js.Function2[/* direction */ TransferDirection, /* value */ String, Unit]] = js.native
  
  var onSelectChange: js.UndefOr[
    js.Function2[
      /* sourceSelectedKeys */ js.Array[String], 
      /* targetSelectedKeys */ js.Array[String], 
      Unit
    ]
  ] = js.native
  
  var oneWay: js.UndefOr[Boolean] = js.native
  
  var operationStyle: js.UndefOr[CSSProperties] = js.native
  
  var operations: js.UndefOr[js.Array[String]] = js.native
  
  var pagination: js.UndefOr[PaginationType] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var render: js.UndefOr[TransferRender[RecordType]] = js.native
  
  var rowKey: js.UndefOr[js.Function1[/* record */ RecordType, String]] = js.native
  
  var selectAllLabels: js.UndefOr[js.Array[SelectAllLabel]] = js.native
  
  var selectedKeys: js.UndefOr[js.Array[String]] = js.native
  
  var showSearch: js.UndefOr[Boolean] = js.native
  
  var showSelectAll: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var targetKeys: js.UndefOr[js.Array[String]] = js.native
  
  var titles: js.UndefOr[js.Array[String]] = js.native
}
object TransferProps {
  
  @scala.inline
  def apply[RecordType](
    dataSource: js.Array[RecordType],
    listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties
  ): TransferProps[RecordType] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferProps[RecordType]]
  }
  
  @scala.inline
  implicit class TransferPropsOps[Self <: TransferProps[_], RecordType] (val x: Self with TransferProps[RecordType]) extends AnyVal {
    
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
    def setDataSourceVarargs(value: RecordType*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[RecordType]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStyleFunction1(value: /* style */ ListStyle => CSSProperties): Self = this.set("listStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListStyle(value: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: /* props */ TransferListBodyProps[RecordType] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFilterOption(value: (/* inputValue */ String, /* item */ RecordType) => Boolean): Self = this.set("filterOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterOption: Self = this.set("filterOption", js.undefined)
    
    @scala.inline
    def setFooter(value: /* props */ TransferListProps[RecordType] => ReactNode): Self = this.set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setLocale(value: PartialTransferLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* targetKeys */ js.Array[String], /* direction */ TransferDirection, /* moveKeys */ js.Array[String]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnScroll(
      value: (/* direction */ TransferDirection, /* e */ SyntheticEvent[HTMLUListElement, Event]) => Unit
    ): Self = this.set("onScroll", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSearch(value: (/* direction */ TransferDirection, /* value */ String) => Unit): Self = this.set("onSearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    
    @scala.inline
    def setOnSelectChange(
      value: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Unit
    ): Self = this.set("onSelectChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelectChange: Self = this.set("onSelectChange", js.undefined)
    
    @scala.inline
    def setOneWay(value: Boolean): Self = this.set("oneWay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneWay: Self = this.set("oneWay", js.undefined)
    
    @scala.inline
    def setOperationStyle(value: CSSProperties): Self = this.set("operationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationStyle: Self = this.set("operationStyle", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: String*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: js.Array[String]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    
    @scala.inline
    def setPagination(value: PaginationType): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRender(value: RecordType => RenderResult): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRowKey(value: /* record */ RecordType => String): Self = this.set("rowKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowKey: Self = this.set("rowKey", js.undefined)
    
    @scala.inline
    def setSelectAllLabelsVarargs(value: SelectAllLabel*): Self = this.set("selectAllLabels", js.Array(value :_*))
    
    @scala.inline
    def setSelectAllLabels(value: js.Array[SelectAllLabel]): Self = this.set("selectAllLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllLabels: Self = this.set("selectAllLabels", js.undefined)
    
    @scala.inline
    def setSelectedKeysVarargs(value: String*): Self = this.set("selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedKeys(value: js.Array[String]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
    
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    
    @scala.inline
    def setShowSelectAll(value: Boolean): Self = this.set("showSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSelectAll: Self = this.set("showSelectAll", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTargetKeysVarargs(value: String*): Self = this.set("targetKeys", js.Array(value :_*))
    
    @scala.inline
    def setTargetKeys(value: js.Array[String]): Self = this.set("targetKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetKeys: Self = this.set("targetKeys", js.undefined)
    
    @scala.inline
    def setTitlesVarargs(value: String*): Self = this.set("titles", js.Array(value :_*))
    
    @scala.inline
    def setTitles(value: js.Array[String]): Self = this.set("titles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitles: Self = this.set("titles", js.undefined)
  }
}
