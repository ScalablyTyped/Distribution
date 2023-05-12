package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketObjectLockConfigurationRuleDetails extends StObject {
  
  /**
    *  The default Object Lock retention mode and period that you want to apply to new objects placed in the specified bucket. 
    */
  var DefaultRetention: js.UndefOr[AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails] = js.undefined
}
object AwsS3BucketObjectLockConfigurationRuleDetails {
  
  inline def apply(): AwsS3BucketObjectLockConfigurationRuleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketObjectLockConfigurationRuleDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketObjectLockConfigurationRuleDetails] (val x: Self) extends AnyVal {
    
    inline def setDefaultRetention(value: AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails): Self = StObject.set(x, "DefaultRetention", value.asInstanceOf[js.Any])
    
    inline def setDefaultRetentionUndefined: Self = StObject.set(x, "DefaultRetention", js.undefined)
  }
}
