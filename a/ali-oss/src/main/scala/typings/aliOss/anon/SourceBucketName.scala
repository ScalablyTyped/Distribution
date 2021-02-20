package typings.aliOss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceBucketName extends StObject {
  
  var sourceBucketName: String = js.native
  
  var sourceKey: String = js.native
}
object SourceBucketName {
  
  @scala.inline
  def apply(sourceBucketName: String, sourceKey: String): SourceBucketName = {
    val __obj = js.Dynamic.literal(sourceBucketName = sourceBucketName.asInstanceOf[js.Any], sourceKey = sourceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBucketName]
  }
  
  @scala.inline
  implicit class SourceBucketNameMutableBuilder[Self <: SourceBucketName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceBucketName(value: String): Self = StObject.set(x, "sourceBucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceKey(value: String): Self = StObject.set(x, "sourceKey", value.asInstanceOf[js.Any])
  }
}
