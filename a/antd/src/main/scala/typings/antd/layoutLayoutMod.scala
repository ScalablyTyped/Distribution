package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.AddSider
import typings.antd.antdStrings.footer
import typings.antd.antdStrings.header
import typings.antd.antdStrings.main
import typings.antd.antdStrings.section
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutLayoutMod extends Shortcut {
  
  @JSImport("antd/lib/layout/layout", JSImport.Default)
  @js.native
  val default: FC[BasicProps] = js.native
  
  @JSImport("antd/lib/layout/layout", "Content")
  @js.native
  val Content: FC[BasicProps] = js.native
  
  @JSImport("antd/lib/layout/layout", "Footer")
  @js.native
  val Footer: FC[BasicProps] = js.native
  
  @JSImport("antd/lib/layout/layout", "Header")
  @js.native
  val Header: FC[BasicProps] = js.native
  
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
    
    @scala.inline
    def apply(): BasicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicProps]
    }
    
    @scala.inline
    implicit class BasicPropsMutableBuilder[Self <: BasicProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasSider(value: Boolean): Self = StObject.set(x, "hasSider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSiderUndefined: Self = StObject.set(x, "hasSider", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  trait GeneratorProps extends StObject {
    
    var displayName: String
    
    var suffixCls: String
    
    var tagName: header | footer | main | section
  }
  object GeneratorProps {
    
    @scala.inline
    def apply(displayName: String, suffixCls: String, tagName: header | footer | main | section): GeneratorProps = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], suffixCls = suffixCls.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratorProps]
    }
    
    @scala.inline
    implicit class GeneratorPropsMutableBuilder[Self <: GeneratorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixCls(value: String): Self = StObject.set(x, "suffixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagName(value: header | footer | main | section): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutContextProps extends StObject {
    
    var siderHook: AddSider
  }
  object LayoutContextProps {
    
    @scala.inline
    def apply(siderHook: AddSider): LayoutContextProps = {
      val __obj = js.Dynamic.literal(siderHook = siderHook.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutContextProps]
    }
    
    @scala.inline
    implicit class LayoutContextPropsMutableBuilder[Self <: LayoutContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSiderHook(value: AddSider): Self = StObject.set(x, "siderHook", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[BasicProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutLayoutMod.foo` */
  override def _to: FC[BasicProps] = default
}
