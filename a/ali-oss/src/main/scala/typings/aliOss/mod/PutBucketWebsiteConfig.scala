package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketWebsiteConfig extends StObject {
  
  // default page, e.g.: index.html
  var error: js.UndefOr[String] = js.native
  
  var index: String = js.native
}
object PutBucketWebsiteConfig {
  
  @scala.inline
  def apply(index: String): PutBucketWebsiteConfig = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketWebsiteConfig]
  }
  
  @scala.inline
  implicit class PutBucketWebsiteConfigMutableBuilder[Self <: PutBucketWebsiteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
