package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scte20SourceSettings extends StObject {
  
  /**
    * If upconvert, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  var Convert608To708: js.UndefOr[Scte20Convert608To708] = js.undefined
  
  /**
    * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
    */
  var Source608ChannelNumber: js.UndefOr[integerMin1Max4] = js.undefined
}
object Scte20SourceSettings {
  
  inline def apply(): Scte20SourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scte20SourceSettings]
  }
  
  extension [Self <: Scte20SourceSettings](x: Self) {
    
    inline def setConvert608To708(value: Scte20Convert608To708): Self = StObject.set(x, "Convert608To708", value.asInstanceOf[js.Any])
    
    inline def setConvert608To708Undefined: Self = StObject.set(x, "Convert608To708", js.undefined)
    
    inline def setSource608ChannelNumber(value: integerMin1Max4): Self = StObject.set(x, "Source608ChannelNumber", value.asInstanceOf[js.Any])
    
    inline def setSource608ChannelNumberUndefined: Self = StObject.set(x, "Source608ChannelNumber", js.undefined)
  }
}
