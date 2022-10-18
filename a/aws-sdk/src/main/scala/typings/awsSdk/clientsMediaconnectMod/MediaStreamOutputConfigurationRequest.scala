package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamOutputConfigurationRequest extends StObject {
  
  /**
    * The transport parameters that you want to associate with the media stream.
    */
  var DestinationConfigurations: js.UndefOr[listOfDestinationConfigurationRequest] = js.undefined
  
  /**
    * The format that will be used to encode the data. For ancillary data streams, set the encoding name to smpte291. For audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video, JPEG XS streams, set the encoding name to jxsv.
    */
  var EncodingName: typings.awsSdk.clientsMediaconnectMod.EncodingName
  
  /**
    * A collection of parameters that determine how MediaConnect will convert the content. These fields only apply to outputs on flows that have a CDI source.
    */
  var EncodingParameters: js.UndefOr[EncodingParametersRequest] = js.undefined
  
  /**
    * The name of the media stream that is associated with the output.
    */
  var MediaStreamName: string
}
object MediaStreamOutputConfigurationRequest {
  
  inline def apply(EncodingName: EncodingName, MediaStreamName: string): MediaStreamOutputConfigurationRequest = {
    val __obj = js.Dynamic.literal(EncodingName = EncodingName.asInstanceOf[js.Any], MediaStreamName = MediaStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamOutputConfigurationRequest]
  }
  
  extension [Self <: MediaStreamOutputConfigurationRequest](x: Self) {
    
    inline def setDestinationConfigurations(value: listOfDestinationConfigurationRequest): Self = StObject.set(x, "DestinationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigurationsUndefined: Self = StObject.set(x, "DestinationConfigurations", js.undefined)
    
    inline def setDestinationConfigurationsVarargs(value: DestinationConfigurationRequest*): Self = StObject.set(x, "DestinationConfigurations", js.Array(value*))
    
    inline def setEncodingName(value: EncodingName): Self = StObject.set(x, "EncodingName", value.asInstanceOf[js.Any])
    
    inline def setEncodingParameters(value: EncodingParametersRequest): Self = StObject.set(x, "EncodingParameters", value.asInstanceOf[js.Any])
    
    inline def setEncodingParametersUndefined: Self = StObject.set(x, "EncodingParameters", js.undefined)
    
    inline def setMediaStreamName(value: string): Self = StObject.set(x, "MediaStreamName", value.asInstanceOf[js.Any])
  }
}
