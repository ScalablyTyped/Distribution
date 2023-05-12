package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceProfileResponse extends StObject {
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently recalculated sensitive data discovery statistics and details for the bucket. If the bucket's sensitivity score is calculated automatically, this includes the score.
    */
  var profileUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current sensitivity score for the bucket, ranging from -1 (classification error) to 100 (sensitive). By default, this score is calculated automatically based on the amount of data that Amazon Macie has analyzed in the bucket and the amount of sensitive data that Macie has found in the bucket.
    */
  var sensitivityScore: js.UndefOr[integer] = js.undefined
  
  /**
    * Specifies whether the bucket's current sensitivity score was set manually. If this value is true, the score was manually changed to 100. If this value is false, the score was calculated automatically by Amazon Macie.
    */
  var sensitivityScoreOverridden: js.UndefOr[boolean] = js.undefined
  
  /**
    * The sensitive data discovery statistics for the bucket. The statistics capture the results of automated sensitive data discovery activities that Amazon Macie has performed for the bucket.
    */
  var statistics: js.UndefOr[ResourceStatistics] = js.undefined
}
object GetResourceProfileResponse {
  
  inline def apply(): GetResourceProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setProfileUpdatedAt(value: js.Date): Self = StObject.set(x, "profileUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setProfileUpdatedAtUndefined: Self = StObject.set(x, "profileUpdatedAt", js.undefined)
    
    inline def setSensitivityScore(value: integer): Self = StObject.set(x, "sensitivityScore", value.asInstanceOf[js.Any])
    
    inline def setSensitivityScoreOverridden(value: boolean): Self = StObject.set(x, "sensitivityScoreOverridden", value.asInstanceOf[js.Any])
    
    inline def setSensitivityScoreOverriddenUndefined: Self = StObject.set(x, "sensitivityScoreOverridden", js.undefined)
    
    inline def setSensitivityScoreUndefined: Self = StObject.set(x, "sensitivityScore", js.undefined)
    
    inline def setStatistics(value: ResourceStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
  }
}
