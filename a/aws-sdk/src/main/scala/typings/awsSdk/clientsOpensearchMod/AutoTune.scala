package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTune extends StObject {
  
  /**
    * Details about an Auto-Tune action.
    */
  var AutoTuneDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AutoTuneDetails] = js.undefined
  
  /**
    * The type of Auto-Tune action.
    */
  var AutoTuneType: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AutoTuneType] = js.undefined
}
object AutoTune {
  
  inline def apply(): AutoTune = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTune]
  }
  
  extension [Self <: AutoTune](x: Self) {
    
    inline def setAutoTuneDetails(value: AutoTuneDetails): Self = StObject.set(x, "AutoTuneDetails", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneDetailsUndefined: Self = StObject.set(x, "AutoTuneDetails", js.undefined)
    
    inline def setAutoTuneType(value: AutoTuneType): Self = StObject.set(x, "AutoTuneType", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneTypeUndefined: Self = StObject.set(x, "AutoTuneType", js.undefined)
  }
}
