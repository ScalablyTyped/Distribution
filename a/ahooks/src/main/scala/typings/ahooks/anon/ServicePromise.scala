package typings.ahooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicePromise[TData] extends StObject {
  
  var servicePromise: js.UndefOr[js.Promise[TData]] = js.undefined
}
object ServicePromise {
  
  inline def apply[TData](): ServicePromise[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePromise[TData]]
  }
  
  extension [Self <: ServicePromise[?], TData](x: Self & ServicePromise[TData]) {
    
    inline def setServicePromise(value: js.Promise[TData]): Self = StObject.set(x, "servicePromise", value.asInstanceOf[js.Any])
    
    inline def setServicePromiseUndefined: Self = StObject.set(x, "servicePromise", js.undefined)
  }
}
