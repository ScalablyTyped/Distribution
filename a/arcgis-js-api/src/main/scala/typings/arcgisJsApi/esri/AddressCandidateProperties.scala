package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressCandidateProperties extends StObject {
  
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
    * Numeric score between `0` and `100` for geocode candidates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AddressCandidate.html#score)
    */
  var score: js.UndefOr[Double] = js.undefined
}
object AddressCandidateProperties {
  
  @scala.inline
  def apply(): AddressCandidateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressCandidateProperties]
  }
  
  @scala.inline
  implicit class AddressCandidatePropertiesMutableBuilder[Self <: AddressCandidateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setLocation(value: PointProperties): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
