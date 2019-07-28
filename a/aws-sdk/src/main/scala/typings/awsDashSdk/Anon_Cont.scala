package typings.awsDashSdk

import typings.awsDashSdk.clientsS3Mod.ContinuationEvent
import typings.awsDashSdk.clientsS3Mod.EndEvent
import typings.awsDashSdk.clientsS3Mod.ProgressEvent
import typings.awsDashSdk.clientsS3Mod.RecordsEvent
import typings.awsDashSdk.clientsS3Mod.StatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cont extends js.Object {
  var Cont: js.UndefOr[ContinuationEvent] = js.undefined
  var End: js.UndefOr[EndEvent] = js.undefined
  var Progress: js.UndefOr[ProgressEvent] = js.undefined
  var Records: js.UndefOr[RecordsEvent] = js.undefined
  var Stats: js.UndefOr[StatsEvent] = js.undefined
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
    if (Cont != null) __obj.updateDynamic("Cont")(Cont)
    if (End != null) __obj.updateDynamic("End")(End)
    if (Progress != null) __obj.updateDynamic("Progress")(Progress)
    if (Records != null) __obj.updateDynamic("Records")(Records)
    if (Stats != null) __obj.updateDynamic("Stats")(Stats)
    __obj.asInstanceOf[Anon_Cont]
  }
}

