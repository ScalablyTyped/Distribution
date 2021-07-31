package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdVariable extends StObject {
  
  var channelId: String
  
  var variable: String
}
object ChannelIdVariable {
  
  @scala.inline
  def apply(channelId: String, variable: String): ChannelIdVariable = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdVariable]
  }
  
  @scala.inline
  implicit class ChannelIdVariableMutableBuilder[Self <: ChannelIdVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
