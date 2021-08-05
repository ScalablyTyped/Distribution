package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/list/style.ListStyle, 'Brief' | 'BriefText'> */
trait PickListStyleBriefBriefTe extends StObject {
  
  var Brief: ViewStyle
  
  var BriefText: TextStyle
}
object PickListStyleBriefBriefTe {
  
  inline def apply(Brief: ViewStyle, BriefText: TextStyle): PickListStyleBriefBriefTe = {
    val __obj = js.Dynamic.literal(Brief = Brief.asInstanceOf[js.Any], BriefText = BriefText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListStyleBriefBriefTe]
  }
  
  extension [Self <: PickListStyleBriefBriefTe](x: Self) {
    
    inline def setBrief(value: ViewStyle): Self = StObject.set(x, "Brief", value.asInstanceOf[js.Any])
    
    inline def setBriefText(value: TextStyle): Self = StObject.set(x, "BriefText", value.asInstanceOf[js.Any])
  }
}
