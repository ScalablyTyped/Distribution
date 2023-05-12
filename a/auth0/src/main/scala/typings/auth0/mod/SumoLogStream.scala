package typings.auth0.mod

import typings.auth0.anon.SumoSourceAddress
import typings.auth0.auth0Strings.active
import typings.auth0.auth0Strings.paused
import typings.auth0.auth0Strings.sumo
import typings.auth0.auth0Strings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SumoLogStream
  extends StObject
     with LogStreamBase
     with LogStream {
  
  var sink: SumoSourceAddress
  
  var `type`: sumo
}
object SumoLogStream {
  
  inline def apply(id: String, name: String, sink: SumoSourceAddress, status: active | paused | suspended): SumoLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sumo")
    __obj.asInstanceOf[SumoLogStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SumoLogStream] (val x: Self) extends AnyVal {
    
    inline def setSink(value: SumoSourceAddress): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setType(value: sumo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
