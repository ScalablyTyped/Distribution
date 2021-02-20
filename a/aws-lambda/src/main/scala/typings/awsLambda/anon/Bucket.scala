package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bucket extends StObject {
  
  var bucket: Arn = js.native
  
  var configurationId: String = js.native
  
  var `object`: ETag = js.native
  
  var s3SchemaVersion: String = js.native
}
object Bucket {
  
  @scala.inline
  def apply(bucket: Arn, configurationId: String, `object`: ETag, s3SchemaVersion: String): Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], configurationId = configurationId.asInstanceOf[js.Any], s3SchemaVersion = s3SchemaVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit class BucketMutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: Arn): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ETag): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3SchemaVersion(value: String): Self = StObject.set(x, "s3SchemaVersion", value.asInstanceOf[js.Any])
  }
}
