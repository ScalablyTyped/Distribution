package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTuneDetails extends StObject {
  
  /**
    * Container for details about a scheduled Auto-Tune action.
    */
  var ScheduledAutoTuneDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ScheduledAutoTuneDetails] = js.undefined
}
object AutoTuneDetails {
  
  inline def apply(): AutoTuneDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTuneDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoTuneDetails] (val x: Self) extends AnyVal {
    
    inline def setScheduledAutoTuneDetails(value: ScheduledAutoTuneDetails): Self = StObject.set(x, "ScheduledAutoTuneDetails", value.asInstanceOf[js.Any])
    
    inline def setScheduledAutoTuneDetailsUndefined: Self = StObject.set(x, "ScheduledAutoTuneDetails", js.undefined)
  }
}
