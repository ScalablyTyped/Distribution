package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedToLoad extends StObject {
  
  var failedToLoad: String
  
  var noMore: String
  
  var retry: String
}
object FailedToLoad {
  
  inline def apply(failedToLoad: String, noMore: String, retry: String): FailedToLoad = {
    val __obj = js.Dynamic.literal(failedToLoad = failedToLoad.asInstanceOf[js.Any], noMore = noMore.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedToLoad]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedToLoad] (val x: Self) extends AnyVal {
    
    inline def setFailedToLoad(value: String): Self = StObject.set(x, "failedToLoad", value.asInstanceOf[js.Any])
    
    inline def setNoMore(value: String): Self = StObject.set(x, "noMore", value.asInstanceOf[js.Any])
    
    inline def setRetry(value: String): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
  }
}
