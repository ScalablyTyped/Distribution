package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressCandidateProperties extends js.Object {
  /**
    * Address of the candidate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#address)
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * Name value pairs of field name and field value as defined in `outFields` in [Locator.addressToLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#attributes)
    */
  var attributes: js.UndefOr[js.Any] = js.undefined
  /**
    * The minimum and maximum X and Y coordinates of a bounding box of the address candidate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * The [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) object representing the location of the [address](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#address).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.undefined
  /**
    * Numeric score between `0` and `100` for geocode candidates. A candidate with a score of `100` means a perfect match, and `0` means no match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#score)
    */
  var score: js.UndefOr[Double] = js.undefined
}

object AddressCandidateProperties {
  @scala.inline
  def apply(
    address: String = null,
    attributes: js.Any = null,
    extent: ExtentProperties = null,
    location: PointProperties = null,
    score: Int | Double = null
  ): AddressCandidateProperties = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressCandidateProperties]
  }
}

