package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestContext extends js.Object {
  var AudioPlayer: js.UndefOr[typings.alexaSdk.mod.AudioPlayer] = js.native
  var Display: js.UndefOr[typings.alexaSdk.mod.Display] = js.native
  var System: typings.alexaSdk.mod.System = js.native
}

object RequestContext {
  @scala.inline
  def apply(System: System): RequestContext = {
    val __obj = js.Dynamic.literal(System = System.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestContext]
  }
  @scala.inline
  implicit class RequestContextOps[Self <: RequestContext] (val x: Self) extends AnyVal {
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
    def setSystem(value: System): Self = this.set("System", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioPlayer(value: AudioPlayer): Self = this.set("AudioPlayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioPlayer: Self = this.set("AudioPlayer", js.undefined)
    @scala.inline
    def setDisplay(value: Display): Self = this.set("Display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("Display", js.undefined)
  }
  
}

