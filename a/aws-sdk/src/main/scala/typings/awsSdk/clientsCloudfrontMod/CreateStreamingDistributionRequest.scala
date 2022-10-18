package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingDistributionRequest extends StObject {
  
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: typings.awsSdk.clientsCloudfrontMod.StreamingDistributionConfig
}
object CreateStreamingDistributionRequest {
  
  inline def apply(StreamingDistributionConfig: StreamingDistributionConfig): CreateStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingDistributionRequest]
  }
  
  extension [Self <: CreateStreamingDistributionRequest](x: Self) {
    
    inline def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = StObject.set(x, "StreamingDistributionConfig", value.asInstanceOf[js.Any])
  }
}
