package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceUpdate extends StObject {
  
  /**
    * Indicates whether the service update will be automatically applied once the recommended apply-by date has expired. 
    */
  var AutoUpdateAfterRecommendedApplyByDate: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The estimated length of time the service update will take
    */
  var EstimatedUpdateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Provides details of the service update
    */
  var ServiceUpdateDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The date after which the service update is no longer available
    */
  var ServiceUpdateEndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  
  /**
    * The recommendend date to apply the service update in order to ensure compliance. For information on compliance, see Self-Service Security Updates for Compliance.
    */
  var ServiceUpdateRecommendedApplyByDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date when the service update is initially available
    */
  var ServiceUpdateReleaseDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The severity of the service update
    */
  var ServiceUpdateSeverity: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ServiceUpdateSeverity] = js.undefined
  
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ServiceUpdateStatus] = js.undefined
  
  /**
    * Reflects the nature of the service update
    */
  var ServiceUpdateType: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ServiceUpdateType] = js.undefined
}
object ServiceUpdate {
  
  inline def apply(): ServiceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUpdate]
  }
  
  extension [Self <: ServiceUpdate](x: Self) {
    
    inline def setAutoUpdateAfterRecommendedApplyByDate(value: BooleanOptional): Self = StObject.set(x, "AutoUpdateAfterRecommendedApplyByDate", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateAfterRecommendedApplyByDateUndefined: Self = StObject.set(x, "AutoUpdateAfterRecommendedApplyByDate", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setEstimatedUpdateTime(value: String): Self = StObject.set(x, "EstimatedUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setEstimatedUpdateTimeUndefined: Self = StObject.set(x, "EstimatedUpdateTime", js.undefined)
    
    inline def setServiceUpdateDescription(value: String): Self = StObject.set(x, "ServiceUpdateDescription", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateDescriptionUndefined: Self = StObject.set(x, "ServiceUpdateDescription", js.undefined)
    
    inline def setServiceUpdateEndDate(value: js.Date): Self = StObject.set(x, "ServiceUpdateEndDate", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateEndDateUndefined: Self = StObject.set(x, "ServiceUpdateEndDate", js.undefined)
    
    inline def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    inline def setServiceUpdateRecommendedApplyByDate(value: js.Date): Self = StObject.set(x, "ServiceUpdateRecommendedApplyByDate", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateRecommendedApplyByDateUndefined: Self = StObject.set(x, "ServiceUpdateRecommendedApplyByDate", js.undefined)
    
    inline def setServiceUpdateReleaseDate(value: js.Date): Self = StObject.set(x, "ServiceUpdateReleaseDate", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateReleaseDateUndefined: Self = StObject.set(x, "ServiceUpdateReleaseDate", js.undefined)
    
    inline def setServiceUpdateSeverity(value: ServiceUpdateSeverity): Self = StObject.set(x, "ServiceUpdateSeverity", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateSeverityUndefined: Self = StObject.set(x, "ServiceUpdateSeverity", js.undefined)
    
    inline def setServiceUpdateStatus(value: ServiceUpdateStatus): Self = StObject.set(x, "ServiceUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateStatusUndefined: Self = StObject.set(x, "ServiceUpdateStatus", js.undefined)
    
    inline def setServiceUpdateType(value: ServiceUpdateType): Self = StObject.set(x, "ServiceUpdateType", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateTypeUndefined: Self = StObject.set(x, "ServiceUpdateType", js.undefined)
  }
}
