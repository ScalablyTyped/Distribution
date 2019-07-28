package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestContext extends js.Object {
  var AudioPlayer: js.UndefOr[typings.alexaDashSdk.alexaDashSdkMod.AudioPlayer] = js.undefined
  var Display: js.UndefOr[typings.alexaDashSdk.alexaDashSdkMod.Display] = js.undefined
  var System: typings.alexaDashSdk.alexaDashSdkMod.System
}

object RequestContext {
  @scala.inline
  def apply(System: System, AudioPlayer: AudioPlayer = null, Display: Display = null): RequestContext = {
    val __obj = js.Dynamic.literal(System = System)
    if (AudioPlayer != null) __obj.updateDynamic("AudioPlayer")(AudioPlayer)
    if (Display != null) __obj.updateDynamic("Display")(Display)
    __obj.asInstanceOf[RequestContext]
  }
}

