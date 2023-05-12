package typings.auth0.mod

import typings.auth0.anon.SplunkDomain
import typings.auth0.auth0Strings.active
import typings.auth0.auth0Strings.paused
import typings.auth0.auth0Strings.splunk
import typings.auth0.auth0Strings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplunkLogStream
  extends StObject
     with LogStreamBase
     with LogStream {
  
  var sink: SplunkDomain
  
  var `type`: splunk
}
object SplunkLogStream {
  
  inline def apply(id: String, name: String, sink: SplunkDomain, status: active | paused | suspended): SplunkLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("splunk")
    __obj.asInstanceOf[SplunkLogStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplunkLogStream] (val x: Self) extends AnyVal {
    
    inline def setSink(value: SplunkDomain): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setType(value: splunk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
