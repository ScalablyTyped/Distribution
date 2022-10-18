package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseRequestSrcUtilsCachePromiseMod {
  
  @JSImport("ahooks/lib/useRequest/src/utils/cachePromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCachePromise(cacheKey: CachedKey): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCachePromise")(cacheKey.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  
  inline def setCachePromise(cacheKey: CachedKey, promise: js.Promise[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCachePromise")(cacheKey.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type CachedKey = String | Double
}
