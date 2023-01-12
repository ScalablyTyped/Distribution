package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A place object returned from a geocoder lookup or reverse lookup.
  */
trait Place extends StObject {
  
  /**
    * The state or province of the place.
    */
  var administrativeArea: js.UndefOr[String] = js.undefined
  
  /**
    * The short code for the state or area.
    */
  var administrativeAreaCode: js.UndefOr[String] = js.undefined
  
  /**
    * Common names of the area in which the place resides.
    */
  var areasOfInterest: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The latitude and longitude for the place.
    */
  var coordinate: Coordinate
  
  /**
    * The country of the place.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The country code associated with the place.
    */
  var countryCode: String
  
  /**
    * Common names for the local area or neighborhood of the place.
    */
  var dependentLocalities: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The address of the place, formatted using its country's conventions.
    */
  var formattedAddress: String
  
  /**
    * A combination of thoroughfare and subthoroughfare.
    */
  var fullThoroughfare: js.UndefOr[String] = js.undefined
  
  /**
    * The city of the place.
    */
  var locality: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the place.
    */
  var name: String
  
  /**
    * The category of the place.
    */
  var pointOfInterestCategory: js.UndefOr[PointOfInterestCategory] = js.undefined
  
  /**
    * The postal code of the place.
    */
  var postCode: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic region associated with the place.
    */
  var region: CoordinateRegion
  
  /**
    * The name of the area within the locality.
    */
  var subLocality: js.UndefOr[String] = js.undefined
  
  /**
    * The number on the street at the place.
    */
  var subThoroughfare: js.UndefOr[String] = js.undefined
  
  /**
    * The street name at the place.
    */
  var thoroughfare: js.UndefOr[String] = js.undefined
}
object Place {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Place] (val x: Self) extends AnyVal {
    
    inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeAreaCode(value: String): Self = StObject.set(x, "administrativeAreaCode", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeAreaCodeUndefined: Self = StObject.set(x, "administrativeAreaCode", js.undefined)
    
    inline def setAdministrativeAreaUndefined: Self = StObject.set(x, "administrativeArea", js.undefined)
    
    inline def setAreasOfInterest(value: js.Array[String]): Self = StObject.set(x, "areasOfInterest", value.asInstanceOf[js.Any])
    
    inline def setAreasOfInterestUndefined: Self = StObject.set(x, "areasOfInterest", js.undefined)
    
    inline def setAreasOfInterestVarargs(value: String*): Self = StObject.set(x, "areasOfInterest", js.Array(value*))
    
    inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDependentLocalities(value: js.Array[String]): Self = StObject.set(x, "dependentLocalities", value.asInstanceOf[js.Any])
    
    inline def setDependentLocalitiesUndefined: Self = StObject.set(x, "dependentLocalities", js.undefined)
    
    inline def setDependentLocalitiesVarargs(value: String*): Self = StObject.set(x, "dependentLocalities", js.Array(value*))
    
    inline def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
    
    inline def setFullThoroughfare(value: String): Self = StObject.set(x, "fullThoroughfare", value.asInstanceOf[js.Any])
    
    inline def setFullThoroughfareUndefined: Self = StObject.set(x, "fullThoroughfare", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPointOfInterestCategory(value: PointOfInterestCategory): Self = StObject.set(x, "pointOfInterestCategory", value.asInstanceOf[js.Any])
    
    inline def setPointOfInterestCategoryUndefined: Self = StObject.set(x, "pointOfInterestCategory", js.undefined)
    
    inline def setPostCode(value: String): Self = StObject.set(x, "postCode", value.asInstanceOf[js.Any])
    
    inline def setPostCodeUndefined: Self = StObject.set(x, "postCode", js.undefined)
    
    inline def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setSubLocality(value: String): Self = StObject.set(x, "subLocality", value.asInstanceOf[js.Any])
    
    inline def setSubLocalityUndefined: Self = StObject.set(x, "subLocality", js.undefined)
    
    inline def setSubThoroughfare(value: String): Self = StObject.set(x, "subThoroughfare", value.asInstanceOf[js.Any])
    
    inline def setSubThoroughfareUndefined: Self = StObject.set(x, "subThoroughfare", js.undefined)
    
    inline def setThoroughfare(value: String): Self = StObject.set(x, "thoroughfare", value.asInstanceOf[js.Any])
    
    inline def setThoroughfareUndefined: Self = StObject.set(x, "thoroughfare", js.undefined)
  }
}
