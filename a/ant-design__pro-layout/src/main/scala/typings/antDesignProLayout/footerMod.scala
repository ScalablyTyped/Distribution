package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProLayout.anon.BlankTarget
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/Footer", JSImport.Default)
  @js.native
  val default: FC[FooterProps] = js.native
  
  trait FooterProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var copyright: js.UndefOr[WithFalse[String]] = js.undefined
    
    var links: js.UndefOr[WithFalse[js.Array[BlankTarget]]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FooterProps {
    
    @scala.inline
    def apply(): FooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterProps]
    }
    
    @scala.inline
    implicit class FooterPropsMutableBuilder[Self <: FooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCopyright(value: WithFalse[String]): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setLinks(value: WithFalse[js.Array[BlankTarget]]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      @scala.inline
      def setLinksVarargs(value: BlankTarget*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[FooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `footerMod.foo` */
  override def _to: FC[FooterProps] = default
}
