package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticipantDetails extends js.Object {
  /**
    * Display name of the participant.
    */
  var DisplayName: typings.awsDashSdk.clientsConnectMod.DisplayName = js.native
}

object ParticipantDetails {
  @scala.inline
  def apply(DisplayName: DisplayName): ParticipantDetails = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParticipantDetails]
  }
}

