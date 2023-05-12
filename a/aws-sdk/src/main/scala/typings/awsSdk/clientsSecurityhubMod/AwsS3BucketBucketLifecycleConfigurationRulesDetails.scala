package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketBucketLifecycleConfigurationRulesDetails extends StObject {
  
  /**
    * How Amazon S3 responds when a multipart upload is incomplete. Specifically, provides a number of days before Amazon S3 cancels the entire upload.
    */
  var AbortIncompleteMultipartUpload: js.UndefOr[
    AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails
  ] = js.undefined
  
  /**
    * The date when objects are moved or deleted. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var ExpirationDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The length in days of the lifetime for objects that are subject to the rule.
    */
  var ExpirationInDays: js.UndefOr[Integer] = js.undefined
  
  /**
    * Whether Amazon S3 removes a delete marker that has no noncurrent versions. If set to true, the delete marker is expired. If set to false, the policy takes no action. If you provide ExpiredObjectDeleteMarker, you cannot provide ExpirationInDays or ExpirationDate.
    */
  var ExpiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies the objects that a rule applies to.
    */
  var Filter: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails] = js.undefined
  
  /**
    * The unique identifier of the rule.
    */
  var ID: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
    */
  var NoncurrentVersionExpirationInDays: js.UndefOr[Integer] = js.undefined
  
  /**
    * Transition rules that describe when noncurrent objects transition to a specified storage class.
    */
  var NoncurrentVersionTransitions: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsList] = js.undefined
  
  /**
    * A prefix that identifies one or more objects that the rule applies to.
    */
  var Prefix: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current status of the rule. Indicates whether the rule is currently being applied.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Transition rules that indicate when objects transition to a specified storage class.
    */
  var Transitions: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesTransitionsList] = js.undefined
}
object AwsS3BucketBucketLifecycleConfigurationRulesDetails {
  
  inline def apply(): AwsS3BucketBucketLifecycleConfigurationRulesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketBucketLifecycleConfigurationRulesDetails] (val x: Self) extends AnyVal {
    
    inline def setAbortIncompleteMultipartUpload(value: AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    
    inline def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
    
    inline def setExpirationDate(value: NonEmptyString): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    inline def setExpirationInDays(value: Integer): Self = StObject.set(x, "ExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setExpirationInDaysUndefined: Self = StObject.set(x, "ExpirationInDays", js.undefined)
    
    inline def setExpiredObjectDeleteMarker(value: Boolean): Self = StObject.set(x, "ExpiredObjectDeleteMarker", value.asInstanceOf[js.Any])
    
    inline def setExpiredObjectDeleteMarkerUndefined: Self = StObject.set(x, "ExpiredObjectDeleteMarker", js.undefined)
    
    inline def setFilter(value: AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setID(value: NonEmptyString): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    inline def setNoncurrentVersionExpirationInDays(value: Integer): Self = StObject.set(x, "NoncurrentVersionExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentVersionExpirationInDaysUndefined: Self = StObject.set(x, "NoncurrentVersionExpirationInDays", js.undefined)
    
    inline def setNoncurrentVersionTransitions(value: AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsList): Self = StObject.set(x, "NoncurrentVersionTransitions", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentVersionTransitionsUndefined: Self = StObject.set(x, "NoncurrentVersionTransitions", js.undefined)
    
    inline def setNoncurrentVersionTransitionsVarargs(value: AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails*): Self = StObject.set(x, "NoncurrentVersionTransitions", js.Array(value*))
    
    inline def setPrefix(value: NonEmptyString): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTransitions(value: AwsS3BucketBucketLifecycleConfigurationRulesTransitionsList): Self = StObject.set(x, "Transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "Transitions", js.undefined)
    
    inline def setTransitionsVarargs(value: AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails*): Self = StObject.set(x, "Transitions", js.Array(value*))
  }
}
