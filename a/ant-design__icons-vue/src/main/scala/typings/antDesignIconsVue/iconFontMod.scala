package typings.antDesignIconsVue

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIconsVue.iconMod.IconBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconFontMod {
  
  @JSImport("@ant-design/icons-vue/lib/components/IconFont", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function]
  @scala.inline
  def default(options: CustomIconOptions): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  trait CustomIconOptions extends StObject {
    
    var extraCommonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var scriptUrl: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object CustomIconOptions {
    
    @scala.inline
    def apply(): CustomIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomIconOptions]
    }
    
    @scala.inline
    implicit class CustomIconOptionsMutableBuilder[Self <: CustomIconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraCommonProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "extraCommonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraCommonPropsUndefined: Self = StObject.set(x, "extraCommonProps", js.undefined)
      
      @scala.inline
      def setScriptUrl(value: String | js.Array[String]): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUrlUndefined: Self = StObject.set(x, "scriptUrl", js.undefined)
      
      @scala.inline
      def setScriptUrlVarargs(value: String*): Self = StObject.set(x, "scriptUrl", js.Array(value :_*))
    }
  }
  
  trait IconFontProps
    extends StObject
       with IconBaseProps {
    
    var `type`: String
  }
  object IconFontProps {
    
    @scala.inline
    def apply(`type`: String): IconFontProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconFontProps]
    }
    
    @scala.inline
    implicit class IconFontPropsMutableBuilder[Self <: IconFontProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
