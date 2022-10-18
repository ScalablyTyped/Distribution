package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionGroupOptionsMessage extends StObject {
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  var OptionGroupOptions: js.UndefOr[OptionGroupOptionsList] = js.undefined
}
object OptionGroupOptionsMessage {
  
  inline def apply(): OptionGroupOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupOptionsMessage]
  }
  
  extension [Self <: OptionGroupOptionsMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setOptionGroupOptions(value: OptionGroupOptionsList): Self = StObject.set(x, "OptionGroupOptions", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupOptionsUndefined: Self = StObject.set(x, "OptionGroupOptions", js.undefined)
    
    inline def setOptionGroupOptionsVarargs(value: OptionGroupOption*): Self = StObject.set(x, "OptionGroupOptions", js.Array(value*))
  }
}
