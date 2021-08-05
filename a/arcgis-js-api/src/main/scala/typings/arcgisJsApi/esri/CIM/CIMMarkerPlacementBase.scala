package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementBase extends StObject {
  
  /**
    * The primitive name.
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object CIMMarkerPlacementBase {
  
  inline def apply(`type`: String): CIMMarkerPlacementBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementBase]
  }
  
  extension [Self <: CIMMarkerPlacementBase](x: Self) {
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
