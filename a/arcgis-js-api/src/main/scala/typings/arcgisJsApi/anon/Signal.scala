package typings.arcgisJsApi.anon

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signal extends StObject {
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object Signal {
  
  inline def apply(): Signal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Signal]
  }
  
  extension [Self <: Signal](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
