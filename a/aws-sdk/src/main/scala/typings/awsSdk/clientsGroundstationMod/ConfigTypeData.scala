package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigTypeData extends StObject {
  
  /**
    * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
    */
  var antennaDownlinkConfig: js.UndefOr[AntennaDownlinkConfig] = js.undefined
  
  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
    */
  var antennaDownlinkDemodDecodeConfig: js.UndefOr[AntennaDownlinkDemodDecodeConfig] = js.undefined
  
  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
    */
  var antennaUplinkConfig: js.UndefOr[AntennaUplinkConfig] = js.undefined
  
  /**
    * Information about the dataflow endpoint Config.
    */
  var dataflowEndpointConfig: js.UndefOr[DataflowEndpointConfig] = js.undefined
  
  /**
    * Information about an S3 recording Config.
    */
  var s3RecordingConfig: js.UndefOr[S3RecordingConfig] = js.undefined
  
  /**
    * Object that determines whether tracking should be used during a contact executed with this Config in the mission profile. 
    */
  var trackingConfig: js.UndefOr[TrackingConfig] = js.undefined
  
  /**
    * Information about an uplink echo Config. Parameters from the AntennaUplinkConfig, corresponding to the specified AntennaUplinkConfigArn, are used when this UplinkEchoConfig is used in a contact.
    */
  var uplinkEchoConfig: js.UndefOr[UplinkEchoConfig] = js.undefined
}
object ConfigTypeData {
  
  inline def apply(): ConfigTypeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigTypeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigTypeData] (val x: Self) extends AnyVal {
    
    inline def setAntennaDownlinkConfig(value: AntennaDownlinkConfig): Self = StObject.set(x, "antennaDownlinkConfig", value.asInstanceOf[js.Any])
    
    inline def setAntennaDownlinkConfigUndefined: Self = StObject.set(x, "antennaDownlinkConfig", js.undefined)
    
    inline def setAntennaDownlinkDemodDecodeConfig(value: AntennaDownlinkDemodDecodeConfig): Self = StObject.set(x, "antennaDownlinkDemodDecodeConfig", value.asInstanceOf[js.Any])
    
    inline def setAntennaDownlinkDemodDecodeConfigUndefined: Self = StObject.set(x, "antennaDownlinkDemodDecodeConfig", js.undefined)
    
    inline def setAntennaUplinkConfig(value: AntennaUplinkConfig): Self = StObject.set(x, "antennaUplinkConfig", value.asInstanceOf[js.Any])
    
    inline def setAntennaUplinkConfigUndefined: Self = StObject.set(x, "antennaUplinkConfig", js.undefined)
    
    inline def setDataflowEndpointConfig(value: DataflowEndpointConfig): Self = StObject.set(x, "dataflowEndpointConfig", value.asInstanceOf[js.Any])
    
    inline def setDataflowEndpointConfigUndefined: Self = StObject.set(x, "dataflowEndpointConfig", js.undefined)
    
    inline def setS3RecordingConfig(value: S3RecordingConfig): Self = StObject.set(x, "s3RecordingConfig", value.asInstanceOf[js.Any])
    
    inline def setS3RecordingConfigUndefined: Self = StObject.set(x, "s3RecordingConfig", js.undefined)
    
    inline def setTrackingConfig(value: TrackingConfig): Self = StObject.set(x, "trackingConfig", value.asInstanceOf[js.Any])
    
    inline def setTrackingConfigUndefined: Self = StObject.set(x, "trackingConfig", js.undefined)
    
    inline def setUplinkEchoConfig(value: UplinkEchoConfig): Self = StObject.set(x, "uplinkEchoConfig", value.asInstanceOf[js.Any])
    
    inline def setUplinkEchoConfigUndefined: Self = StObject.set(x, "uplinkEchoConfig", js.undefined)
  }
}
