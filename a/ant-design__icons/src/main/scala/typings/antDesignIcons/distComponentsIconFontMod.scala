package typings.antDesignIcons

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIcons.distComponentsIconMod.IconBaseProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsIconFontMod {
  
  @JSImport("@ant-design/icons/dist/components/IconFont", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: String */](): FC[IconFontProps[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[FC[IconFontProps[T]]]
  inline def default[T /* <: String */](options: CustomIconOptions): FC[IconFontProps[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[FC[IconFontProps[T]]]
  
  trait CustomIconOptions extends StObject {
    
    var extraCommonProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var scriptUrl: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object CustomIconOptions {
    
    inline def apply(): CustomIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomIconOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomIconOptions] (val x: Self) extends AnyVal {
      
      inline def setExtraCommonProps(value: StringDictionary[Any]): Self = StObject.set(x, "extraCommonProps", value.asInstanceOf[js.Any])
      
      inline def setExtraCommonPropsUndefined: Self = StObject.set(x, "extraCommonProps", js.undefined)
      
      inline def setScriptUrl(value: String | js.Array[String]): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
      
      inline def setScriptUrlUndefined: Self = StObject.set(x, "scriptUrl", js.undefined)
      
      inline def setScriptUrlVarargs(value: String*): Self = StObject.set(x, "scriptUrl", js.Array(value*))
    }
  }
  
  trait IconFontProps[T /* <: String */]
    extends StObject
       with IconBaseProps {
    
    @JSName("type")
    var type_IconFontProps: T
  }
  object IconFontProps {
    
    inline def apply[T /* <: String */](`type`: T): IconFontProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconFontProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconFontProps[?], T /* <: String */] (val x: Self & IconFontProps[T]) extends AnyVal {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
