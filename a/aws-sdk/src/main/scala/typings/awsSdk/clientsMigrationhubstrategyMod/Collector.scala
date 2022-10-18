package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collector extends StObject {
  
  /**
    *  Indicates the health of a collector. 
    */
  var collectorHealth: js.UndefOr[CollectorHealth] = js.undefined
  
  /**
    *  The ID of the collector. 
    */
  var collectorId: js.UndefOr[String] = js.undefined
  
  /**
    *  Current version of the collector that is running in the environment that you specify. 
    */
  var collectorVersion: js.UndefOr[String] = js.undefined
  
  /**
    *  Hostname of the server that is hosting the collector. 
    */
  var hostName: js.UndefOr[String] = js.undefined
  
  /**
    *  IP address of the server that is hosting the collector. 
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    *  Time when the collector last pinged the service. 
    */
  var lastActivityTimeStamp: js.UndefOr[String] = js.undefined
  
  /**
    *  Time when the collector registered with the service. 
    */
  var registeredTimeStamp: js.UndefOr[String] = js.undefined
}
object Collector {
  
  inline def apply(): Collector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collector]
  }
  
  extension [Self <: Collector](x: Self) {
    
    inline def setCollectorHealth(value: CollectorHealth): Self = StObject.set(x, "collectorHealth", value.asInstanceOf[js.Any])
    
    inline def setCollectorHealthUndefined: Self = StObject.set(x, "collectorHealth", js.undefined)
    
    inline def setCollectorId(value: String): Self = StObject.set(x, "collectorId", value.asInstanceOf[js.Any])
    
    inline def setCollectorIdUndefined: Self = StObject.set(x, "collectorId", js.undefined)
    
    inline def setCollectorVersion(value: String): Self = StObject.set(x, "collectorVersion", value.asInstanceOf[js.Any])
    
    inline def setCollectorVersionUndefined: Self = StObject.set(x, "collectorVersion", js.undefined)
    
    inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setHostNameUndefined: Self = StObject.set(x, "hostName", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setLastActivityTimeStamp(value: String): Self = StObject.set(x, "lastActivityTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setLastActivityTimeStampUndefined: Self = StObject.set(x, "lastActivityTimeStamp", js.undefined)
    
    inline def setRegisteredTimeStamp(value: String): Self = StObject.set(x, "registeredTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setRegisteredTimeStampUndefined: Self = StObject.set(x, "registeredTimeStamp", js.undefined)
  }
}
