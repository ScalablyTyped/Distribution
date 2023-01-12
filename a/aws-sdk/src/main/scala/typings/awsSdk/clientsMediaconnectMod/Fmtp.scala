package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fmtp extends StObject {
  
  /**
    * The format of the audio channel.
    */
  var ChannelOrder: js.UndefOr[string] = js.undefined
  
  /**
    * The format that is used for the representation of color.
    */
  var Colorimetry: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Colorimetry] = js.undefined
  
  /**
    * The frame rate for the video stream, in frames/second. For example: 60000/1001. If you specify a whole number, MediaConnect uses a ratio of N/1. For example, if you specify 60, MediaConnect uses 60/1 as the exactFramerate.
    */
  var ExactFramerate: js.UndefOr[string] = js.undefined
  
  /**
    * The pixel aspect ratio (PAR) of the video.
    */
  var Par: js.UndefOr[string] = js.undefined
  
  /**
    * The encoding range of the video.
    */
  var Range: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Range] = js.undefined
  
  /**
    * The type of compression that was used to smooth the video’s appearance
    */
  var ScanMode: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.ScanMode] = js.undefined
  
  /**
    * The transfer characteristic system (TCS) that is used in the video.
    */
  var Tcs: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Tcs] = js.undefined
}
object Fmtp {
  
  inline def apply(): Fmtp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fmtp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fmtp] (val x: Self) extends AnyVal {
    
    inline def setChannelOrder(value: string): Self = StObject.set(x, "ChannelOrder", value.asInstanceOf[js.Any])
    
    inline def setChannelOrderUndefined: Self = StObject.set(x, "ChannelOrder", js.undefined)
    
    inline def setColorimetry(value: Colorimetry): Self = StObject.set(x, "Colorimetry", value.asInstanceOf[js.Any])
    
    inline def setColorimetryUndefined: Self = StObject.set(x, "Colorimetry", js.undefined)
    
    inline def setExactFramerate(value: string): Self = StObject.set(x, "ExactFramerate", value.asInstanceOf[js.Any])
    
    inline def setExactFramerateUndefined: Self = StObject.set(x, "ExactFramerate", js.undefined)
    
    inline def setPar(value: string): Self = StObject.set(x, "Par", value.asInstanceOf[js.Any])
    
    inline def setParUndefined: Self = StObject.set(x, "Par", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "Range", js.undefined)
    
    inline def setScanMode(value: ScanMode): Self = StObject.set(x, "ScanMode", value.asInstanceOf[js.Any])
    
    inline def setScanModeUndefined: Self = StObject.set(x, "ScanMode", js.undefined)
    
    inline def setTcs(value: Tcs): Self = StObject.set(x, "Tcs", value.asInstanceOf[js.Any])
    
    inline def setTcsUndefined: Self = StObject.set(x, "Tcs", js.undefined)
  }
}
