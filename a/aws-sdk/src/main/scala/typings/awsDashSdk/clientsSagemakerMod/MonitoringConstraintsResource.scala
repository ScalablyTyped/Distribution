package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringConstraintsResource extends js.Object {
  /**
    * The Amazon S3 URI for the constraints resource.
    */
  var S3Uri: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.S3Uri] = js.native
}

object MonitoringConstraintsResource {
  @scala.inline
  def apply(S3Uri: S3Uri = null): MonitoringConstraintsResource = {
    val __obj = js.Dynamic.literal()
    if (S3Uri != null) __obj.updateDynamic("S3Uri")(S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringConstraintsResource]
  }
}

