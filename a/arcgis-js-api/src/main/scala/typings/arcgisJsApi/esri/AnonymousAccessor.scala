package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonymousAccessor
  extends StObject
     with Object {
  
  var get: js.UndefOr[js.Function1[/* propertyName */ String, js.Any]] = js.undefined
  
  var set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ js.Any, this.type]]) & (js.UndefOr[js.Function1[/* props */ HashMap[js.Any], this.type]])
  
  var watch: js.UndefOr[
    js.Function3[
      /* path */ String | js.Array[String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[Boolean], 
      WatchHandle
    ]
  ] = js.undefined
}
object AnonymousAccessor {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ js.Any, AnonymousAccessor]]) & (js.UndefOr[js.Function1[/* props */ HashMap[js.Any], AnonymousAccessor]])
  ): AnonymousAccessor = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousAccessor]
  }
  
  extension [Self <: AnonymousAccessor](x: Self) {
    
    inline def setGet(value: /* propertyName */ String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setSet(
      value: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ js.Any, AnonymousAccessor]]) & (js.UndefOr[js.Function1[/* props */ HashMap[js.Any], AnonymousAccessor]])
    ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setWatch(
      value: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle
    ): Self = StObject.set(x, "watch", js.Any.fromFunction3(value))
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
