package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketStatisticsBySensitivity extends StObject {
  
  /**
    * The aggregated statistical data for all buckets that have a sensitivity score of -1.
    */
  var classificationError: js.UndefOr[SensitivityAggregations] = js.undefined
  
  /**
    * The aggregated statistical data for all buckets that have a sensitivity score of 50.
    */
  var notClassified: js.UndefOr[SensitivityAggregations] = js.undefined
  
  /**
    * The aggregated statistical data for all buckets that have a sensitivity score of 1-49.
    */
  var notSensitive: js.UndefOr[SensitivityAggregations] = js.undefined
  
  /**
    * The aggregated statistical data for all buckets that have a sensitivity score of 51-100.
    */
  var sensitive: js.UndefOr[SensitivityAggregations] = js.undefined
}
object BucketStatisticsBySensitivity {
  
  inline def apply(): BucketStatisticsBySensitivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketStatisticsBySensitivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketStatisticsBySensitivity] (val x: Self) extends AnyVal {
    
    inline def setClassificationError(value: SensitivityAggregations): Self = StObject.set(x, "classificationError", value.asInstanceOf[js.Any])
    
    inline def setClassificationErrorUndefined: Self = StObject.set(x, "classificationError", js.undefined)
    
    inline def setNotClassified(value: SensitivityAggregations): Self = StObject.set(x, "notClassified", value.asInstanceOf[js.Any])
    
    inline def setNotClassifiedUndefined: Self = StObject.set(x, "notClassified", js.undefined)
    
    inline def setNotSensitive(value: SensitivityAggregations): Self = StObject.set(x, "notSensitive", value.asInstanceOf[js.Any])
    
    inline def setNotSensitiveUndefined: Self = StObject.set(x, "notSensitive", js.undefined)
    
    inline def setSensitive(value: SensitivityAggregations): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
    
    inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
  }
}
