package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHealthChecksResponse extends js.Object {
  /**
    * A complex type that contains one HealthCheck element for each health check that is associated with the current AWS account.
    */
  var HealthChecks: awsDashSdkLib.clientsRoute53Mod.HealthChecks
  /**
    * A flag that indicates whether there are more health checks to be listed. If the response was truncated, you can get the next group of health checks by submitting another ListHealthChecks request and specifying the value of NextMarker in the marker parameter.
    */
  var IsTruncated: PageTruncated
  /**
    * For the second and subsequent calls to ListHealthChecks, Marker is the value that you specified for the marker parameter in the previous request.
    */
  var Marker: PageMarker
  /**
    * The value that you specified for the maxitems parameter in the call to ListHealthChecks that produced the current response.
    */
  var MaxItems: PageMaxItems
  /**
    * If IsTruncated is true, the value of NextMarker identifies the first health check that Amazon Route 53 returns if you submit another ListHealthChecks request and specify the value of NextMarker in the marker parameter.
    */
  var NextMarker: js.UndefOr[PageMarker] = js.undefined
}

object ListHealthChecksResponse {
  @scala.inline
  def apply(
    HealthChecks: HealthChecks,
    IsTruncated: PageTruncated,
    Marker: PageMarker,
    MaxItems: PageMaxItems,
    NextMarker: PageMarker = null
  ): ListHealthChecksResponse = {
    val __obj = js.Dynamic.literal(HealthChecks = HealthChecks, IsTruncated = IsTruncated, Marker = Marker, MaxItems = MaxItems)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListHealthChecksResponse]
  }
}

