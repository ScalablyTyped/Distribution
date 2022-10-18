package typings.awsSdk.clientsMobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBundleRequest extends StObject {
  
  /**
    *  Unique bundle identifier. 
    */
  var bundleId: BundleId
}
object DescribeBundleRequest {
  
  inline def apply(bundleId: BundleId): DescribeBundleRequest = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBundleRequest]
  }
  
  extension [Self <: DescribeBundleRequest](x: Self) {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
  }
}
