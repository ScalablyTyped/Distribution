package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackSourceSettings extends StObject {
  
  /**
    * Use this setting to select a single captions track from a source. Track numbers correspond to the order in the captions source file. For IMF sources, track numbering is based on the order that the captions appear in the CPL. For example, use 1 to select the captions asset that is listed first in the CPL. To include more than one captions track in your job outputs, create multiple input captions selectors. Specify one track per selector.
    */
  var TrackNumber: js.UndefOr[integerMin1Max2147483647] = js.undefined
}
object TrackSourceSettings {
  
  inline def apply(): TrackSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackSourceSettings]
  }
  
  extension [Self <: TrackSourceSettings](x: Self) {
    
    inline def setTrackNumber(value: integerMin1Max2147483647): Self = StObject.set(x, "TrackNumber", value.asInstanceOf[js.Any])
    
    inline def setTrackNumberUndefined: Self = StObject.set(x, "TrackNumber", js.undefined)
  }
}
