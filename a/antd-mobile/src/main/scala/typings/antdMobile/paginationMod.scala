package typings.antdMobile

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.Current
import typings.antdMobile.paginationPropsTypeMod.PaginationPropsType
import typings.antdMobile.paginationPropsTypeMod.PaginationState
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("antd-mobile/lib/pagination", JSImport.Default)
  @js.native
  class default protected () extends Pagination {
    def this(props: PaginationProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/pagination", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/pagination", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/pagination", "default.defaultProps")
    @js.native
    def defaultProps: Current = js.native
    @scala.inline
    def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Pagination
    extends Component[PaginationProps, PaginationState, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MPagination(nextProps: PaginationProps): Unit = js.native
    
    def onChange(p: Double): Unit = js.native
  }
  
  @js.native
  trait PaginationProps extends PaginationPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object PaginationProps {
    
    @scala.inline
    def apply(current: Double, total: Double): PaginationProps = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
