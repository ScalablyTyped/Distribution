package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageStatistics extends StObject {
  
  /**
    * Represents coverage statistics for EKS clusters aggregated by coverage status.
    */
  var CountByCoverageStatus: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.CountByCoverageStatus] = js.undefined
  
  /**
    * Represents coverage statistics for EKS clusters aggregated by resource type.
    */
  var CountByResourceType: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.CountByResourceType] = js.undefined
}
object CoverageStatistics {
  
  inline def apply(): CoverageStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageStatistics] (val x: Self) extends AnyVal {
    
    inline def setCountByCoverageStatus(value: CountByCoverageStatus): Self = StObject.set(x, "CountByCoverageStatus", value.asInstanceOf[js.Any])
    
    inline def setCountByCoverageStatusUndefined: Self = StObject.set(x, "CountByCoverageStatus", js.undefined)
    
    inline def setCountByResourceType(value: CountByResourceType): Self = StObject.set(x, "CountByResourceType", value.asInstanceOf[js.Any])
    
    inline def setCountByResourceTypeUndefined: Self = StObject.set(x, "CountByResourceType", js.undefined)
  }
}
