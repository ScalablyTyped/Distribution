package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails extends StObject {
  
  /**
    *  The number of days that you want to specify for the default retention period. 
    */
  var Days: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The default Object Lock retention mode you want to apply to new objects placed in the specified bucket. 
    */
  var Mode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The number of years that you want to specify for the default retention period. 
    */
  var Years: js.UndefOr[Integer] = js.undefined
}
object AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails {
  
  inline def apply(): AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails] (val x: Self) extends AnyVal {
    
    inline def setDays(value: Integer): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
    
    inline def setMode(value: NonEmptyString): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setYears(value: Integer): Self = StObject.set(x, "Years", value.asInstanceOf[js.Any])
    
    inline def setYearsUndefined: Self = StObject.set(x, "Years", js.undefined)
  }
}
