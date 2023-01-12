package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdVariable extends StObject {
  
  var channelId: String
  
  var variable: String
}
object ChannelIdVariable {
  
  inline def apply(channelId: String, variable: String): ChannelIdVariable = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdVariable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelIdVariable] (val x: Self) extends AnyVal {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
