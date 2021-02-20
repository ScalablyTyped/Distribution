package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoMatchParams extends StObject {
  
  /**
    * The area code.
    */
  var AreaCode: typings.awsSdk.chimeMod.AreaCode = js.native
  
  /**
    * The country.
    */
  var Country: typings.awsSdk.chimeMod.Country = js.native
}
object GeoMatchParams {
  
  @scala.inline
  def apply(AreaCode: AreaCode, Country: Country): GeoMatchParams = {
    val __obj = js.Dynamic.literal(AreaCode = AreaCode.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchParams]
  }
  
  @scala.inline
  implicit class GeoMatchParamsMutableBuilder[Self <: GeoMatchParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreaCode(value: AreaCode): Self = StObject.set(x, "AreaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: Country): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
  }
}
