package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  /**
    * The name of the associated bucket for the Region.
    */
  var Bucket: BucketName
  
  /**
    * The Amazon Web Services account ID that owns the Amazon S3 bucket that's associated with this Multi-Region Access Point.
    */
  var BucketAccountId: js.UndefOr[AccountId] = js.undefined
}
object Region {
  
  inline def apply(Bucket: BucketName): Region = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketAccountId(value: AccountId): Self = StObject.set(x, "BucketAccountId", value.asInstanceOf[js.Any])
    
    inline def setBucketAccountIdUndefined: Self = StObject.set(x, "BucketAccountId", js.undefined)
  }
}
