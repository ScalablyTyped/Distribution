package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceUpdatesMessage extends StObject {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of service updates
    */
  var ServiceUpdates: js.UndefOr[ServiceUpdateList] = js.undefined
}
object ServiceUpdatesMessage {
  
  inline def apply(): ServiceUpdatesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUpdatesMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceUpdatesMessage] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setServiceUpdates(value: ServiceUpdateList): Self = StObject.set(x, "ServiceUpdates", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdatesUndefined: Self = StObject.set(x, "ServiceUpdates", js.undefined)
    
    inline def setServiceUpdatesVarargs(value: ServiceUpdate*): Self = StObject.set(x, "ServiceUpdates", js.Array(value*))
  }
}
