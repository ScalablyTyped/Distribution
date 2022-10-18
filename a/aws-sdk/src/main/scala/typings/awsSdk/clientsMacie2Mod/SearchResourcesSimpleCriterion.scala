package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesSimpleCriterion extends StObject {
  
  /**
    * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
    */
  var comparator: js.UndefOr[SearchResourcesComparator] = js.undefined
  
  /**
    * The property to use in the condition.
    */
  var key: js.UndefOr[SearchResourcesSimpleCriterionKey] = js.undefined
  
  /**
    * An array that lists one or more values to use in the condition. If you specify multiple values, Amazon Macie uses OR logic to join the values. Valid values for each supported property (key) are: ACCOUNT_ID - A string that represents the unique identifier for the Amazon Web Services account that owns the resource. S3_BUCKET_EFFECTIVE_PERMISSION - A string that represents an enumerated value that Macie defines for the BucketPublicAccess.effectivePermission property of an S3 bucket. S3_BUCKET_NAME - A string that represents the name of an S3 bucket. S3_BUCKET_SHARED_ACCESS - A string that represents an enumerated value that Macie defines for the BucketMetadata.sharedAccess property of an S3 bucket. Values are case sensitive. Also, Macie doesn't support use of partial values or wildcard characters in values.
    */
  var values: js.UndefOr[listOfString] = js.undefined
}
object SearchResourcesSimpleCriterion {
  
  inline def apply(): SearchResourcesSimpleCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesSimpleCriterion]
  }
  
  extension [Self <: SearchResourcesSimpleCriterion](x: Self) {
    
    inline def setComparator(value: SearchResourcesComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setKey(value: SearchResourcesSimpleCriterionKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: listOfString): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: string*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
