package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingDistributionConfigResult extends StObject {
  
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL. 
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.StreamingDistributionConfig] = js.undefined
}
object GetStreamingDistributionConfigResult {
  
  inline def apply(): GetStreamingDistributionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamingDistributionConfigResult]
  }
  
  extension [Self <: GetStreamingDistributionConfigResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = StObject.set(x, "StreamingDistributionConfig", value.asInstanceOf[js.Any])
    
    inline def setStreamingDistributionConfigUndefined: Self = StObject.set(x, "StreamingDistributionConfig", js.undefined)
  }
}
