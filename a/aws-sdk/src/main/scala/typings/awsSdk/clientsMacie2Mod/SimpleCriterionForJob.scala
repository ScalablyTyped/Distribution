package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleCriterionForJob extends StObject {
  
  /**
    * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
    */
  var comparator: js.UndefOr[JobComparator] = js.undefined
  
  /**
    * The property to use in the condition.
    */
  var key: js.UndefOr[SimpleCriterionKeyForJob] = js.undefined
  
  /**
    * An array that lists one or more values to use in the condition. If you specify multiple values, Amazon Macie uses OR logic to join the values. Valid values for each supported property (key) are: ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns the bucket. S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the BucketPublicAccess.effectivePermission property of a bucket. S3_BUCKET_NAME - A string that represents the name of a bucket. S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the BucketMetadata.sharedAccess property of a bucket. Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in these values.
    */
  var values: js.UndefOr[listOfString] = js.undefined
}
object SimpleCriterionForJob {
  
  inline def apply(): SimpleCriterionForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleCriterionForJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleCriterionForJob] (val x: Self) extends AnyVal {
    
    inline def setComparator(value: JobComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setKey(value: SimpleCriterionKeyForJob): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: listOfString): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: string*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
