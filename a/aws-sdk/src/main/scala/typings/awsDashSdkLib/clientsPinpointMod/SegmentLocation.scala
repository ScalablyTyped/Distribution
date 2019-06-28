package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentLocation extends js.Object {
  /**
    * The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
    */
  var Country: js.UndefOr[SetDimension] = js.undefined
  /**
    * The GPS location and range for the segment.
    */
  var GPSPoint: js.UndefOr[GPSPointDimension] = js.undefined
}

object SegmentLocation {
  @scala.inline
  def apply(Country: SetDimension = null, GPSPoint: GPSPointDimension = null): SegmentLocation = {
    val __obj = js.Dynamic.literal()
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (GPSPoint != null) __obj.updateDynamic("GPSPoint")(GPSPoint)
    __obj.asInstanceOf[SegmentLocation]
  }
}

