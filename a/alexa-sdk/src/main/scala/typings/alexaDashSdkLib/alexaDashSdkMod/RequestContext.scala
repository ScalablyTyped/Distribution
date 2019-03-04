package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestContext extends js.Object {
  var AudioPlayer: js.UndefOr[AudioPlayer] = js.undefined
  var Display: js.UndefOr[Display] = js.undefined
  var System: System
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

