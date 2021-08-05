package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  var bucket: Arn
  
  var configurationId: String
  
  var `object`: ETag
  
  var s3SchemaVersion: String
}
object Bucket {
  
  inline def apply(bucket: Arn, configurationId: String, `object`: ETag, s3SchemaVersion: String): Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], configurationId = configurationId.asInstanceOf[js.Any], s3SchemaVersion = s3SchemaVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  
  extension [Self <: Bucket](x: Self) {
    
    inline def setBucket(value: Arn): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ETag): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setS3SchemaVersion(value: String): Self = StObject.set(x, "s3SchemaVersion", value.asInstanceOf[js.Any])
  }
}
