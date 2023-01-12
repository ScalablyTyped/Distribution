package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogChannelName extends StObject {
  
  var logChannelName: String
}
object LogChannelName {
  
  inline def apply(logChannelName: String): LogChannelName = {
    val __obj = js.Dynamic.literal(logChannelName = logChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogChannelName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogChannelName] (val x: Self) extends AnyVal {
    
    inline def setLogChannelName(value: String): Self = StObject.set(x, "logChannelName", value.asInstanceOf[js.Any])
  }
}
