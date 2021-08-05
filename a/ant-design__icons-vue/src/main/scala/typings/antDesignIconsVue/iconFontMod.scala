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
  
  inline def default(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function]
  inline def default(options: CustomIconOptions): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  trait CustomIconOptions extends StObject {
    
    var extraCommonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var scriptUrl: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object CustomIconOptions {
    
    inline def apply(): CustomIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomIconOptions]
    }
    
    extension [Self <: CustomIconOptions](x: Self) {
      
      inline def setExtraCommonProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "extraCommonProps", value.asInstanceOf[js.Any])
      
      inline def setExtraCommonPropsUndefined: Self = StObject.set(x, "extraCommonProps", js.undefined)
      
      inline def setScriptUrl(value: String | js.Array[String]): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
      
      inline def setScriptUrlUndefined: Self = StObject.set(x, "scriptUrl", js.undefined)
      
      inline def setScriptUrlVarargs(value: String*): Self = StObject.set(x, "scriptUrl", js.Array(value :_*))
    }
  }
  
  trait IconFontProps
    extends StObject
       with IconBaseProps {
    
    var `type`: String
  }
  object IconFontProps {
    
    inline def apply(`type`: String): IconFontProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconFontProps]
    }
    
    extension [Self <: IconFontProps](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
