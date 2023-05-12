package typings.anySignal

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("any-signal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def anySignal(signals: js.Array[js.UndefOr[AbortSignal | Null]]): ClearableSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("anySignal")(signals.asInstanceOf[js.Any]).asInstanceOf[ClearableSignal]
  
  @js.native
  trait ClearableSignal
    extends StObject
       with AbortSignal {
    
    def clear(): Unit = js.native
  }
}
