package typings.assemblyscriptLoader

import typings.std.WebAssembly.Memory
import typings.std.WebAssembly.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    var abort: js.UndefOr[
        js.Function4[/* msg */ Double, /* file */ Double, /* line */ Double, /* column */ Double, Unit]
      ] = js.undefined
    
    var memory: js.UndefOr[Memory] = js.undefined
    
    var table: js.UndefOr[Table] = js.undefined
    
    var trace: js.UndefOr[
        js.Function3[/* msg */ Double, /* numArgs */ js.UndefOr[Double], /* repeated */ Double, Unit]
      ] = js.undefined
  }
  object Abort {
    
    inline def apply(): Abort = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Abort]
    }
    
    extension [Self <: Abort](x: Self) {
      
      inline def setAbort(value: (/* msg */ Double, /* file */ Double, /* line */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction4(value))
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      inline def setMemory(value: Memory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setTrace(value: (/* msg */ Double, /* numArgs */ js.UndefOr[Double], /* repeated */ Double) => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction3(value))
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
}
