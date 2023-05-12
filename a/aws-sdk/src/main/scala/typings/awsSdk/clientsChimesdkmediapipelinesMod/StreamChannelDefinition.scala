package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamChannelDefinition extends StObject {
  
  /**
    * The definitions of the channels in a streaming channel.
    */
  var ChannelDefinitions: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.ChannelDefinitions] = js.undefined
  
  /**
    * The number of channels in a streaming channel.
    */
  var NumberOfChannels: typings.awsSdk.clientsChimesdkmediapipelinesMod.NumberOfChannels
}
object StreamChannelDefinition {
  
  inline def apply(NumberOfChannels: NumberOfChannels): StreamChannelDefinition = {
    val __obj = js.Dynamic.literal(NumberOfChannels = NumberOfChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamChannelDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamChannelDefinition] (val x: Self) extends AnyVal {
    
    inline def setChannelDefinitions(value: ChannelDefinitions): Self = StObject.set(x, "ChannelDefinitions", value.asInstanceOf[js.Any])
    
    inline def setChannelDefinitionsUndefined: Self = StObject.set(x, "ChannelDefinitions", js.undefined)
    
    inline def setChannelDefinitionsVarargs(value: ChannelDefinition*): Self = StObject.set(x, "ChannelDefinitions", js.Array(value*))
    
    inline def setNumberOfChannels(value: NumberOfChannels): Self = StObject.set(x, "NumberOfChannels", value.asInstanceOf[js.Any])
  }
}
