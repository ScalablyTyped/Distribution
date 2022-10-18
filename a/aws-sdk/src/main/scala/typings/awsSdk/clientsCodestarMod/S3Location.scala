package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * The Amazon S3 object key where the source code files provided with the project request are stored.
    */
  var bucketKey: js.UndefOr[BucketKey] = js.undefined
  
  /**
    * The Amazon S3 bucket name where the source code files provided with the project request are stored.
    */
  var bucketName: js.UndefOr[BucketName] = js.undefined
}
object S3Location {
  
  inline def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  
  extension [Self <: S3Location](x: Self) {
    
    inline def setBucketKey(value: BucketKey): Self = StObject.set(x, "bucketKey", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyUndefined: Self = StObject.set(x, "bucketKey", js.undefined)
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
  }
}
