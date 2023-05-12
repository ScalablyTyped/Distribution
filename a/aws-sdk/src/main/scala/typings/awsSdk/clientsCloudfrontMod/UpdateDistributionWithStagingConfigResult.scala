package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDistributionWithStagingConfigResult extends StObject {
  
  var Distribution: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.Distribution] = js.undefined
  
  /**
    * The current version of the primary distribution (after it's updated).
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object UpdateDistributionWithStagingConfigResult {
  
  inline def apply(): UpdateDistributionWithStagingConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDistributionWithStagingConfigResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDistributionWithStagingConfigResult] (val x: Self) extends AnyVal {
    
    inline def setDistribution(value: Distribution): Self = StObject.set(x, "Distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "Distribution", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
