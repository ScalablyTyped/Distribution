package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketNotificationConfiguration extends StObject {
  
  /**
    * Configurations for S3 bucket notifications.
    */
  var Configurations: js.UndefOr[AwsS3BucketNotificationConfigurationDetails] = js.undefined
}
object AwsS3BucketNotificationConfiguration {
  
  inline def apply(): AwsS3BucketNotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketNotificationConfiguration]
  }
  
  extension [Self <: AwsS3BucketNotificationConfiguration](x: Self) {
    
    inline def setConfigurations(value: AwsS3BucketNotificationConfigurationDetails): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: AwsS3BucketNotificationConfigurationDetail*): Self = StObject.set(x, "Configurations", js.Array(value*))
  }
}
