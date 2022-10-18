package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketBundlesRequest extends StObject {
  
  /**
    * A Boolean value that indicates whether to include inactive (unavailable) bundles in the response of your request.
    */
  var includeInactive: js.UndefOr[Boolean] = js.undefined
}
object GetBucketBundlesRequest {
  
  inline def apply(): GetBucketBundlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketBundlesRequest]
  }
  
  extension [Self <: GetBucketBundlesRequest](x: Self) {
    
    inline def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
    
    inline def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
  }
}
