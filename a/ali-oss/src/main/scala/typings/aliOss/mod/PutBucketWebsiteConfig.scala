package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketWebsiteConfig extends StObject {
  
  // default page, e.g.: index.html
  var error: js.UndefOr[String] = js.undefined
  
  var index: String
}
object PutBucketWebsiteConfig {
  
  inline def apply(index: String): PutBucketWebsiteConfig = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketWebsiteConfig]
  }
  
  extension [Self <: PutBucketWebsiteConfig](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
