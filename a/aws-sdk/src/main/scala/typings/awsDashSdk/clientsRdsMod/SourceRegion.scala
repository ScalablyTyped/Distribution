package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceRegion extends js.Object {
  /**
    * The endpoint for the source AWS Region endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * The name of the source AWS Region.
    */
  var RegionName: js.UndefOr[String] = js.native
  /**
    * The status of the source AWS Region.
    */
  var Status: js.UndefOr[String] = js.native
}

object SourceRegion {
  @scala.inline
  def apply(Endpoint: String = null, RegionName: String = null, Status: String = null): SourceRegion = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRegion]
  }
}

