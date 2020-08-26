package typings.actionsOnGoogle.anon

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionDotdevicesDotDISCONNECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intent extends js.Object {
  var intent: actionDotdevicesDotDISCONNECT = js.native
}

object Intent {
  @scala.inline
  def apply(intent: actionDotdevicesDotDISCONNECT): Intent = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intent]
  }
  @scala.inline
  implicit class IntentOps[Self <: Intent] (val x: Self) extends AnyVal {
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
    def setIntent(value: actionDotdevicesDotDISCONNECT): Self = this.set("intent", value.asInstanceOf[js.Any])
  }
  
}

