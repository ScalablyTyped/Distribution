package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundStationData extends StObject {
  
  /**
    * UUID of a ground station.
    */
  var groundStationId: js.UndefOr[GroundStationName] = js.undefined
  
  /**
    * Name of a ground station.
    */
  var groundStationName: js.UndefOr[GroundStationName] = js.undefined
  
  /**
    * Ground station Region.
    */
  var region: js.UndefOr[AWSRegion] = js.undefined
}
object GroundStationData {
  
  inline def apply(): GroundStationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundStationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroundStationData] (val x: Self) extends AnyVal {
    
    inline def setGroundStationId(value: GroundStationName): Self = StObject.set(x, "groundStationId", value.asInstanceOf[js.Any])
    
    inline def setGroundStationIdUndefined: Self = StObject.set(x, "groundStationId", js.undefined)
    
    inline def setGroundStationName(value: GroundStationName): Self = StObject.set(x, "groundStationName", value.asInstanceOf[js.Any])
    
    inline def setGroundStationNameUndefined: Self = StObject.set(x, "groundStationName", js.undefined)
    
    inline def setRegion(value: AWSRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
