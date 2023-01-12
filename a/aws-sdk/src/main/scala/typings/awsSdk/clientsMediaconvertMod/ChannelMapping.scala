package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMapping extends StObject {
  
  /**
    * In your JSON job specification, include one child of OutputChannels for each audio channel that you want in your output. Each child should contain one instance of InputChannels or InputChannelsFineTune.
    */
  var OutputChannels: js.UndefOr[listOfOutputChannelMapping] = js.undefined
}
object ChannelMapping {
  
  inline def apply(): ChannelMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelMapping] (val x: Self) extends AnyVal {
    
    inline def setOutputChannels(value: listOfOutputChannelMapping): Self = StObject.set(x, "OutputChannels", value.asInstanceOf[js.Any])
    
    inline def setOutputChannelsUndefined: Self = StObject.set(x, "OutputChannels", js.undefined)
    
    inline def setOutputChannelsVarargs(value: OutputChannelMapping*): Self = StObject.set(x, "OutputChannels", js.Array(value*))
  }
}
