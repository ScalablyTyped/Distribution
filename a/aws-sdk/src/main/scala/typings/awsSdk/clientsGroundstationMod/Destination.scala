package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * Additional details for a Config, if type is dataflow endpoint or antenna demod decode.
    */
  var configDetails: js.UndefOr[ConfigDetails] = js.undefined
  
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.undefined
  
  /**
    * Region of a dataflow destination.
    */
  var dataflowDestinationRegion: js.UndefOr[String] = js.undefined
}
object Destination {
  
  inline def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  extension [Self <: Destination](x: Self) {
    
    inline def setConfigDetails(value: ConfigDetails): Self = StObject.set(x, "configDetails", value.asInstanceOf[js.Any])
    
    inline def setConfigDetailsUndefined: Self = StObject.set(x, "configDetails", js.undefined)
    
    inline def setConfigId(value: Uuid): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    inline def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    inline def setConfigTypeUndefined: Self = StObject.set(x, "configType", js.undefined)
    
    inline def setDataflowDestinationRegion(value: String): Self = StObject.set(x, "dataflowDestinationRegion", value.asInstanceOf[js.Any])
    
    inline def setDataflowDestinationRegionUndefined: Self = StObject.set(x, "dataflowDestinationRegion", js.undefined)
  }
}
