package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecyclePolicyPreviewSummary extends StObject {
  
  /**
    * The number of expiring images.
    */
  var expiringImageTotalCount: js.UndefOr[ImageCount] = js.undefined
}
object LifecyclePolicyPreviewSummary {
  
  inline def apply(): LifecyclePolicyPreviewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyPreviewSummary]
  }
  
  extension [Self <: LifecyclePolicyPreviewSummary](x: Self) {
    
    inline def setExpiringImageTotalCount(value: ImageCount): Self = StObject.set(x, "expiringImageTotalCount", value.asInstanceOf[js.Any])
    
    inline def setExpiringImageTotalCountUndefined: Self = StObject.set(x, "expiringImageTotalCount", js.undefined)
  }
}
