package typings.antd

import typings.antd.antdBooleans.`false`
import typings.antd.listItemMod.ListItemTypeProps
import typings.antd.paginationPaginationMod.PaginationConfig
import typings.antd.spinMod.SpinProps
import typings.react.mod.CSSProperties
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  object default {
    
    @JSImport("antd/lib/list", JSImport.Default)
    @js.native
    def apply[T](
      hasPaginationPrefixClsBorderedSplitClassNameChildrenItemLayoutLoadMoreGridDataSourceSizeHeaderFooterLoadingRowKeyRenderItemLocaleRest: ListProps[T]
    ): Element = js.native
    @JSImport("antd/lib/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/list", "default.Item")
    @js.native
    def Item: ListItemTypeProps = js.native
    @scala.inline
    def Item_=(x: ListItemTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/lib/list", "ListConsumer")
  @js.native
  val ListConsumer: Consumer[ListConsumerProps] = js.native
  
  @JSImport("antd/lib/list", "ListContext")
  @js.native
  val ListContext: Context[ListConsumerProps] = js.native
  
  type ColumnCount = Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.gutter
    - typings.antd.antdStrings.column
    - typings.antd.antdStrings.xs
    - typings.antd.antdStrings.sm
    - typings.antd.antdStrings.md
    - typings.antd.antdStrings.lg
    - typings.antd.antdStrings.xl
    - typings.antd.antdStrings.xxl
  */
  trait ColumnType extends StObject
  object ColumnType {
    
    @scala.inline
    def column: typings.antd.antdStrings.column = "column".asInstanceOf[typings.antd.antdStrings.column]
    
    @scala.inline
    def gutter: typings.antd.antdStrings.gutter = "gutter".asInstanceOf[typings.antd.antdStrings.gutter]
    
    @scala.inline
    def lg: typings.antd.antdStrings.lg = "lg".asInstanceOf[typings.antd.antdStrings.lg]
    
    @scala.inline
    def md: typings.antd.antdStrings.md = "md".asInstanceOf[typings.antd.antdStrings.md]
    
    @scala.inline
    def sm: typings.antd.antdStrings.sm = "sm".asInstanceOf[typings.antd.antdStrings.sm]
    
    @scala.inline
    def xl: typings.antd.antdStrings.xl = "xl".asInstanceOf[typings.antd.antdStrings.xl]
    
    @scala.inline
    def xs: typings.antd.antdStrings.xs = "xs".asInstanceOf[typings.antd.antdStrings.xs]
    
    @scala.inline
    def xxl: typings.antd.antdStrings.xxl = "xxl".asInstanceOf[typings.antd.antdStrings.xxl]
  }
  
  @js.native
  trait ListConsumerProps extends StObject {
    
    var grid: js.UndefOr[js.Any] = js.native
    
    var itemLayout: js.UndefOr[String] = js.native
  }
  object ListConsumerProps {
    
    @scala.inline
    def apply(): ListConsumerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListConsumerProps]
    }
    
    @scala.inline
    implicit class ListConsumerPropsMutableBuilder[Self <: ListConsumerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setItemLayout(value: String): Self = StObject.set(x, "itemLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLayoutUndefined: Self = StObject.set(x, "itemLayout", js.undefined)
    }
  }
  
  @js.native
  trait ListGridType extends StObject {
    
    var column: js.UndefOr[ColumnCount] = js.native
    
    var gutter: js.UndefOr[Double] = js.native
    
    var lg: js.UndefOr[ColumnCount] = js.native
    
    var md: js.UndefOr[ColumnCount] = js.native
    
    var sm: js.UndefOr[ColumnCount] = js.native
    
    var xl: js.UndefOr[ColumnCount] = js.native
    
    var xs: js.UndefOr[ColumnCount] = js.native
    
    var xxl: js.UndefOr[ColumnCount] = js.native
  }
  object ListGridType {
    
    @scala.inline
    def apply(): ListGridType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGridType]
    }
    
    @scala.inline
    implicit class ListGridTypeMutableBuilder[Self <: ListGridType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnCount): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setLg(value: ColumnCount): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: ColumnCount): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: ColumnCount): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: ColumnCount): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: ColumnCount): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: ColumnCount): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.horizontal
    - typings.antd.antdStrings.vertical
  */
  trait ListItemLayout extends StObject
  object ListItemLayout {
    
    @scala.inline
    def horizontal: typings.antd.antdStrings.horizontal = "horizontal".asInstanceOf[typings.antd.antdStrings.horizontal]
    
    @scala.inline
    def vertical: typings.antd.antdStrings.vertical = "vertical".asInstanceOf[typings.antd.antdStrings.vertical]
  }
  
  @js.native
  trait ListLocale extends StObject {
    
    var emptyText: ReactNode | js.Function0[ReactNode] = js.native
  }
  object ListLocale {
    
    @scala.inline
    def apply(): ListLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListLocale]
    }
    
    @scala.inline
    implicit class ListLocaleMutableBuilder[Self <: ListLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmptyText(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTextFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
    }
  }
  
  @js.native
  trait ListProps[T] extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dataSource: js.UndefOr[js.Array[T]] = js.native
    
    var extra: js.UndefOr[ReactNode] = js.native
    
    var footer: js.UndefOr[ReactNode] = js.native
    
    var grid: js.UndefOr[ListGridType] = js.native
    
    var header: js.UndefOr[ReactNode] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var itemLayout: js.UndefOr[ListItemLayout] = js.native
    
    var loadMore: js.UndefOr[ReactNode] = js.native
    
    var loading: js.UndefOr[Boolean | SpinProps] = js.native
    
    var locale: js.UndefOr[ListLocale] = js.native
    
    var pagination: js.UndefOr[PaginationConfig | `false`] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderItem: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, ReactNode]] = js.native
    
    var rowKey: js.UndefOr[(js.Function1[/* item */ T, String]) | String] = js.native
    
    var size: js.UndefOr[ListSize] = js.native
    
    var split: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply[T](): ListProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps[T]]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps[_], T] (val x: Self with ListProps[T]) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Array[T]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDataSourceVarargs(value: T*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setGrid(value: ListGridType): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItemLayout(value: ListItemLayout): Self = StObject.set(x, "itemLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLayoutUndefined: Self = StObject.set(x, "itemLayout", js.undefined)
      
      @scala.inline
      def setLoadMore(value: ReactNode): Self = StObject.set(x, "loadMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean | SpinProps): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setLocale(value: ListLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPagination(value: PaginationConfig | `false`): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderItem(value: (/* item */ T, /* index */ Double) => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      @scala.inline
      def setRowKey(value: (js.Function1[/* item */ T, String]) | String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowKeyFunction1(value: /* item */ T => String): Self = StObject.set(x, "rowKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      @scala.inline
      def setSize(value: ListSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.small
    - typings.antd.antdStrings.default
    - typings.antd.antdStrings.large
  */
  trait ListSize extends StObject
  object ListSize {
    
    @scala.inline
    def default: typings.antd.antdStrings.default = "default".asInstanceOf[typings.antd.antdStrings.default]
    
    @scala.inline
    def large: typings.antd.antdStrings.large = "large".asInstanceOf[typings.antd.antdStrings.large]
    
    @scala.inline
    def small: typings.antd.antdStrings.small = "small".asInstanceOf[typings.antd.antdStrings.small]
  }
}
