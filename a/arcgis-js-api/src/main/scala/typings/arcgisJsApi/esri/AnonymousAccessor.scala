package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnonymousAccessor extends Object {
  
  var get: js.UndefOr[js.Function1[/* propertyName */ String, _]] = js.native
  
  var set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ js.Any, this.type]]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], this.type]]) = js.native
  
  var watch: js.UndefOr[
    js.Function3[
      /* path */ String | js.Array[String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[Boolean], 
      WatchHandle
    ]
  ] = js.native
}
object AnonymousAccessor {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ js.Any, AnonymousAccessor]]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], AnonymousAccessor]])
  ): AnonymousAccessor = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousAccessor]
  }
  
  @scala.inline
  implicit class AnonymousAccessorMutableBuilder[Self <: AnonymousAccessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: /* propertyName */ String => _): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setSet(
      value: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ js.Any, AnonymousAccessor]]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], AnonymousAccessor]])
    ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatch(
      value: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle
    ): Self = StObject.set(x, "watch", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
