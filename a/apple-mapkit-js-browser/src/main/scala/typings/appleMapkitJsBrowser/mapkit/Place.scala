package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A place object returned from a geocoder lookup or reverse lookup.
  */
@js.native
trait Place extends StObject {
  
  /**
    * The state or province of the place.
    */
  var administrativeArea: js.UndefOr[String] = js.native
  
  /**
    * The short code for the state or area.
    */
  var administrativeAreaCode: js.UndefOr[String] = js.native
  
  /**
    * Common names of the area in which the place resides.
    */
  var areasOfInterest: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The latitude and longitude for the place.
    */
  var coordinate: Coordinate = js.native
  
  /**
    * The country of the place.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The country code associated with the place.
    */
  var countryCode: String = js.native
  
  /**
    * Common names for the local area or neighborhood of the place.
    */
  var dependentLocalities: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The address of the place, formatted using its country's conventions.
    */
  var formattedAddress: String = js.native
  
  /**
    * A combination of thoroughfare and subthoroughfare.
    */
  var fullThoroughfare: js.UndefOr[String] = js.native
  
  /**
    * The city of the place.
    */
  var locality: js.UndefOr[String] = js.native
  
  /**
    * The name of the place.
    */
  var name: String = js.native
  
  /**
    * The category of the place.
    */
  var pointOfInterestCategory: js.UndefOr[PointOfInterestCategory] = js.native
  
  /**
    * The postal code of the place.
    */
  var postCode: js.UndefOr[String] = js.native
  
  /**
    * The geographic region associated with the place.
    */
  var region: CoordinateRegion = js.native
  
  /**
    * The name of the area within the locality.
    */
  var subLocality: js.UndefOr[String] = js.native
  
  /**
    * The number on the street at the place.
    */
  var subThoroughfare: js.UndefOr[String] = js.native
  
  /**
    * The street name at the place.
    */
  var thoroughfare: js.UndefOr[String] = js.native
}
object Place {
  
  @scala.inline
  def apply(
    coordinate: Coordinate,
    countryCode: String,
    formattedAddress: String,
    name: String,
    region: CoordinateRegion
  ): Place = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Place]
  }
  
  @scala.inline
  implicit class PlaceMutableBuilder[Self <: Place] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministrativeAreaCode(value: String): Self = StObject.set(x, "administrativeAreaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministrativeAreaCodeUndefined: Self = StObject.set(x, "administrativeAreaCode", js.undefined)
    
    @scala.inline
    def setAdministrativeAreaUndefined: Self = StObject.set(x, "administrativeArea", js.undefined)
    
    @scala.inline
    def setAreasOfInterest(value: js.Array[String]): Self = StObject.set(x, "areasOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreasOfInterestUndefined: Self = StObject.set(x, "areasOfInterest", js.undefined)
    
    @scala.inline
    def setAreasOfInterestVarargs(value: String*): Self = StObject.set(x, "areasOfInterest", js.Array(value :_*))
    
    @scala.inline
    def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDependentLocalities(value: js.Array[String]): Self = StObject.set(x, "dependentLocalities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentLocalitiesUndefined: Self = StObject.set(x, "dependentLocalities", js.undefined)
    
    @scala.inline
    def setDependentLocalitiesVarargs(value: String*): Self = StObject.set(x, "dependentLocalities", js.Array(value :_*))
    
    @scala.inline
    def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullThoroughfare(value: String): Self = StObject.set(x, "fullThoroughfare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullThoroughfareUndefined: Self = StObject.set(x, "fullThoroughfare", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointOfInterestCategory(value: PointOfInterestCategory): Self = StObject.set(x, "pointOfInterestCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointOfInterestCategoryUndefined: Self = StObject.set(x, "pointOfInterestCategory", js.undefined)
    
    @scala.inline
    def setPostCode(value: String): Self = StObject.set(x, "postCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostCodeUndefined: Self = StObject.set(x, "postCode", js.undefined)
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLocality(value: String): Self = StObject.set(x, "subLocality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLocalityUndefined: Self = StObject.set(x, "subLocality", js.undefined)
    
    @scala.inline
    def setSubThoroughfare(value: String): Self = StObject.set(x, "subThoroughfare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubThoroughfareUndefined: Self = StObject.set(x, "subThoroughfare", js.undefined)
    
    @scala.inline
    def setThoroughfare(value: String): Self = StObject.set(x, "thoroughfare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThoroughfareUndefined: Self = StObject.set(x, "thoroughfare", js.undefined)
  }
}
