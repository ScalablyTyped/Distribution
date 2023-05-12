package typings.auth0.mod

import typings.auth0.anon.AwsAccountId
import typings.auth0.auth0Strings.active
import typings.auth0.auth0Strings.eventbridge
import typings.auth0.auth0Strings.paused
import typings.auth0.auth0Strings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBridgeLogStream
  extends StObject
     with LogStreamBase
     with LogStream {
  
  var sink: AwsAccountId
  
  var `type`: eventbridge
}
object EventBridgeLogStream {
  
  inline def apply(id: String, name: String, sink: AwsAccountId, status: active | paused | suspended): EventBridgeLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("eventbridge")
    __obj.asInstanceOf[EventBridgeLogStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventBridgeLogStream] (val x: Self) extends AnyVal {
    
    inline def setSink(value: AwsAccountId): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setType(value: eventbridge): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
