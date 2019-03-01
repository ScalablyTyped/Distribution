package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cont extends js.Object {
  var Cont: js.UndefOr[awsDashSdkLib.clientsS3Mod.S3Ns.ContinuationEvent] = js.undefined
  var End: js.UndefOr[awsDashSdkLib.clientsS3Mod.S3Ns.EndEvent] = js.undefined
  var Progress: js.UndefOr[awsDashSdkLib.clientsS3Mod.S3Ns.ProgressEvent] = js.undefined
  var Records: js.UndefOr[awsDashSdkLib.clientsS3Mod.S3Ns.RecordsEvent] = js.undefined
  var Stats: js.UndefOr[awsDashSdkLib.clientsS3Mod.S3Ns.StatsEvent] = js.undefined
}

object Anon_Cont {
  @scala.inline
  def apply(
    Cont: awsDashSdkLib.clientsS3Mod.S3Ns.ContinuationEvent = null,
    End: awsDashSdkLib.clientsS3Mod.S3Ns.EndEvent = null,
    Progress: awsDashSdkLib.clientsS3Mod.S3Ns.ProgressEvent = null,
    Records: awsDashSdkLib.clientsS3Mod.S3Ns.RecordsEvent = null,
    Stats: awsDashSdkLib.clientsS3Mod.S3Ns.StatsEvent = null
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

