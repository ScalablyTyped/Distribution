package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.OlSyncState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  val Description: String
  val Max: Double
  val State: OlSyncState
  val Value: Double
}

object Anon_Description {
  @scala.inline
  def apply(Description: String, Max: Double, State: OlSyncState, Value: Double): Anon_Description = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Description]
  }
}

