package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deeplink extends js.Object {
  var `deep-link`: String = js.native
  var `group-name`: String = js.native
  var `stream-name`: String = js.native
}

object Deeplink {
  @scala.inline
  def apply(`deep-link`: String, `group-name`: String, `stream-name`: String): Deeplink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deep-link")(`deep-link`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-name")(`group-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("stream-name")(`stream-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deeplink]
  }
  @scala.inline
  implicit class DeeplinkOps[Self <: Deeplink] (val x: Self) extends AnyVal {
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
    def `setDeep-link`(value: String): Self = this.set("deep-link", value.asInstanceOf[js.Any])
    @scala.inline
    def `setGroup-name`(value: String): Self = this.set("group-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `setStream-name`(value: String): Self = this.set("stream-name", value.asInstanceOf[js.Any])
  }
  
}

