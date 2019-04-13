package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cont extends js.Object {
  var Cont: js.UndefOr[awsDashSdkLib.clientsS3Mod.ContinuationEvent] = js.undefined
  var End: js.UndefOr[awsDashSdkLib.clientsS3Mod.EndEvent] = js.undefined
  var Progress: js.UndefOr[awsDashSdkLib.clientsS3Mod.ProgressEvent] = js.undefined
  var Records: js.UndefOr[awsDashSdkLib.clientsS3Mod.RecordsEvent] = js.undefined
  var Stats: js.UndefOr[awsDashSdkLib.clientsS3Mod.StatsEvent] = js.undefined
}

object Anon_Cont {
  @scala.inline
  def apply(
    Cont: awsDashSdkLib.clientsS3Mod.ContinuationEvent = null,
    End: awsDashSdkLib.clientsS3Mod.EndEvent = null,
    Progress: awsDashSdkLib.clientsS3Mod.ProgressEvent = null,
    Records: awsDashSdkLib.clientsS3Mod.RecordsEvent = null,
    Stats: awsDashSdkLib.clientsS3Mod.StatsEvent = null
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

