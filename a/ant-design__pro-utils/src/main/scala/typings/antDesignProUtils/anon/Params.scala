package typings.antDesignProUtils.anon

import typings.antDesignProUtils.useFetchDataMod.ProRequestData
import typings.react.mod.Key
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params[U /* <: Record[String, Any] */, T] extends StObject {
  
  var params: js.UndefOr[U] = js.undefined
  
  var proFieldKey: js.UndefOr[Key] = js.undefined
  
  var request: js.UndefOr[ProRequestData[T, U]] = js.undefined
}
object Params {
  
  inline def apply[U /* <: Record[String, Any] */, T](): Params[U, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params[U, T]]
  }
  
  extension [Self <: Params[?, ?], U /* <: Record[String, Any] */, T](x: Self & (Params[U, T])) {
    
    inline def setParams(value: U): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setProFieldKey(value: Key): Self = StObject.set(x, "proFieldKey", value.asInstanceOf[js.Any])
    
    inline def setProFieldKeyUndefined: Self = StObject.set(x, "proFieldKey", js.undefined)
    
    inline def setRequest(value: (U, /* props */ Any) => js.Promise[T]): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
