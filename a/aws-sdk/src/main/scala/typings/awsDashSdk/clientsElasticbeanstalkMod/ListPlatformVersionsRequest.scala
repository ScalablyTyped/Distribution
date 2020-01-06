package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformVersionsRequest extends js.Object {
  /**
    * List only the platforms where the platform member value relates to one of the supplied values.
    */
  var Filters: js.UndefOr[PlatformFilters] = js.native
  /**
    * The maximum number of platform values returned in one call.
    */
  var MaxRecords: js.UndefOr[PlatformMaxRecords] = js.native
  /**
    * The starting index into the remaining list of platforms. Use the NextToken value from a previous ListPlatformVersion call.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListPlatformVersionsRequest {
  @scala.inline
  def apply(Filters: PlatformFilters = null, MaxRecords: Int | Double = null, NextToken: Token = null): ListPlatformVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlatformVersionsRequest]
  }
}

