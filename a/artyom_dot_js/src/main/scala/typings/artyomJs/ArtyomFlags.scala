package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtyomFlags extends js.Object {
  var restartRecognition: js.UndefOr[Boolean] = js.native
}

object ArtyomFlags {
  @scala.inline
  def apply(): ArtyomFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtyomFlags]
  }
  @scala.inline
  implicit class ArtyomFlagsOps[Self <: ArtyomFlags] (val x: Self) extends AnyVal {
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
    def setRestartRecognition(value: Boolean): Self = this.set("restartRecognition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestartRecognition: Self = this.set("restartRecognition", js.undefined)
  }
  
}

