package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingParametersRequest extends StObject {
  
  /**
    * A value that is used to calculate compression for an output. The bitrate of the output is calculated as follows: Output bitrate = (1 / compressionFactor) * (source bitrate) This property only applies to outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the CDI protocol. Valid values are floating point numbers in the range of 3.0 to 10.0, inclusive.
    */
  var CompressionFactor: double
  
  /**
    * A setting on the encoder that drives compression settings. This property only applies to video media streams associated with outputs that use the ST 2110 JPEG XS protocol, if at least one source on the flow uses the CDI protocol.
    */
  var EncoderProfile: typings.awsSdk.clientsMediaconnectMod.EncoderProfile
}
object EncodingParametersRequest {
  
  inline def apply(CompressionFactor: double, EncoderProfile: EncoderProfile): EncodingParametersRequest = {
    val __obj = js.Dynamic.literal(CompressionFactor = CompressionFactor.asInstanceOf[js.Any], EncoderProfile = EncoderProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingParametersRequest]
  }
  
  extension [Self <: EncodingParametersRequest](x: Self) {
    
    inline def setCompressionFactor(value: double): Self = StObject.set(x, "CompressionFactor", value.asInstanceOf[js.Any])
    
    inline def setEncoderProfile(value: EncoderProfile): Self = StObject.set(x, "EncoderProfile", value.asInstanceOf[js.Any])
  }
}
