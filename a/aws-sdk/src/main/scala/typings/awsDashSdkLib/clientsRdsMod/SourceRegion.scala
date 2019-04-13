package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceRegion extends js.Object {
  /**
    * The endpoint for the source AWS Region endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.undefined
  /**
    * The name of the source AWS Region.
    */
  var RegionName: js.UndefOr[String] = js.undefined
  /**
    * The status of the source AWS Region.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object SourceRegion {
  @scala.inline
  def apply(Endpoint: String = null, RegionName: String = null, Status: String = null): SourceRegion = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[SourceRegion]
  }
}

