package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioChannelMapping extends StObject {
  
  /**
    * Indices and gain values for each input channel that should be remixed into this output channel.
    */
  var InputChannelLevels: listOfInputChannelLevel
  
  /**
    * The index of the output channel being produced.
    */
  var OutputChannel: integerMin0Max7
}
object AudioChannelMapping {
  
  inline def apply(InputChannelLevels: listOfInputChannelLevel, OutputChannel: integerMin0Max7): AudioChannelMapping = {
    val __obj = js.Dynamic.literal(InputChannelLevels = InputChannelLevels.asInstanceOf[js.Any], OutputChannel = OutputChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioChannelMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioChannelMapping] (val x: Self) extends AnyVal {
    
    inline def setInputChannelLevels(value: listOfInputChannelLevel): Self = StObject.set(x, "InputChannelLevels", value.asInstanceOf[js.Any])
    
    inline def setInputChannelLevelsVarargs(value: InputChannelLevel*): Self = StObject.set(x, "InputChannelLevels", js.Array(value*))
    
    inline def setOutputChannel(value: integerMin0Max7): Self = StObject.set(x, "OutputChannel", value.asInstanceOf[js.Any])
  }
}
