package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBandwidthRateLimitOutput extends StObject {
  
  /**
    * The average download bandwidth rate limit in bits per second. This field does not appear in the response if the download rate limit is not set.
    */
  var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined
  
  /**
    * The average upload bandwidth rate limit in bits per second. This field does not appear in the response if the upload rate limit is not set.
    */
  var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object DescribeBandwidthRateLimitOutput {
  
  inline def apply(): DescribeBandwidthRateLimitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBandwidthRateLimitOutput]
  }
  
  extension [Self <: DescribeBandwidthRateLimitOutput](x: Self) {
    
    inline def setAverageDownloadRateLimitInBitsPerSec(value: BandwidthDownloadRateLimit): Self = StObject.set(x, "AverageDownloadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    inline def setAverageDownloadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "AverageDownloadRateLimitInBitsPerSec", js.undefined)
    
    inline def setAverageUploadRateLimitInBitsPerSec(value: BandwidthUploadRateLimit): Self = StObject.set(x, "AverageUploadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
    
    inline def setAverageUploadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "AverageUploadRateLimitInBitsPerSec", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
