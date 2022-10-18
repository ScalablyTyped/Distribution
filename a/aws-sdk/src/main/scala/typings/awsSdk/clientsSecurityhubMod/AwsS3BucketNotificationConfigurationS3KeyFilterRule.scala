package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketNotificationConfigurationS3KeyFilterRule extends StObject {
  
  /**
    * Indicates whether the filter is based on the prefix or suffix of the Amazon S3 key.
    */
  var Name: js.UndefOr[AwsS3BucketNotificationConfigurationS3KeyFilterRuleName] = js.undefined
  
  /**
    * The filter value.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketNotificationConfigurationS3KeyFilterRule {
  
  inline def apply(): AwsS3BucketNotificationConfigurationS3KeyFilterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketNotificationConfigurationS3KeyFilterRule]
  }
  
  extension [Self <: AwsS3BucketNotificationConfigurationS3KeyFilterRule](x: Self) {
    
    inline def setName(value: AwsS3BucketNotificationConfigurationS3KeyFilterRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
