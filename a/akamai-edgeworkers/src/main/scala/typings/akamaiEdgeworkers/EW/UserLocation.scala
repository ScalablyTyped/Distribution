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
    * The areaCodes value includes the area codes that the IP address maps to
    * (multiple values possible).
    */
  val areaCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The bandwidth value estimates the expected bandwidth for the given IP address.
    */
  val bandwidth: js.UndefOr[String] = js.undefined
  
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
    * The dma value is the mapping of major American metropolises to containing and neighbouring states.
    */
  val dma: js.UndefOr[String] = js.undefined
  
  /**
    * The fips value is a 5 digit numerical code to help map counties to states
    * (multiple values possible).
    *
    * FIPS codes are numbers which uniquely identify geographic areas. State-level FIPS
    * codes have two digits, county-level FIPS codes have five digits of which the
    * first two are the FIPS code of the state to which the county belongs.
    *
    * For the list of FIPS codes mapped to location, go to https://transition.fcc.gov/oet/info/maps/census/fips/fips.txt
    */
  val fips: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The latitude value is a numerical string that specifies the latitude that the IP address maps to.
    */
  val latitude: js.UndefOr[String] = js.undefined
  
  /**
    * The longitude value is a numerical string that specifies the longitude that the IP address maps to.
    */
  val longitude: js.UndefOr[String] = js.undefined
  
  /**
    * The networkType value specifies the network that the IP address maps to.
    */
  val networkType: js.UndefOr[String] = js.undefined
  
  /**
    * The region value is an ISO-3166, two-letter code for the state,
    * province, or region where the IP address maps to.
    */
  val region: js.UndefOr[String] = js.undefined
  
  /**
    * The timezone value is the timezone that the IP address maps to.
    */
  val timezone: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply(): UserLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserLocation] (val x: Self) extends AnyVal {
    
    inline def setAreaCodes(value: js.Array[String]): Self = StObject.set(x, "areaCodes", value.asInstanceOf[js.Any])
    
    inline def setAreaCodesUndefined: Self = StObject.set(x, "areaCodes", js.undefined)
    
    inline def setAreaCodesVarargs(value: String*): Self = StObject.set(x, "areaCodes", js.Array(value*))
    
    inline def setBandwidth(value: String): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
    
    inline def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDma(value: String): Self = StObject.set(x, "dma", value.asInstanceOf[js.Any])
    
    inline def setDmaUndefined: Self = StObject.set(x, "dma", js.undefined)
    
    inline def setFips(value: js.Array[String]): Self = StObject.set(x, "fips", value.asInstanceOf[js.Any])
    
    inline def setFipsUndefined: Self = StObject.set(x, "fips", js.undefined)
    
    inline def setFipsVarargs(value: String*): Self = StObject.set(x, "fips", js.Array(value*))
    
    inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "networkType", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setZipCode(value: String): Self = StObject.set(x, "zipCode", value.asInstanceOf[js.Any])
    
    inline def setZipCodeUndefined: Self = StObject.set(x, "zipCode", js.undefined)
  }
}
