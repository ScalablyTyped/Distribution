package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A place object returned from a geocoder lookup or reverse lookup.
  */
@js.native
trait Place extends js.Object {
  
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
  implicit class PlaceOps[Self <: Place] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoordinate(value: Coordinate): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedAddress(value: String): Self = this.set("formattedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = this.set("administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrativeArea: Self = this.set("administrativeArea", js.undefined)
    
    @scala.inline
    def setAdministrativeAreaCode(value: String): Self = this.set("administrativeAreaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrativeAreaCode: Self = this.set("administrativeAreaCode", js.undefined)
    
    @scala.inline
    def setAreasOfInterestVarargs(value: String*): Self = this.set("areasOfInterest", js.Array(value :_*))
    
    @scala.inline
    def setAreasOfInterest(value: js.Array[String]): Self = this.set("areasOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreasOfInterest: Self = this.set("areasOfInterest", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setDependentLocalitiesVarargs(value: String*): Self = this.set("dependentLocalities", js.Array(value :_*))
    
    @scala.inline
    def setDependentLocalities(value: js.Array[String]): Self = this.set("dependentLocalities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependentLocalities: Self = this.set("dependentLocalities", js.undefined)
    
    @scala.inline
    def setFullThoroughfare(value: String): Self = this.set("fullThoroughfare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullThoroughfare: Self = this.set("fullThoroughfare", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    
    @scala.inline
    def setPointOfInterestCategory(value: PointOfInterestCategory): Self = this.set("pointOfInterestCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointOfInterestCategory: Self = this.set("pointOfInterestCategory", js.undefined)
    
    @scala.inline
    def setPostCode(value: String): Self = this.set("postCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostCode: Self = this.set("postCode", js.undefined)
    
    @scala.inline
    def setSubLocality(value: String): Self = this.set("subLocality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubLocality: Self = this.set("subLocality", js.undefined)
    
    @scala.inline
    def setSubThoroughfare(value: String): Self = this.set("subThoroughfare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubThoroughfare: Self = this.set("subThoroughfare", js.undefined)
    
    @scala.inline
    def setThoroughfare(value: String): Self = this.set("thoroughfare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThoroughfare: Self = this.set("thoroughfare", js.undefined)
  }
}
