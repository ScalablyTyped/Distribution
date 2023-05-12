package typings.auth0.mod

import typings.auth0.anon.AzurePartnerTopic
import typings.auth0.auth0Strings.active
import typings.auth0.auth0Strings.eventgrid
import typings.auth0.auth0Strings.paused
import typings.auth0.auth0Strings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventGridLogStream
  extends StObject
     with LogStreamBase
     with LogStream {
  
  var sink: AzurePartnerTopic
  
  var `type`: eventgrid
}
object EventGridLogStream {
  
  inline def apply(id: String, name: String, sink: AzurePartnerTopic, status: active | paused | suspended): EventGridLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("eventgrid")
    __obj.asInstanceOf[EventGridLogStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventGridLogStream] (val x: Self) extends AnyVal {
    
    inline def setSink(value: AzurePartnerTopic): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setType(value: eventgrid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
