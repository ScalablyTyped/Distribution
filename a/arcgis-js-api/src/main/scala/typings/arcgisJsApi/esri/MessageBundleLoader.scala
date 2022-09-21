package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBundleLoader
  extends StObject
     with Object {
  
  /**
    * Called to load the message bundle if the `pattern` matches the bundle identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#MessageBundleLoader)
    */
  def fetchMessageBundle(bundleId: String, locale: String): js.Promise[Any]
  /**
    * Called to load the message bundle if the `pattern` matches the bundle identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#MessageBundleLoader)
    */
  @JSName("fetchMessageBundle")
  var fetchMessageBundle_Original: FetchMessageBundle
  
  /**
    * Used to check if the loader should be used to load a candidate message bundle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#MessageBundleLoader)
    */
  var pattern: String | js.RegExp
}
object MessageBundleLoader {
  
  inline def apply(
    constructor: js.Function,
    fetchMessageBundle: (/* bundleId */ String, /* locale */ String) => js.Promise[Any],
    hasOwnProperty: PropertyKey => Boolean,
    pattern: String | js.RegExp,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MessageBundleLoader = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], fetchMessageBundle = js.Any.fromFunction2(fetchMessageBundle), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pattern = pattern.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MessageBundleLoader]
  }
  
  extension [Self <: MessageBundleLoader](x: Self) {
    
    inline def setFetchMessageBundle(value: (/* bundleId */ String, /* locale */ String) => js.Promise[Any]): Self = StObject.set(x, "fetchMessageBundle", js.Any.fromFunction2(value))
    
    inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
