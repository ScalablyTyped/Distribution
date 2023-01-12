package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTaskS3Location extends StObject {
  
  /**
    * The destination Amazon S3 bucket.
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The prefix (logical hierarchy) in the bucket.
    */
  var S3Prefix: js.UndefOr[String] = js.undefined
}
object ExportTaskS3Location {
  
  inline def apply(): ExportTaskS3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskS3Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportTaskS3Location] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
  }
}
