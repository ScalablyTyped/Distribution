package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ClassificationScopeExclusionUpdate extends StObject {
  
  /**
    * Depending on the value specified for the update operation (ClassificationScopeUpdateOperation), an array of strings that: lists the names of buckets to add or remove from the list, or specifies a new set of bucket names that overwrites all existing names in the list. Each string must be the full name of an S3 bucket. Values are case sensitive.
    */
  var bucketNames: listOfS3BucketName
  
  /**
    * Specifies how to apply the changes to the exclusion list. Valid values are: ADD - Append the specified bucket names to the current list. REMOVE - Remove the specified bucket names from the current list. REPLACE - Overwrite the current list with the specified list of bucket names. If you specify this value, Amazon Macie removes all existing names from the list and adds all the specified names to the list.
    */
  var operation: ClassificationScopeUpdateOperation
}
object S3ClassificationScopeExclusionUpdate {
  
  inline def apply(bucketNames: listOfS3BucketName, operation: ClassificationScopeUpdateOperation): S3ClassificationScopeExclusionUpdate = {
    val __obj = js.Dynamic.literal(bucketNames = bucketNames.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ClassificationScopeExclusionUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ClassificationScopeExclusionUpdate] (val x: Self) extends AnyVal {
    
    inline def setBucketNames(value: listOfS3BucketName): Self = StObject.set(x, "bucketNames", value.asInstanceOf[js.Any])
    
    inline def setBucketNamesVarargs(value: S3BucketName*): Self = StObject.set(x, "bucketNames", js.Array(value*))
    
    inline def setOperation(value: ClassificationScopeUpdateOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
