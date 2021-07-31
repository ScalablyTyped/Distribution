package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notes:
  * * If the IP address is in the reserved IP space (as designated by the
  *   Internet Assigned Numbers Authority), every property will have the
  *   value of ‘reserved’.
  * * If user location properties can not be supplied for any reason,
  *   undefined is returned for that property
  */
trait UserLocation extends StObject {
  
  /**
    * The city value is the city (within a 50-mile radius) that the IP
    * address maps to.
    */
  val city: js.UndefOr[String] = js.undefined
  
  /**
    * The continent value is a two-letter code for the continent that
    * the IP address maps to.
    */
  val continent: js.UndefOr[String] = js.undefined
  
  /**
    * The country value is an ISO-3166, two-letter code for the country
    * where the IP address maps to.
    */
  val country: js.UndefOr[String] = js.undefined
  
  /**
    * The region value is an ISO-3166, two-letter code for the state,
    * province, or region where the IP address maps to.
    */
  val region: js.UndefOr[String] = js.undefined
  
  /**
    * The zipCode value is the zipcode that the IP address maps to
    * (multiple values possible).
    *
    * Contiguous zip codes will be represented as a range of the form
    * "FirstZipInRange LastZipInRange", and multiple ranges may be
    * present (each range separated by the plus (+) character).
    *
    * For example, the following strings are all valid zipCode values:
    *
    * * 10001
    * * 10001+10003
    * * 10001-10003+10005
    * * 10001-10003+10005-10008
    *
    * For country = US and country = PR, zip refers to the 5 digit
    * zipcode.
    *
    * For country = CA, zip refers to the forward sortation area (FSA).
    * For more information on FSA, go to http://www.canadapost.ca and
    * search for FSA.
    *
    * See the EdgeScape Users Guide for more details.
    */
  val zipCode: js.UndefOr[String] = js.undefined
}
object UserLocation {
  
  @scala.inline
  def apply(): UserLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserLocation]
  }
  
  @scala.inline
  implicit class UserLocationMutableBuilder[Self <: UserLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setZipCode(value: String): Self = StObject.set(x, "zipCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipCodeUndefined: Self = StObject.set(x, "zipCode", js.undefined)
  }
}
