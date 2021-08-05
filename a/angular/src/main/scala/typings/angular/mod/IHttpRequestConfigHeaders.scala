package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHttpRequestConfigHeaders
  extends StObject
     with /**
  * Indexer which should return ng.INgModelController for most properties but cannot because of "All named properties must be assignable to string indexer type" constraint - see https://github.com/Microsoft/TypeScript/issues/272
  */
/* name */ StringDictionary[js.Any] {
  
  var common: js.UndefOr[js.Any] = js.undefined
  
  var get: js.UndefOr[js.Any] = js.undefined
  
  var patch: js.UndefOr[js.Any] = js.undefined
  
  var post: js.UndefOr[js.Any] = js.undefined
  
  var put: js.UndefOr[js.Any] = js.undefined
}
object IHttpRequestConfigHeaders {
  
  inline def apply(): IHttpRequestConfigHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttpRequestConfigHeaders]
  }
  
  extension [Self <: IHttpRequestConfigHeaders](x: Self) {
    
    inline def setCommon(value: js.Any): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setGet(value: js.Any): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setPatch(value: js.Any): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPost(value: js.Any): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPut(value: js.Any): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
  }
}
