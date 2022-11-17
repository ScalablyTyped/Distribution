package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.AddSider
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayoutLayoutMod extends Shortcut {
  
  @JSImport("antd/lib/layout/layout", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]] = js.native
  
  @JSImport("antd/lib/layout/layout", "Content")
  @js.native
  val Content: ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]] = js.native
  
  @JSImport("antd/lib/layout/layout", "Footer")
  @js.native
  val Footer: ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]] = js.native
  
  @JSImport("antd/lib/layout/layout", "Header")
  @js.native
  val Header: ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]] = js.native
  
  @JSImport("antd/lib/layout/layout", "LayoutContext")
  @js.native
  val LayoutContext: Context[LayoutContextProps] = js.native
  
  trait BasicProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var hasSider: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object BasicProps {
    
    inline def apply(): BasicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicProps]
    }
    
    extension [Self <: BasicProps](x: Self) {
      
      inline def setHasSider(value: Boolean): Self = StObject.set(x, "hasSider", value.asInstanceOf[js.Any])
      
      inline def setHasSiderUndefined: Self = StObject.set(x, "hasSider", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  trait GeneratorProps extends StObject {
    
    var displayName: String
    
    var suffixCls: String
    
    var tagName: "header" | "footer" | "main" | "section"
  }
  object GeneratorProps {
    
    inline def apply(displayName: String, suffixCls: String, tagName: "header" | "footer" | "main" | "section"): GeneratorProps = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], suffixCls = suffixCls.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratorProps]
    }
    
    extension [Self <: GeneratorProps](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setSuffixCls(value: String): Self = StObject.set(x, "suffixCls", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: "header" | "footer" | "main" | "section"): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutContextProps extends StObject {
    
    var siderHook: AddSider
  }
  object LayoutContextProps {
    
    inline def apply(siderHook: AddSider): LayoutContextProps = {
      val __obj = js.Dynamic.literal(siderHook = siderHook.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutContextProps]
    }
    
    extension [Self <: LayoutContextProps](x: Self) {
      
      inline def setSiderHook(value: AddSider): Self = StObject.set(x, "siderHook", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libLayoutLayoutMod.foo` */
  override def _to: ForwardRefExoticComponent[BasicProps & RefAttributes[HTMLElement]] = default
}
