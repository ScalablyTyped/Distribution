package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncrementalRefresh extends StObject {
  
  /**
    * The lookback window setup for an incremental refresh configuration.
    */
  var LookbackWindow: typings.awsSdk.clientsQuicksightMod.LookbackWindow
}
object IncrementalRefresh {
  
  inline def apply(LookbackWindow: LookbackWindow): IncrementalRefresh = {
    val __obj = js.Dynamic.literal(LookbackWindow = LookbackWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementalRefresh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncrementalRefresh] (val x: Self) extends AnyVal {
    
    inline def setLookbackWindow(value: LookbackWindow): Self = StObject.set(x, "LookbackWindow", value.asInstanceOf[js.Any])
  }
}
