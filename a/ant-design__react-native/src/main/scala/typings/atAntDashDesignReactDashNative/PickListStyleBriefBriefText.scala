package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/list/style.ListStyle, 'Brief' | 'BriefText'> */
trait PickListStyleBriefBriefText extends js.Object {
  var Brief: ViewStyle
  var BriefText: TextStyle
}

object PickListStyleBriefBriefText {
  @scala.inline
  def apply(Brief: ViewStyle, BriefText: TextStyle): PickListStyleBriefBriefText = {
    val __obj = js.Dynamic.literal(Brief = Brief.asInstanceOf[js.Any], BriefText = BriefText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickListStyleBriefBriefText]
  }
}

