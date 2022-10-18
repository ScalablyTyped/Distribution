package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDistributionResult extends StObject {
  
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.Distribution] = js.undefined
  
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object UpdateDistributionResult {
  
  inline def apply(): UpdateDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDistributionResult]
  }
  
  extension [Self <: UpdateDistributionResult](x: Self) {
    
    inline def setDistribution(value: Distribution): Self = StObject.set(x, "Distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "Distribution", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
