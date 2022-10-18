package typings.antDesignProLayout

import typings.antDesignProLayout.anon.BlankTarget
import typings.antDesignProLayout.esTypingsMod.WithFalse
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsGlobalFooterMod {
  
  @JSImport("@ant-design/pro-layout/es/components/GlobalFooter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GlobalFooter(hasClassNamePrefixClsLinksCopyrightStyle: GlobalFooterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("GlobalFooter")(hasClassNamePrefixClsLinksCopyrightStyle.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait GlobalFooterProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var copyright: js.UndefOr[ReactNode] = js.undefined
    
    var links: js.UndefOr[WithFalse[js.Array[BlankTarget]]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object GlobalFooterProps {
    
    inline def apply(): GlobalFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalFooterProps]
    }
    
    extension [Self <: GlobalFooterProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCopyright(value: ReactNode): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setLinks(value: WithFalse[js.Array[BlankTarget]]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: BlankTarget*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
