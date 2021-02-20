package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogChannel extends StObject {
  
  /**
    * The log channel path.
    */
  var channel: String = js.native
  
  /**
    * The various log levels.
    */
  var configuration: String = js.native
  
  /**
    * Whether or not a log type is enabled.
    */
  var status: String = js.native
  
  /**
    * Types of logs for the log channel.
    */
  var `type`: String = js.native
}
object LogChannel {
  
  @scala.inline
  def apply(channel: String, configuration: String, status: String, `type`: String): LogChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogChannel]
  }
  
  @scala.inline
  implicit class LogChannelMutableBuilder[Self <: LogChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
