package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigDetails extends StObject {
  
  /**
    * Details for antenna demod decode Config in a contact.
    */
  var antennaDemodDecodeDetails: js.UndefOr[AntennaDemodDecodeDetails] = js.undefined
  
  var endpointDetails: js.UndefOr[EndpointDetails] = js.undefined
  
  /**
    * Details for an S3 recording Config in a contact.
    */
  var s3RecordingDetails: js.UndefOr[S3RecordingDetails] = js.undefined
}
object ConfigDetails {
  
  inline def apply(): ConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigDetails]
  }
  
  extension [Self <: ConfigDetails](x: Self) {
    
    inline def setAntennaDemodDecodeDetails(value: AntennaDemodDecodeDetails): Self = StObject.set(x, "antennaDemodDecodeDetails", value.asInstanceOf[js.Any])
    
    inline def setAntennaDemodDecodeDetailsUndefined: Self = StObject.set(x, "antennaDemodDecodeDetails", js.undefined)
    
    inline def setEndpointDetails(value: EndpointDetails): Self = StObject.set(x, "endpointDetails", value.asInstanceOf[js.Any])
    
    inline def setEndpointDetailsUndefined: Self = StObject.set(x, "endpointDetails", js.undefined)
    
    inline def setS3RecordingDetails(value: S3RecordingDetails): Self = StObject.set(x, "s3RecordingDetails", value.asInstanceOf[js.Any])
    
    inline def setS3RecordingDetailsUndefined: Self = StObject.set(x, "s3RecordingDetails", js.undefined)
  }
}
