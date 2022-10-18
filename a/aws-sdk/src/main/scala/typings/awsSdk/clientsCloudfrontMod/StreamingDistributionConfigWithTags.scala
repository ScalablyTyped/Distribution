package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingDistributionConfigWithTags extends StObject {
  
  /**
    * A streaming distribution Configuration.
    */
  var StreamingDistributionConfig: typings.awsSdk.clientsCloudfrontMod.StreamingDistributionConfig
  
  /**
    * A complex type that contains zero or more Tag elements.
    */
  var Tags: typings.awsSdk.clientsCloudfrontMod.Tags
}
object StreamingDistributionConfigWithTags {
  
  inline def apply(StreamingDistributionConfig: StreamingDistributionConfig, Tags: Tags): StreamingDistributionConfigWithTags = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingDistributionConfigWithTags]
  }
  
  extension [Self <: StreamingDistributionConfigWithTags](x: Self) {
    
    inline def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = StObject.set(x, "StreamingDistributionConfig", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
