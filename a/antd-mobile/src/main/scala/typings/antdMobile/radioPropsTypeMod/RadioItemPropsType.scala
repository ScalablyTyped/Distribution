package typings.antdMobile.radioPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioItemPropsType extends RadioPropsType {
  var onClick: js.UndefOr[js.Function0[_]] = js.native
  var radioProps: js.UndefOr[js.Object] = js.native
}

object RadioItemPropsType {
  @scala.inline
  def apply(): RadioItemPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioItemPropsType]
  }
  @scala.inline
  implicit class RadioItemPropsTypeOps[Self <: RadioItemPropsType] (val x: Self) extends AnyVal {
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
    def setOnClick(value: () => _): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setRadioProps(value: js.Object): Self = this.set("radioProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioProps: Self = this.set("radioProps", js.undefined)
  }
  
}

