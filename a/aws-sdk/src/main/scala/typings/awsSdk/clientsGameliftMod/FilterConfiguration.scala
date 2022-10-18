package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterConfiguration extends StObject {
  
  /**
    *  A list of locations to allow game session placement in, in the form of Amazon Web Services Region codes such as us-west-2. 
    */
  var AllowedLocations: js.UndefOr[LocationList] = js.undefined
}
object FilterConfiguration {
  
  inline def apply(): FilterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterConfiguration]
  }
  
  extension [Self <: FilterConfiguration](x: Self) {
    
    inline def setAllowedLocations(value: LocationList): Self = StObject.set(x, "AllowedLocations", value.asInstanceOf[js.Any])
    
    inline def setAllowedLocationsUndefined: Self = StObject.set(x, "AllowedLocations", js.undefined)
    
    inline def setAllowedLocationsVarargs(value: LocationStringModel*): Self = StObject.set(x, "AllowedLocations", js.Array(value*))
  }
}
