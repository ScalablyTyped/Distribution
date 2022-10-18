package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMatchParams extends StObject {
  
  /**
    * The area code.
    */
  var AreaCode: typings.awsSdk.clientsChimeMod.AreaCode
  
  /**
    * The country.
    */
  var Country: typings.awsSdk.clientsChimeMod.Country
}
object GeoMatchParams {
  
  inline def apply(AreaCode: AreaCode, Country: Country): GeoMatchParams = {
    val __obj = js.Dynamic.literal(AreaCode = AreaCode.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchParams]
  }
  
  extension [Self <: GeoMatchParams](x: Self) {
    
    inline def setAreaCode(value: AreaCode): Self = StObject.set(x, "AreaCode", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: Country): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
  }
}
