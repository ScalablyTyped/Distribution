package typings.antdMobile

import typings.react.mod.AriaAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsNativePropsMod {
  
  @JSImport("antd-mobile/es/utils/native-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withNativeProps[P /* <: NativeProps[scala.Nothing] */](props: P, element: ReactElement): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("withNativeProps")(props.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  trait NativeProps[S /* <: String */]
    extends StObject
       with AriaAttributes {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties & (Partial[Record[S, String]])] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object NativeProps {
    
    inline def apply[S /* <: String */](): NativeProps[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps[S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeProps[?], S /* <: String */] (val x: Self & NativeProps[S]) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties & (Partial[Record[S, String]])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
}
