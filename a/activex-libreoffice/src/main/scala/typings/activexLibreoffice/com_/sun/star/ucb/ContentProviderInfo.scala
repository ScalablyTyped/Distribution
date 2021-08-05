package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure for content provider information.
  * @see XContentProviderManager
  */
trait ContentProviderInfo extends StObject {
  
  /** The content provider. */
  var ContentProvider: XContentProvider
  
  /** The scheme the Provider is registered for. */
  var Scheme: String
}
object ContentProviderInfo {
  
  inline def apply(ContentProvider: XContentProvider, Scheme: String): ContentProviderInfo = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentProviderInfo]
  }
  
  extension [Self <: ContentProviderInfo](x: Self) {
    
    inline def setContentProvider(value: XContentProvider): Self = StObject.set(x, "ContentProvider", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
  }
}
