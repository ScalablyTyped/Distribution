package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalBucket extends StObject {
  
  /**
    * 
    */
  var Bucket: BucketName
  
  /**
    * The Amazon Resource Name (ARN) for the regional bucket.
    */
  var BucketArn: js.UndefOr[S3RegionalBucketArn] = js.undefined
  
  /**
    * The creation date of the regional bucket
    */
  var CreationDate: js.Date
  
  /**
    * The Outposts ID of the regional bucket.
    */
  var OutpostId: js.UndefOr[NonEmptyMaxLength64String] = js.undefined
  
  /**
    * 
    */
  var PublicAccessBlockEnabled: typings.awsSdk.clientsS3controlMod.PublicAccessBlockEnabled
}
object RegionalBucket {
  
  inline def apply(Bucket: BucketName, CreationDate: js.Date, PublicAccessBlockEnabled: PublicAccessBlockEnabled): RegionalBucket = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], PublicAccessBlockEnabled = PublicAccessBlockEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionalBucket]
  }
  
  extension [Self <: RegionalBucket](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketArn(value: S3RegionalBucketArn): Self = StObject.set(x, "BucketArn", value.asInstanceOf[js.Any])
    
    inline def setBucketArnUndefined: Self = StObject.set(x, "BucketArn", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setOutpostId(value: NonEmptyMaxLength64String): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    inline def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
    
    inline def setPublicAccessBlockEnabled(value: PublicAccessBlockEnabled): Self = StObject.set(x, "PublicAccessBlockEnabled", value.asInstanceOf[js.Any])
  }
}
