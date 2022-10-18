package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingDistributionResult extends StObject {
  
  /**
    * The current version of the streaming distribution created.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified URI of the new streaming distribution resource just created.
    */
  var Location: js.UndefOr[String] = js.undefined
  
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.StreamingDistribution] = js.undefined
}
object CreateStreamingDistributionResult {
  
  inline def apply(): CreateStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamingDistributionResult]
  }
  
  extension [Self <: CreateStreamingDistributionResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setStreamingDistribution(value: StreamingDistribution): Self = StObject.set(x, "StreamingDistribution", value.asInstanceOf[js.Any])
    
    inline def setStreamingDistributionUndefined: Self = StObject.set(x, "StreamingDistribution", js.undefined)
  }
}
