package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationMoveFailed
  extends StObject
     with Event {
  
  /**
    * Arguments to the application.
    */
  var args: String | js.Array[String]
  
  /**
    * Channel.
    */
  var channel: Channel
  
  /**
    * Destination.
    */
  var destination: String
}
object ApplicationMoveFailed {
  
  inline def apply(
    application: String,
    args: String | js.Array[String],
    channel: Channel,
    destination: String,
    timestamp: Date,
    `type`: String
  ): ApplicationMoveFailed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMoveFailed]
  }
  
  extension [Self <: ApplicationMoveFailed](x: Self) {
    
    inline def setArgs(value: String | js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
