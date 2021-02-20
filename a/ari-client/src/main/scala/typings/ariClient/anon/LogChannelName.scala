package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogChannelName extends StObject {
  
  var logChannelName: String = js.native
}
object LogChannelName {
  
  @scala.inline
  def apply(logChannelName: String): LogChannelName = {
    val __obj = js.Dynamic.literal(logChannelName = logChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogChannelName]
  }
  
  @scala.inline
  implicit class LogChannelNameMutableBuilder[Self <: LogChannelName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogChannelName(value: String): Self = StObject.set(x, "logChannelName", value.asInstanceOf[js.Any])
  }
}
