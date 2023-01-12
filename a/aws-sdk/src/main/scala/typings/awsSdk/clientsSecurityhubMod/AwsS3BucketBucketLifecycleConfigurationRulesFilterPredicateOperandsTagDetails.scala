package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails extends StObject {
  
  /**
    * The tag key.
    */
  var Key: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The tag value.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails {
  
  inline def apply(): AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails] (val x: Self) extends AnyVal {
    
    inline def setKey(value: NonEmptyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
