package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamSourceConfigurationRequest extends StObject {
  
  /**
    * The format you want to use to encode the data. For ancillary data streams, set the encoding name to smpte291. For audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video, JPEG XS streams, set the encoding name to jxsv.
    */
  var EncodingName: typings.awsSdk.clientsMediaconnectMod.EncodingName
  
  /**
    * The transport parameters that you want to associate with the media stream.
    */
  var InputConfigurations: js.UndefOr[listOfInputConfigurationRequest] = js.undefined
  
  /**
    * The name of the media stream.
    */
  var MediaStreamName: string
}
object MediaStreamSourceConfigurationRequest {
  
  inline def apply(EncodingName: EncodingName, MediaStreamName: string): MediaStreamSourceConfigurationRequest = {
    val __obj = js.Dynamic.literal(EncodingName = EncodingName.asInstanceOf[js.Any], MediaStreamName = MediaStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceConfigurationRequest]
  }
  
  extension [Self <: MediaStreamSourceConfigurationRequest](x: Self) {
    
    inline def setEncodingName(value: EncodingName): Self = StObject.set(x, "EncodingName", value.asInstanceOf[js.Any])
    
    inline def setInputConfigurations(value: listOfInputConfigurationRequest): Self = StObject.set(x, "InputConfigurations", value.asInstanceOf[js.Any])
    
    inline def setInputConfigurationsUndefined: Self = StObject.set(x, "InputConfigurations", js.undefined)
    
    inline def setInputConfigurationsVarargs(value: InputConfigurationRequest*): Self = StObject.set(x, "InputConfigurations", js.Array(value*))
    
    inline def setMediaStreamName(value: string): Self = StObject.set(x, "MediaStreamName", value.asInstanceOf[js.Any])
  }
}
