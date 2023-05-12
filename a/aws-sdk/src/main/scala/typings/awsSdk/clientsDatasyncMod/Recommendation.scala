package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recommendation extends StObject {
  
  /**
    * The estimated monthly cost of the recommended Amazon Web Services storage service.
    */
  var EstimatedMonthlyStorageCost: js.UndefOr[PtolemyString] = js.undefined
  
  /**
    * Information about how you can set up a recommended Amazon Web Services storage service.
    */
  var StorageConfiguration: js.UndefOr[RecommendationsConfigMap] = js.undefined
  
  /**
    * A recommended Amazon Web Services storage service that you can migrate data to based on information that DataSync Discovery collects about your on-premises storage system.
    */
  var StorageType: js.UndefOr[PtolemyString] = js.undefined
}
object Recommendation {
  
  inline def apply(): Recommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recommendation] (val x: Self) extends AnyVal {
    
    inline def setEstimatedMonthlyStorageCost(value: PtolemyString): Self = StObject.set(x, "EstimatedMonthlyStorageCost", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMonthlyStorageCostUndefined: Self = StObject.set(x, "EstimatedMonthlyStorageCost", js.undefined)
    
    inline def setStorageConfiguration(value: RecommendationsConfigMap): Self = StObject.set(x, "StorageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStorageConfigurationUndefined: Self = StObject.set(x, "StorageConfiguration", js.undefined)
    
    inline def setStorageType(value: PtolemyString): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
