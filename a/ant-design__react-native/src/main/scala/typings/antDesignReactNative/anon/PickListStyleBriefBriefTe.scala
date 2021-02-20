package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/list/style.ListStyle, 'Brief' | 'BriefText'> */
@js.native
trait PickListStyleBriefBriefTe extends StObject {
  
  var Brief: ViewStyle = js.native
  
  var BriefText: TextStyle = js.native
}
object PickListStyleBriefBriefTe {
  
  @scala.inline
  def apply(Brief: ViewStyle, BriefText: TextStyle): PickListStyleBriefBriefTe = {
    val __obj = js.Dynamic.literal(Brief = Brief.asInstanceOf[js.Any], BriefText = BriefText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListStyleBriefBriefTe]
  }
  
  @scala.inline
  implicit class PickListStyleBriefBriefTeMutableBuilder[Self <: PickListStyleBriefBriefTe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrief(value: ViewStyle): Self = StObject.set(x, "Brief", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBriefText(value: TextStyle): Self = StObject.set(x, "BriefText", value.asInstanceOf[js.Any])
  }
}
