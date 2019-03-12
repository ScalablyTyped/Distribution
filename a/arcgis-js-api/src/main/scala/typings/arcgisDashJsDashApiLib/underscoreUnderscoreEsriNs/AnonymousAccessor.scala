package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonymousAccessor
  extends stdLib.Object {
  var get: js.UndefOr[js.Function1[/* propertyName */ java.lang.String, _]] = js.undefined
  var set: js.UndefOr[
    (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, this.type]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], this.type])
  ] = js.undefined
  var watch: js.UndefOr[
    js.Function3[
      /* path */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[scala.Boolean], 
      WatchHandle
    ]
  ] = js.undefined
}

object AnonymousAccessor {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    get: /* propertyName */ java.lang.String => _ = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, AnonymousAccessor]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], AnonymousAccessor]) = null,
    watch: (/* path */ java.lang.String | js.Array[java.lang.String], /* callback */ WatchCallback, /* sync */ js.UndefOr[scala.Boolean]) => WatchHandle = null
  ): AnonymousAccessor = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[AnonymousAccessor]
  }
}

