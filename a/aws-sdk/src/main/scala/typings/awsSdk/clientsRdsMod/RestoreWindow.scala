package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreWindow extends StObject {
  
  /**
    * The earliest time you can restore an instance to.
    */
  var EarliestTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The latest time you can restore an instance to.
    */
  var LatestTime: js.UndefOr[js.Date] = js.undefined
}
object RestoreWindow {
  
  inline def apply(): RestoreWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreWindow] (val x: Self) extends AnyVal {
    
    inline def setEarliestTime(value: js.Date): Self = StObject.set(x, "EarliestTime", value.asInstanceOf[js.Any])
    
    inline def setEarliestTimeUndefined: Self = StObject.set(x, "EarliestTime", js.undefined)
    
    inline def setLatestTime(value: js.Date): Self = StObject.set(x, "LatestTime", value.asInstanceOf[js.Any])
    
    inline def setLatestTimeUndefined: Self = StObject.set(x, "LatestTime", js.undefined)
  }
}
