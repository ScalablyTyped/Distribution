package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderableDBInstanceOptionsMessage extends StObject {
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The options that are available for a particular orderable instance.
    */
  var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.undefined
}
object OrderableDBInstanceOptionsMessage {
  
  inline def apply(): OrderableDBInstanceOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableDBInstanceOptionsMessage]
  }
  
  extension [Self <: OrderableDBInstanceOptionsMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setOrderableDBInstanceOptions(value: OrderableDBInstanceOptionsList): Self = StObject.set(x, "OrderableDBInstanceOptions", value.asInstanceOf[js.Any])
    
    inline def setOrderableDBInstanceOptionsUndefined: Self = StObject.set(x, "OrderableDBInstanceOptions", js.undefined)
    
    inline def setOrderableDBInstanceOptionsVarargs(value: OrderableDBInstanceOption*): Self = StObject.set(x, "OrderableDBInstanceOptions", js.Array(value*))
  }
}
