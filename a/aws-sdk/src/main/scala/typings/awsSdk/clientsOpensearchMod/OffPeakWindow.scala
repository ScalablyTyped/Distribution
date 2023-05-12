package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffPeakWindow extends StObject {
  
  /**
    * A custom start time for the off-peak window, in Coordinated Universal Time (UTC). The window length will always be 10 hours, so you can't specify an end time. For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically be set to 9:00 A.M.
    */
  var WindowStartTime: js.UndefOr[typings.awsSdk.clientsOpensearchMod.WindowStartTime] = js.undefined
}
object OffPeakWindow {
  
  inline def apply(): OffPeakWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffPeakWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffPeakWindow] (val x: Self) extends AnyVal {
    
    inline def setWindowStartTime(value: WindowStartTime): Self = StObject.set(x, "WindowStartTime", value.asInstanceOf[js.Any])
    
    inline def setWindowStartTimeUndefined: Self = StObject.set(x, "WindowStartTime", js.undefined)
  }
}
