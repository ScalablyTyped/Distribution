package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdValue extends StObject {
  
  var channelId: String
  
  var value: js.UndefOr[String] = js.undefined
  
  var variable: String
}
object ChannelIdValue {
  
  inline def apply(channelId: String, variable: String): ChannelIdValue = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdValue]
  }
  
  extension [Self <: ChannelIdValue](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
