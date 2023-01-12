package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait City extends StObject {
  
  /**
    * The city name of the remote IP address.
    */
  var CityName: js.UndefOr[String] = js.undefined
}
object City {
  
  inline def apply(): City = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[City]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: City] (val x: Self) extends AnyVal {
    
    inline def setCityName(value: String): Self = StObject.set(x, "CityName", value.asInstanceOf[js.Any])
    
    inline def setCityNameUndefined: Self = StObject.set(x, "CityName", js.undefined)
  }
}
