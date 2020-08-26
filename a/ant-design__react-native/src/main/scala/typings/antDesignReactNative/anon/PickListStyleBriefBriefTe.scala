package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/list/style.ListStyle, 'Brief' | 'BriefText'> */
@js.native
trait PickListStyleBriefBriefTe extends js.Object {
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
  implicit class PickListStyleBriefBriefTeOps[Self <: PickListStyleBriefBriefTe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrief(value: ViewStyle): Self = this.set("Brief", value.asInstanceOf[js.Any])
    @scala.inline
    def setBriefText(value: TextStyle): Self = this.set("BriefText", value.asInstanceOf[js.Any])
  }
  
}

