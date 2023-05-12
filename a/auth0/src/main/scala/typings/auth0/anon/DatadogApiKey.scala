package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatadogApiKey extends StObject {
  
  var datadogApiKey: String
  
  var datadogRegion: String
}
object DatadogApiKey {
  
  inline def apply(datadogApiKey: String, datadogRegion: String): DatadogApiKey = {
    val __obj = js.Dynamic.literal(datadogApiKey = datadogApiKey.asInstanceOf[js.Any], datadogRegion = datadogRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogApiKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatadogApiKey] (val x: Self) extends AnyVal {
    
    inline def setDatadogApiKey(value: String): Self = StObject.set(x, "datadogApiKey", value.asInstanceOf[js.Any])
    
    inline def setDatadogRegion(value: String): Self = StObject.set(x, "datadogRegion", value.asInstanceOf[js.Any])
  }
}
