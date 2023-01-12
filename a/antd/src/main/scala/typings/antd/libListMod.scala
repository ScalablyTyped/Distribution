package typings.antd

import typings.antd.antdBooleans.`false`
import typings.antd.libListItemMod.ListItemTypeProps
import typings.antd.libPaginationPaginationMod.PaginationConfig
import typings.antd.libSpinMod.SpinProps
import typings.react.mod.CSSProperties
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListMod {
  
  object default {
    
    inline def apply[T](param0: ListProps[T]): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/list", "default.Item")
    @js.native
    def Item: ListItemTypeProps = js.native
    inline def Item_=(x: ListItemTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
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
    
    inline def column: typings.antd.antdStrings.column = "column".asInstanceOf[typings.antd.antdStrings.column]
    
    inline def gutter: typings.antd.antdStrings.gutter = "gutter".asInstanceOf[typings.antd.antdStrings.gutter]
    
    inline def lg: typings.antd.antdStrings.lg = "lg".asInstanceOf[typings.antd.antdStrings.lg]
    
    inline def md: typings.antd.antdStrings.md = "md".asInstanceOf[typings.antd.antdStrings.md]
    
    inline def sm: typings.antd.antdStrings.sm = "sm".asInstanceOf[typings.antd.antdStrings.sm]
    
    inline def xl: typings.antd.antdStrings.xl = "xl".asInstanceOf[typings.antd.antdStrings.xl]
    
    inline def xs: typings.antd.antdStrings.xs = "xs".asInstanceOf[typings.antd.antdStrings.xs]
    
    inline def xxl: typings.antd.antdStrings.xxl = "xxl".asInstanceOf[typings.antd.antdStrings.xxl]
  }
  
  trait ListConsumerProps extends StObject {
    
    var grid: js.UndefOr[Any] = js.undefined
    
    var itemLayout: js.UndefOr[String] = js.undefined
  }
  object ListConsumerProps {
    
    inline def apply(): ListConsumerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListConsumerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListConsumerProps] (val x: Self) extends AnyVal {
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setItemLayout(value: String): Self = StObject.set(x, "itemLayout", value.asInstanceOf[js.Any])
      
      inline def setItemLayoutUndefined: Self = StObject.set(x, "itemLayout", js.undefined)
    }
  }
  
  trait ListGridType extends StObject {
    
    var column: js.UndefOr[ColumnCount] = js.undefined
    
    var gutter: js.UndefOr[Double] = js.undefined
    
    var lg: js.UndefOr[ColumnCount] = js.undefined
    
    var md: js.UndefOr[ColumnCount] = js.undefined
    
    var sm: js.UndefOr[ColumnCount] = js.undefined
    
    var xl: js.UndefOr[ColumnCount] = js.undefined
    
    var xs: js.UndefOr[ColumnCount] = js.undefined
    
    var xxl: js.UndefOr[ColumnCount] = js.undefined
  }
  object ListGridType {
    
    inline def apply(): ListGridType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGridType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListGridType] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: ColumnCount): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setLg(value: ColumnCount): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: ColumnCount): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: ColumnCount): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: ColumnCount): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: ColumnCount): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: ColumnCount): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.horizontal
    - typings.antd.antdStrings.vertical
  */
  trait ListItemLayout extends StObject
  object ListItemLayout {
    
    inline def horizontal: typings.antd.antdStrings.horizontal = "horizontal".asInstanceOf[typings.antd.antdStrings.horizontal]
    
    inline def vertical: typings.antd.antdStrings.vertical = "vertical".asInstanceOf[typings.antd.antdStrings.vertical]
  }
  
  trait ListLocale extends StObject {
    
    var emptyText: ReactNode
  }
  object ListLocale {
    
    inline def apply(): ListLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListLocale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListLocale] (val x: Self) extends AnyVal {
      
      inline def setEmptyText(value: ReactNode): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
    }
  }
  
  trait ListProps[T] extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataSource: js.UndefOr[js.Array[T]] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var grid: js.UndefOr[ListGridType] = js.undefined
    
    var header: js.UndefOr[ReactNode] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var itemLayout: js.UndefOr[ListItemLayout] = js.undefined
    
    var loadMore: js.UndefOr[ReactNode] = js.undefined
    
    var loading: js.UndefOr[Boolean | SpinProps] = js.undefined
    
    var locale: js.UndefOr[ListLocale] = js.undefined
    
    var pagination: js.UndefOr[PaginationConfig | `false`] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderItem: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, ReactNode]] = js.undefined
    
    var rowKey: js.UndefOr[(js.Function1[/* item */ T, Key]) | (/* keyof T */ String)] = js.undefined
    
    var size: js.UndefOr[ListSize] = js.undefined
    
    var split: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ListProps {
    
    inline def apply[T](): ListProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListProps[?], T] (val x: Self & ListProps[T]) extends AnyVal {
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataSource(value: js.Array[T]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: T*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setGrid(value: ListGridType): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemLayout(value: ListItemLayout): Self = StObject.set(x, "itemLayout", value.asInstanceOf[js.Any])
      
      inline def setItemLayoutUndefined: Self = StObject.set(x, "itemLayout", js.undefined)
      
      inline def setLoadMore(value: ReactNode): Self = StObject.set(x, "loadMore", value.asInstanceOf[js.Any])
      
      inline def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      inline def setLoading(value: Boolean | SpinProps): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLocale(value: ListLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPagination(value: PaginationConfig | `false`): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRenderItem(value: (/* item */ T, /* index */ Double) => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      inline def setRowKey(value: (js.Function1[/* item */ T, Key]) | (/* keyof T */ String)): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      inline def setRowKeyFunction1(value: /* item */ T => Key): Self = StObject.set(x, "rowKey", js.Any.fromFunction1(value))
      
      inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      inline def setSize(value: ListSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.small
    - typings.antd.antdStrings.default
    - typings.antd.antdStrings.large
  */
  trait ListSize extends StObject
  object ListSize {
    
    inline def default: typings.antd.antdStrings.default = "default".asInstanceOf[typings.antd.antdStrings.default]
    
    inline def large: typings.antd.antdStrings.large = "large".asInstanceOf[typings.antd.antdStrings.large]
    
    inline def small: typings.antd.antdStrings.small = "small".asInstanceOf[typings.antd.antdStrings.small]
  }
}
