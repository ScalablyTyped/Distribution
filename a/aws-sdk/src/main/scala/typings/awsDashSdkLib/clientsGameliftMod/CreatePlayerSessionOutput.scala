package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlayerSessionOutput extends js.Object {
  /**
    * Object that describes the newly created player session record.
    */
  var PlayerSession: js.UndefOr[PlayerSession] = js.undefined
}

object CreatePlayerSessionOutput {
  @scala.inline
  def apply(PlayerSession: PlayerSession = null): CreatePlayerSessionOutput = {
    val __obj = js.Dynamic.literal()
    if (PlayerSession != null) __obj.updateDynamic("PlayerSession")(PlayerSession)
    __obj.asInstanceOf[CreatePlayerSessionOutput]
  }
}

