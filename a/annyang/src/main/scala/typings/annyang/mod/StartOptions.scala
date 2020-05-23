package typings.annyang.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOptions extends js.Object {
  /**
    * Should annyang restart itself if it is closed indirectly, because of silence or window conflicts?
    */
  var autoRestart: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow forcing continuous mode on or off. Annyang is pretty smart about this, so only set this if you know what you're doing.
    */
  var continuous: js.UndefOr[Boolean] = js.undefined
}

object StartOptions {
  @scala.inline
  def apply(autoRestart: js.UndefOr[Boolean] = js.undefined, continuous: js.UndefOr[Boolean] = js.undefined): StartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRestart)) __obj.updateDynamic("autoRestart")(autoRestart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOptions]
  }
}

