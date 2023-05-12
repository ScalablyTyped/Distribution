package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketObjectLockConfiguration extends StObject {
  
  /**
    *  Indicates whether the bucket has an Object Lock configuration enabled. 
    */
  var ObjectLockEnabled: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Specifies the Object Lock rule for the specified object. 
    */
  var Rule: js.UndefOr[AwsS3BucketObjectLockConfigurationRuleDetails] = js.undefined
}
object AwsS3BucketObjectLockConfiguration {
  
  inline def apply(): AwsS3BucketObjectLockConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketObjectLockConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketObjectLockConfiguration] (val x: Self) extends AnyVal {
    
    inline def setObjectLockEnabled(value: NonEmptyString): Self = StObject.set(x, "ObjectLockEnabled", value.asInstanceOf[js.Any])
    
    inline def setObjectLockEnabledUndefined: Self = StObject.set(x, "ObjectLockEnabled", js.undefined)
    
    inline def setRule(value: AwsS3BucketObjectLockConfigurationRuleDetails): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
