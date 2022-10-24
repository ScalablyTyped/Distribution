package typings.antd

import typings.antd.libAnchorAnchorMod.AntAnchor
import typings.antd.libConfigProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnchorAnchorLinkMod {
  
  @JSImport("antd/lib/anchor/AnchorLink", JSImport.Default)
  @js.native
  open class default () extends AnchorLink
  object default {
    
    @JSImport("antd/lib/anchor/AnchorLink", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd/lib/anchor/AnchorLink", "default.contextType")
    @js.native
    def contextType: Context[AntAnchor] = js.native
    inline def contextType_=(x: Context[AntAnchor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd/lib/anchor/AnchorLink", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/anchor/AnchorLink", "default.defaultProps.href")
      @js.native
      def href: String = js.native
      inline def href_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("href")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnchorLink extends Component[AnchorLinkProps, Any, AntAnchor] {
    
    @JSName("componentDidMount")
    def componentDidMount_MAnchorLink(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAnchorLink(param0: AnchorLinkProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAnchorLink(): Unit = js.native
    
    @JSName("context")
    var context_AnchorLink: AntAnchor = js.native
    
    def handleClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    
    def renderAnchorLink(param0: ConfigConsumerProps): Element = js.native
  }
  
  trait AnchorLinkProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var href: String
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var title: ReactNode
  }
  object AnchorLinkProps {
    
    inline def apply(href: String): AnchorLinkProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorLinkProps]
    }
    
    extension [Self <: AnchorLinkProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
