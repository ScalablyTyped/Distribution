package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressCandidate
  extends Accessor
     with JSONSupport {
  /**
    * Address of the candidate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#address)
    */
  var address: java.lang.String = js.native
  /**
    * Name value pairs of field name and field value as defined in `outFields` in [Locator.addressToLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#attributes)
    */
  var attributes: js.Any = js.native
  /**
    * The minimum and maximum X and Y coordinates of a bounding box of the address candidate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#extent)
    */
  var extent: Extent = js.native
  /**
    * The [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) object representing the location of the [address](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#address).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#location)
    */
  var location: Point = js.native
  /**
    * Numeric score between `0` and `100` for geocode candidates. A candidate with a score of `100` means a perfect match, and `0` means no match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#score)
    */
  var score: scala.Double = js.native
}

@JSGlobal("__esri.AddressCandidate")
@js.native
class AddressCandidateCls () extends AddressCandidate {
  def this(properties: AddressCandidateProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

