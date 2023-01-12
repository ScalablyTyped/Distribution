package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails extends StObject {
  
  /**
    * The configuration for the filter.
    */
  var Predicate: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails] = js.undefined
}
object AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails {
  
  inline def apply(): AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails] (val x: Self) extends AnyVal {
    
    inline def setPredicate(value: AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails): Self = StObject.set(x, "Predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateUndefined: Self = StObject.set(x, "Predicate", js.undefined)
  }
}
