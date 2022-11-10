package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * Additional details for a Config, if type is dataflow-endpoint or antenna-downlink-demod-decode 
    */
  var configDetails: js.UndefOr[ConfigDetails] = js.undefined
  
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.undefined
  
  /**
    * Region of a dataflow source.
    */
  var dataflowSourceRegion: js.UndefOr[String] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setConfigDetails(value: ConfigDetails): Self = StObject.set(x, "configDetails", value.asInstanceOf[js.Any])
    
    inline def setConfigDetailsUndefined: Self = StObject.set(x, "configDetails", js.undefined)
    
    inline def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    inline def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    inline def setConfigTypeUndefined: Self = StObject.set(x, "configType", js.undefined)
    
    inline def setDataflowSourceRegion(value: String): Self = StObject.set(x, "dataflowSourceRegion", value.asInstanceOf[js.Any])
    
    inline def setDataflowSourceRegionUndefined: Self = StObject.set(x, "dataflowSourceRegion", js.undefined)
  }
}
