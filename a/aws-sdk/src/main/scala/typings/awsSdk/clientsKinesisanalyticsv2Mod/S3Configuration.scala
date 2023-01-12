package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Configuration extends StObject {
  
  /**
    * The ARN of the S3 bucket that contains the data.
    */
  var BucketARN: typings.awsSdk.clientsKinesisanalyticsv2Mod.BucketARN
  
  /**
    * The name of the object that contains the data.
    */
  var FileKey: typings.awsSdk.clientsKinesisanalyticsv2Mod.FileKey
}
object S3Configuration {
  
  inline def apply(BucketARN: BucketARN, FileKey: FileKey): S3Configuration = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Configuration] (val x: Self) extends AnyVal {
    
    inline def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    inline def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
  }
}
