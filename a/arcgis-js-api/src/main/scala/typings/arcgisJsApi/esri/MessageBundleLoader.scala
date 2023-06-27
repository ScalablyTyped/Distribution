package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBundleLoader extends StObject {
  
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
    fetchMessageBundle: (/* bundleId */ String, /* locale */ String) => js.Promise[Any],
    pattern: String | js.RegExp
  ): MessageBundleLoader = {
    val __obj = js.Dynamic.literal(fetchMessageBundle = js.Any.fromFunction2(fetchMessageBundle), pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBundleLoader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageBundleLoader] (val x: Self) extends AnyVal {
    
    inline def setFetchMessageBundle(value: (/* bundleId */ String, /* locale */ String) => js.Promise[Any]): Self = StObject.set(x, "fetchMessageBundle", js.Any.fromFunction2(value))
    
    inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
