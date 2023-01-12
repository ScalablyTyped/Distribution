package typings.antd

import typings.antd.anon.BodyContent
import typings.antd.anon.Direction
import typings.antd.anon.Disabled
import typings.antd.anon.FilteredItems
import typings.antd.anon.SelectedCount
import typings.antd.antdBooleans.`false`
import typings.antd.antdStrings.all
import typings.antd.antdStrings.none
import typings.antd.antdStrings.part
import typings.antd.libTransferInterfaceMod.PaginationType
import typings.antd.libTransferListBodyMod.TransferListBodyProps
import typings.antd.libTransferMod.KeyWiseTransferItem
import typings.antd.libTransferMod.RenderResult
import typings.antd.libTransferMod.SelectAllLabel
import typings.antd.libTransferMod.TransferDirection
import typings.antd.libTransferMod.TransferLocale
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.UIEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransferListMod {
  
  @JSImport("antd/lib/transfer/list", JSImport.Default)
  @js.native
  open class default[RecordType /* <: KeyWiseTransferItem */] protected () extends TransferList[RecordType] {
    def this(props: TransferListProps[RecordType]) = this()
  }
  
  type RenderListFunction[T] = js.Function1[/* props */ TransferListBodyProps[T], ReactNode]
  
  trait RenderedItem[RecordType] extends StObject {
    
    var item: RecordType
    
    var renderedEl: ReactNode
    
    var renderedText: String
  }
  object RenderedItem {
    
    inline def apply[RecordType](item: RecordType, renderedText: String): RenderedItem[RecordType] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderedItem[RecordType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderedItem[?], RecordType] (val x: Self & RenderedItem[RecordType]) extends AnyVal {
      
      inline def setItem(value: RecordType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setRenderedEl(value: ReactNode): Self = StObject.set(x, "renderedEl", value.asInstanceOf[js.Any])
      
      inline def setRenderedElUndefined: Self = StObject.set(x, "renderedEl", js.undefined)
      
      inline def setRenderedText(value: String): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransferList[RecordType /* <: KeyWiseTransferItem */] extends PureComponent[TransferListProps[RecordType], TransferListState, Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTransferList(): Unit = js.native
    
    var defaultListBodyRef: RefObject[typings.antd.libTransferListBodyMod.default[RecordType]] = js.native
    
    def getCheckBox(param0: Disabled[RecordType]): `false` | Element = js.native
    
    def getCheckStatus(filteredItems: js.Array[RecordType]): none | all | part = js.native
    
    def getFilteredItems(dataSource: js.Array[RecordType], filterValue: String): FilteredItems[RecordType] = js.native
    
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactNode,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String]
    ): ReactNode = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactNode,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: Unit,
      showSearch: Boolean
    ): ReactNode = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactNode,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: Unit,
      showSearch: Boolean,
      disabled: Boolean
    ): ReactNode = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactNode,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: Unit,
      showSearch: Unit,
      disabled: Boolean
    ): ReactNode = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactNode,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType]
    ): ReactNode = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactNode,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType],
      showSearch: Boolean
    ): ReactNode = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactNode,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType],
      showSearch: Boolean,
      disabled: Boolean
    ): ReactNode = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactNode,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType],
      showSearch: Unit,
      disabled: Boolean
    ): ReactNode = js.native
    
    def getSelectAllLabel(selectedCount: Double, totalCount: Double): ReactNode = js.native
    
    def handleClear(): Unit = js.native
    
    def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def matchFilter(text: String, item: RecordType): Boolean = js.native
    
    def renderItem(item: RecordType): RenderedItem[RecordType] = js.native
    
    def renderListBody(renderList: Unit, props: TransferListBodyProps[RecordType]): BodyContent = js.native
    def renderListBody(renderList: RenderListFunction[RecordType], props: TransferListBodyProps[RecordType]): BodyContent = js.native
    
    var timer: Double = js.native
    
    var triggerScrollTimer: Double = js.native
  }
  
  trait TransferListProps[RecordType]
    extends StObject
       with TransferLocale {
    
    var checkedKeys: js.Array[String]
    
    var dataSource: js.Array[RecordType]
    
    var direction: TransferDirection
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var filterOption: js.UndefOr[js.Function2[/* filterText */ String, /* item */ RecordType, Boolean]] = js.undefined
    
    var footer: js.UndefOr[
        js.Function2[
          /* props */ TransferListProps[RecordType], 
          /* info */ js.UndefOr[Direction], 
          ReactNode
        ]
      ] = js.undefined
    
    def handleClear(): Unit
    
    def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit
    
    var onItemRemove: js.UndefOr[js.Function1[/* keys */ js.Array[String], Unit]] = js.undefined
    
    def onItemSelect(key: String, check: Boolean): Unit
    
    def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit
    
    def onScroll(e: UIEvent[HTMLUListElement, NativeUIEvent]): Unit
    
    var pagination: js.UndefOr[PaginationType] = js.undefined
    
    var prefixCls: String
    
    /** Render item */
    var render: js.UndefOr[js.Function1[/* item */ RecordType, RenderResult]] = js.undefined
    
    var renderList: js.UndefOr[RenderListFunction[RecordType]] = js.undefined
    
    var selectAllLabel: js.UndefOr[SelectAllLabel] = js.undefined
    
    var showRemove: js.UndefOr[Boolean] = js.undefined
    
    var showSearch: js.UndefOr[Boolean] = js.undefined
    
    var showSelectAll: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var titleText: ReactNode
  }
  object TransferListProps {
    
    inline def apply[RecordType](
      checkedKeys: js.Array[String],
      dataSource: js.Array[RecordType],
      direction: TransferDirection,
      handleClear: () => Unit,
      handleFilter: ChangeEvent[HTMLInputElement] => Unit,
      itemUnit: String,
      itemsUnit: String,
      onItemSelect: (String, Boolean) => Unit,
      onItemSelectAll: (js.Array[String], Boolean) => Unit,
      onScroll: UIEvent[HTMLUListElement, NativeUIEvent] => Unit,
      prefixCls: String,
      searchPlaceholder: String
    ): TransferListProps[RecordType] = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], handleClear = js.Any.fromFunction0(handleClear), handleFilter = js.Any.fromFunction1(handleFilter), itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2(onItemSelect), onItemSelectAll = js.Any.fromFunction2(onItemSelectAll), onScroll = js.Any.fromFunction1(onScroll), prefixCls = prefixCls.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListProps[RecordType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransferListProps[?], RecordType] (val x: Self & TransferListProps[RecordType]) extends AnyVal {
      
      inline def setCheckedKeys(value: js.Array[String]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysVarargs(value: String*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
      
      inline def setDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setDirection(value: TransferDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFilterOption(value: (/* filterText */ String, /* item */ RecordType) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      inline def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      inline def setFooter(value: (/* props */ TransferListProps[RecordType], /* info */ js.UndefOr[Direction]) => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHandleClear(value: () => Unit): Self = StObject.set(x, "handleClear", js.Any.fromFunction0(value))
      
      inline def setHandleFilter(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "handleFilter", js.Any.fromFunction1(value))
      
      inline def setOnItemRemove(value: /* keys */ js.Array[String] => Unit): Self = StObject.set(x, "onItemRemove", js.Any.fromFunction1(value))
      
      inline def setOnItemRemoveUndefined: Self = StObject.set(x, "onItemRemove", js.undefined)
      
      inline def setOnItemSelect(value: (String, Boolean) => Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction2(value))
      
      inline def setOnItemSelectAll(value: (js.Array[String], Boolean) => Unit): Self = StObject.set(x, "onItemSelectAll", js.Any.fromFunction2(value))
      
      inline def setOnScroll(value: UIEvent[HTMLUListElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setPagination(value: PaginationType): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRender(value: /* item */ RecordType => RenderResult): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderList(value: /* props */ TransferListBodyProps[RecordType] => ReactNode): Self = StObject.set(x, "renderList", js.Any.fromFunction1(value))
      
      inline def setRenderListUndefined: Self = StObject.set(x, "renderList", js.undefined)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSelectAllLabel(value: SelectAllLabel): Self = StObject.set(x, "selectAllLabel", value.asInstanceOf[js.Any])
      
      inline def setSelectAllLabelFunction1(value: /* info */ SelectedCount => ReactNode): Self = StObject.set(x, "selectAllLabel", js.Any.fromFunction1(value))
      
      inline def setSelectAllLabelUndefined: Self = StObject.set(x, "selectAllLabel", js.undefined)
      
      inline def setShowRemove(value: Boolean): Self = StObject.set(x, "showRemove", value.asInstanceOf[js.Any])
      
      inline def setShowRemoveUndefined: Self = StObject.set(x, "showRemove", js.undefined)
      
      inline def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      inline def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      inline def setShowSelectAll(value: Boolean): Self = StObject.set(x, "showSelectAll", value.asInstanceOf[js.Any])
      
      inline def setShowSelectAllUndefined: Self = StObject.set(x, "showSelectAll", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitleText(value: ReactNode): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    }
  }
  
  trait TransferListState extends StObject {
    
    /** Filter input value */
    var filterValue: String
  }
  object TransferListState {
    
    inline def apply(filterValue: String): TransferListState = {
      val __obj = js.Dynamic.literal(filterValue = filterValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransferListState] (val x: Self) extends AnyVal {
      
      inline def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    }
  }
}
