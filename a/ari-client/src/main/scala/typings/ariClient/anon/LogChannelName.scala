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
  
  extension [Self <: LogChannelName](x: Self) {
    
    inline def setLogChannelName(value: String): Self = StObject.set(x, "logChannelName", value.asInstanceOf[js.Any])
  }
}
