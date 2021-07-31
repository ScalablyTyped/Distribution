package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.GoButton
import typings.antd.antdStrings.`jump-next`
import typings.antd.antdStrings.`jump-prev`
import typings.antd.antdStrings.next
import typings.antd.antdStrings.page
import typings.antd.antdStrings.prev
import typings.antd.antdStrings.small
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationPaginationMod extends Shortcut {
  
  @JSImport("antd/lib/pagination/Pagination", JSImport.Default)
  @js.native
  val default: FC[PaginationProps] = js.native
  
  trait PaginationConfig
    extends StObject
       with PaginationProps {
    
    var position: js.UndefOr[PaginationPosition] = js.undefined
  }
  object PaginationConfig {
    
    @scala.inline
    def apply(): PaginationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationConfig]
    }
    
    @scala.inline
    implicit class PaginationConfigMutableBuilder[Self <: PaginationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: PaginationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  type PaginationLocale = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.top
    - typings.antd.antdStrings.bottom
    - typings.antd.antdStrings.both
  */
  trait PaginationPosition extends StObject
  object PaginationPosition {
    
    @scala.inline
    def both: typings.antd.antdStrings.both = "both".asInstanceOf[typings.antd.antdStrings.both]
    
    @scala.inline
    def bottom: typings.antd.antdStrings.bottom = "bottom".asInstanceOf[typings.antd.antdStrings.bottom]
    
    @scala.inline
    def top: typings.antd.antdStrings.top = "top".asInstanceOf[typings.antd.antdStrings.top]
  }
  
  trait PaginationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var current: js.UndefOr[Double] = js.undefined
    
    var defaultCurrent: js.UndefOr[Double] = js.undefined
    
    var defaultPageSize: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hideOnSinglePage: js.UndefOr[Boolean] = js.undefined
    
    var itemRender: js.UndefOr[
        js.Function3[
          /* page */ Double, 
          /* type */ page | prev | next | `jump-prev` | `jump-next`, 
          /* originalElement */ ReactElement, 
          ReactNode
        ]
      ] = js.undefined
    
    var locale: js.UndefOr[js.Object] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ js.UndefOr[Double], Unit]] = js.undefined
    
    var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageSizeOptions: js.UndefOr[js.Array[String]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var selectPrefixCls: js.UndefOr[String] = js.undefined
    
    var showLessItems: js.UndefOr[Boolean] = js.undefined
    
    var showQuickJumper: js.UndefOr[Boolean | GoButton] = js.undefined
    
    var showSizeChanger: js.UndefOr[Boolean] = js.undefined
    
    var showTitle: js.UndefOr[Boolean] = js.undefined
    
    var showTotal: js.UndefOr[
        js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], ReactNode]
      ] = js.undefined
    
    var simple: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[typings.antd.antdStrings.default | small] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    @scala.inline
    def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCurrentUndefined: Self = StObject.set(x, "defaultCurrent", js.undefined)
      
      @scala.inline
      def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPageSizeUndefined: Self = StObject.set(x, "defaultPageSize", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHideOnSinglePage(value: Boolean): Self = StObject.set(x, "hideOnSinglePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnSinglePageUndefined: Self = StObject.set(x, "hideOnSinglePage", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* originalElement */ ReactElement) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* page */ Double, /* pageSize */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnShowSizeChange(value: (/* current */ Double, /* size */ Double) => Unit): Self = StObject.set(x, "onShowSizeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShowSizeChangeUndefined: Self = StObject.set(x, "onShowSizeChange", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptions(value: js.Array[String]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptionsUndefined: Self = StObject.set(x, "pageSizeOptions", js.undefined)
      
      @scala.inline
      def setPageSizeOptionsVarargs(value: String*): Self = StObject.set(x, "pageSizeOptions", js.Array(value :_*))
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectPrefixClsUndefined: Self = StObject.set(x, "selectPrefixCls", js.undefined)
      
      @scala.inline
      def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLessItemsUndefined: Self = StObject.set(x, "showLessItems", js.undefined)
      
      @scala.inline
      def setShowQuickJumper(value: Boolean | GoButton): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowQuickJumperUndefined: Self = StObject.set(x, "showQuickJumper", js.undefined)
      
      @scala.inline
      def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSizeChangerUndefined: Self = StObject.set(x, "showSizeChanger", js.undefined)
      
      @scala.inline
      def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
      
      @scala.inline
      def setShowTotal(value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactNode): Self = StObject.set(x, "showTotal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShowTotalUndefined: Self = StObject.set(x, "showTotal", js.undefined)
      
      @scala.inline
      def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      @scala.inline
      def setSize(value: typings.antd.antdStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  type _To = FC[PaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `paginationPaginationMod.foo` */
  override def _to: FC[PaginationProps] = default
}
