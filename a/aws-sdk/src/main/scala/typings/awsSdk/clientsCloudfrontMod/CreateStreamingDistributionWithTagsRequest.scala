package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingDistributionWithTagsRequest extends StObject {
  
  /**
    *  The streaming distribution's configuration information. 
    */
  var StreamingDistributionConfigWithTags: typings.awsSdk.clientsCloudfrontMod.StreamingDistributionConfigWithTags
}
object CreateStreamingDistributionWithTagsRequest {
  
  inline def apply(StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags): CreateStreamingDistributionWithTagsRequest = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfigWithTags = StreamingDistributionConfigWithTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingDistributionWithTagsRequest]
  }
  
  extension [Self <: CreateStreamingDistributionWithTagsRequest](x: Self) {
    
    inline def setStreamingDistributionConfigWithTags(value: StreamingDistributionConfigWithTags): Self = StObject.set(x, "StreamingDistributionConfigWithTags", value.asInstanceOf[js.Any])
  }
}
