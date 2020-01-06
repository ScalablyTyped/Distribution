package typings.awsDashSdk

import typings.awsDashSdk.clientsS3Mod.ContinuationEvent
import typings.awsDashSdk.clientsS3Mod.EndEvent
import typings.awsDashSdk.clientsS3Mod.ProgressEvent
import typings.awsDashSdk.clientsS3Mod.RecordsEvent
import typings.awsDashSdk.clientsS3Mod.StatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Cont extends js.Object {
  var Cont: js.UndefOr[ContinuationEvent] = js.native
  var End: js.UndefOr[EndEvent] = js.native
  var Progress: js.UndefOr[ProgressEvent] = js.native
  var Records: js.UndefOr[RecordsEvent] = js.native
  var Stats: js.UndefOr[StatsEvent] = js.native
}

object Anon_Cont {
  @scala.inline
  def apply(
    Cont: ContinuationEvent = null,
    End: EndEvent = null,
    Progress: ProgressEvent = null,
    Records: RecordsEvent = null,
    Stats: StatsEvent = null
  ): Anon_Cont = {
    val __obj = js.Dynamic.literal()
    if (Cont != null) __obj.updateDynamic("Cont")(Cont.asInstanceOf[js.Any])
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (Records != null) __obj.updateDynamic("Records")(Records.asInstanceOf[js.Any])
    if (Stats != null) __obj.updateDynamic("Stats")(Stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cont]
  }
}

