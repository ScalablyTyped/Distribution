package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressCandidateProperties extends StObject {
  
  /**
  		 * Address of the candidate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#address)
  		 */
  var address: js.UndefOr[String] = js.undefined
  
  /**
  		 * Name value pairs of field name and field value as defined in `outFields` in [locator.addressToLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#attributes)
  		 */
  var attributes: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The minimum and maximum X and Y coordinates of a bounding box of the address candidate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#extent)
  		 */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
  		 * The [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) object representing the location of the [address](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#address).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#location)
  		 */
  var location: js.UndefOr[PointProperties] = js.undefined
  
  /**
  		 * Numeric score between `0` and `100` for geocode candidates.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html#score)
  		 */
  var score: js.UndefOr[Double] = js.undefined
}
object AddressCandidateProperties {
  
  inline def apply(): AddressCandidateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressCandidateProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressCandidateProperties] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setLocation(value: PointProperties): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
