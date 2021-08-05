package typings.aliOss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceBucketName extends StObject {
  
  var sourceBucketName: String
  
  var sourceKey: String
}
object SourceBucketName {
  
  inline def apply(sourceBucketName: String, sourceKey: String): SourceBucketName = {
    val __obj = js.Dynamic.literal(sourceBucketName = sourceBucketName.asInstanceOf[js.Any], sourceKey = sourceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBucketName]
  }
  
  extension [Self <: SourceBucketName](x: Self) {
    
    inline def setSourceBucketName(value: String): Self = StObject.set(x, "sourceBucketName", value.asInstanceOf[js.Any])
    
    inline def setSourceKey(value: String): Self = StObject.set(x, "sourceKey", value.asInstanceOf[js.Any])
  }
}
