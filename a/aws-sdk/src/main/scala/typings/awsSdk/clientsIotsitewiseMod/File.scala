package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  /**
    * The name of the Amazon S3 bucket from which data is imported.
    */
  var bucket: Bucket
  
  /**
    * The key of the Amazon S3 object that contains your data. Each object has a key that is a unique identifier. Each object has exactly one key.
    */
  var key: String
  
  /**
    * The version ID to identify a specific version of the Amazon S3 object that contains your data.
    */
  var versionId: js.UndefOr[String] = js.undefined
}
object File {
  
  inline def apply(bucket: Bucket, key: String): File = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setBucket(value: Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
