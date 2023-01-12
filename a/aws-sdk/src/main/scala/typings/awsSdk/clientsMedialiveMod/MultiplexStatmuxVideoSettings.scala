package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexStatmuxVideoSettings extends StObject {
  
  /**
    * Maximum statmux bitrate.
    */
  var MaximumBitrate: js.UndefOr[integerMin100000Max100000000] = js.undefined
  
  /**
    * Minimum statmux bitrate.
    */
  var MinimumBitrate: js.UndefOr[integerMin100000Max100000000] = js.undefined
  
  /**
    * The purpose of the priority is to use a combination of the\nmultiplex rate control algorithm and the QVBR capability of the\nencoder to prioritize the video quality of some channels in a\nmultiplex over others.  Channels that have a higher priority will\nget higher video quality at the expense of the video quality of\nother channels in the multiplex with lower priority.
    */
  var Priority: js.UndefOr[integerMinNegative5Max5] = js.undefined
}
object MultiplexStatmuxVideoSettings {
  
  inline def apply(): MultiplexStatmuxVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexStatmuxVideoSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiplexStatmuxVideoSettings] (val x: Self) extends AnyVal {
    
    inline def setMaximumBitrate(value: integerMin100000Max100000000): Self = StObject.set(x, "MaximumBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaximumBitrateUndefined: Self = StObject.set(x, "MaximumBitrate", js.undefined)
    
    inline def setMinimumBitrate(value: integerMin100000Max100000000): Self = StObject.set(x, "MinimumBitrate", value.asInstanceOf[js.Any])
    
    inline def setMinimumBitrateUndefined: Self = StObject.set(x, "MinimumBitrate", js.undefined)
    
    inline def setPriority(value: integerMinNegative5Max5): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
  }
}
