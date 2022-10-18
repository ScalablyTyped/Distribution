package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityConfigurationsInput extends StObject {
  
  /**
    * The pagination token that indicates the set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
}
object ListSecurityConfigurationsInput {
  
  inline def apply(): ListSecurityConfigurationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityConfigurationsInput]
  }
  
  extension [Self <: ListSecurityConfigurationsInput](x: Self) {
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
