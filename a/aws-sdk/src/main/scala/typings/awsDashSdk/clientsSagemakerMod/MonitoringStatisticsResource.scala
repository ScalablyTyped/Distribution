package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringStatisticsResource extends js.Object {
  /**
    * The Amazon S3 URI for the statistics resource.
    */
  var S3Uri: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.S3Uri] = js.native
}

object MonitoringStatisticsResource {
  @scala.inline
  def apply(S3Uri: S3Uri = null): MonitoringStatisticsResource = {
    val __obj = js.Dynamic.literal()
    if (S3Uri != null) __obj.updateDynamic("S3Uri")(S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringStatisticsResource]
  }
}

