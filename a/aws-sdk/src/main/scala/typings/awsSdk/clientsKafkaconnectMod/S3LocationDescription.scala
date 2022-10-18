package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3LocationDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an S3 bucket.
    */
  var bucketArn: js.UndefOr[string] = js.undefined
  
  /**
    * The file key for an object in an S3 bucket.
    */
  var fileKey: js.UndefOr[string] = js.undefined
  
  /**
    * The version of an object in an S3 bucket.
    */
  var objectVersion: js.UndefOr[string] = js.undefined
}
object S3LocationDescription {
  
  inline def apply(): S3LocationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3LocationDescription]
  }
  
  extension [Self <: S3LocationDescription](x: Self) {
    
    inline def setBucketArn(value: string): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setBucketArnUndefined: Self = StObject.set(x, "bucketArn", js.undefined)
    
    inline def setFileKey(value: string): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    
    inline def setFileKeyUndefined: Self = StObject.set(x, "fileKey", js.undefined)
    
    inline def setObjectVersion(value: string): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
