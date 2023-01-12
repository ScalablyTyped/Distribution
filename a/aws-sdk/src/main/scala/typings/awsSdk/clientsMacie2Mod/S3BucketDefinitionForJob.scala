package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketDefinitionForJob extends StObject {
  
  /**
    * The unique identifier for the Amazon Web Services account that owns the buckets.
    */
  var accountId: string
  
  /**
    * An array that lists the names of the buckets.
    */
  var buckets: listOfString
}
object S3BucketDefinitionForJob {
  
  inline def apply(accountId: string, buckets: listOfString): S3BucketDefinitionForJob = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], buckets = buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketDefinitionForJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3BucketDefinitionForJob] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setBuckets(value: listOfString): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsVarargs(value: string*): Self = StObject.set(x, "buckets", js.Array(value*))
  }
}
