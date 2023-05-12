package typings.auth0.mod

import typings.auth0.anon.DatadogApiKey
import typings.auth0.auth0Strings.active
import typings.auth0.auth0Strings.datadog
import typings.auth0.auth0Strings.paused
import typings.auth0.auth0Strings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatadogLogStream
  extends StObject
     with LogStreamBase
     with LogStream {
  
  var sink: DatadogApiKey
  
  var `type`: datadog
}
object DatadogLogStream {
  
  inline def apply(id: String, name: String, sink: DatadogApiKey, status: active | paused | suspended): DatadogLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("datadog")
    __obj.asInstanceOf[DatadogLogStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatadogLogStream] (val x: Self) extends AnyVal {
    
    inline def setSink(value: DatadogApiKey): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setType(value: datadog): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
