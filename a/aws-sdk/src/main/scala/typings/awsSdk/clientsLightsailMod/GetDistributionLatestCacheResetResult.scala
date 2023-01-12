package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionLatestCacheResetResult extends StObject {
  
  /**
    * The timestamp of the last cache reset (e.g., 1479734909.17) in Unix time format.
    */
  var createTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the last cache reset.
    */
  var status: js.UndefOr[String] = js.undefined
}
object GetDistributionLatestCacheResetResult {
  
  inline def apply(): GetDistributionLatestCacheResetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionLatestCacheResetResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDistributionLatestCacheResetResult] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
