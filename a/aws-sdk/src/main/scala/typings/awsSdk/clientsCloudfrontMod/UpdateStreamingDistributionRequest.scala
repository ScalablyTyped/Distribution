package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamingDistributionRequest extends StObject {
  
  /**
    * The streaming distribution's id.
    */
  var Id: String
  
  /**
    * The value of the ETag header that you received when retrieving the streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
  
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: typings.awsSdk.clientsCloudfrontMod.StreamingDistributionConfig
}
object UpdateStreamingDistributionRequest {
  
  inline def apply(Id: String, StreamingDistributionConfig: StreamingDistributionConfig): UpdateStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamingDistributionRequest]
  }
  
  extension [Self <: UpdateStreamingDistributionRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    inline def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = StObject.set(x, "StreamingDistributionConfig", value.asInstanceOf[js.Any])
  }
}
