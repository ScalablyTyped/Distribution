package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonymousAccessor extends Object {
  var get: js.UndefOr[js.Function1[/* propertyName */ String, _]] = js.undefined
  var set: js.UndefOr[
    (js.Function2[/* propertyName */ String, /* value */ js.Any, this.type]) with (js.Function1[/* props */ HashMap[_], this.type])
  ] = js.undefined
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
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    get: /* propertyName */ String => _ = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, AnonymousAccessor]) with (js.Function1[/* props */ HashMap[_], AnonymousAccessor]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle = null
  ): AnonymousAccessor = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[AnonymousAccessor]
  }
}

