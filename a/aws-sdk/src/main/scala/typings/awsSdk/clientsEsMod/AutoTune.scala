package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTune extends StObject {
  
  /**
    * Specifies details of the Auto-Tune action. See the Developer Guide for more information. 
    */
  var AutoTuneDetails: js.UndefOr[typings.awsSdk.clientsEsMod.AutoTuneDetails] = js.undefined
  
  /**
    * Specifies Auto-Tune type. Valid value is SCHEDULED_ACTION. 
    */
  var AutoTuneType: js.UndefOr[typings.awsSdk.clientsEsMod.AutoTuneType] = js.undefined
}
object AutoTune {
  
  inline def apply(): AutoTune = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTune]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoTune] (val x: Self) extends AnyVal {
    
    inline def setAutoTuneDetails(value: AutoTuneDetails): Self = StObject.set(x, "AutoTuneDetails", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneDetailsUndefined: Self = StObject.set(x, "AutoTuneDetails", js.undefined)
    
    inline def setAutoTuneType(value: AutoTuneType): Self = StObject.set(x, "AutoTuneType", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneTypeUndefined: Self = StObject.set(x, "AutoTuneType", js.undefined)
  }
}
