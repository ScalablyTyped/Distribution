package typings.activexOutlook

import typings.activexOutlook.Outlook.OlSyncState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  val Description: String
  val Max: Double
  val State: OlSyncState
  val Value: Double
}

object AnonDescription {
  @scala.inline
  def apply(Description: String, Max: Double, State: OlSyncState, Value: Double): AnonDescription = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

