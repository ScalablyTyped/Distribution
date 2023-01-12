package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRegistryOptions extends StObject {
  
  /** This is the page you would normally navigate to in order to use the app in a standalone page. */
  var endpoint: String
  
  /** An optional string to supply inline styling for the iframe. */
  var style: js.UndefOr[String] = js.undefined
}
object AppRegistryOptions {
  
  inline def apply(endpoint: String): AppRegistryOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppRegistryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppRegistryOptions] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
