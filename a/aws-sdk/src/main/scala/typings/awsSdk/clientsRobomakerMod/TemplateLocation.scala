package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateLocation extends StObject {
  
  /**
    * The Amazon S3 bucket name.
    */
  var s3Bucket: S3Bucket
  
  /**
    * The list of S3 keys identifying the data source files.
    */
  var s3Key: S3Key
}
object TemplateLocation {
  
  inline def apply(s3Bucket: S3Bucket, s3Key: S3Key): TemplateLocation = {
    val __obj = js.Dynamic.literal(s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Key = s3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLocation]
  }
  
  extension [Self <: TemplateLocation](x: Self) {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
  }
}
