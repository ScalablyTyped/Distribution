package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button extends js.Object {
  @JSName("InfoPath.Button_typekey")
  var InfoPathDotButton_typekey: Button = js.native
}

object Button {
  @scala.inline
  def apply(InfoPathDotButton_typekey: Button): Button = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.Button_typekey")(InfoPathDotButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
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
    def setInfoPathDotButton_typekey(value: Button): Self = this.set("InfoPath.Button_typekey", value.asInstanceOf[js.Any])
  }
  
}

