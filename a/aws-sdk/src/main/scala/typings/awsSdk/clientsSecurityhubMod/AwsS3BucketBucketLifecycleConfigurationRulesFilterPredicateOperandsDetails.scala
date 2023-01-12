package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails extends StObject {
  
  /**
    * Prefix text for matching objects.
    */
  var Prefix: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A tag that is assigned to matching objects.
    */
  var Tag: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails] = js.undefined
  
  /**
    * The type of filter value. Valid values are LifecyclePrefixPredicate or LifecycleTagPredicate.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails {
  
  inline def apply(): AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails] (val x: Self) extends AnyVal {
    
    inline def setPrefix(value: NonEmptyString): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTag(value: AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
