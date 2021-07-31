package typings.anySignal

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("any-signal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(signals: js.Array[AbortSignal]): AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(signals.asInstanceOf[js.Any]).asInstanceOf[AbortSignal]
  
  @scala.inline
  def anySignal(signals: js.Array[AbortSignal]): AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("anySignal")(signals.asInstanceOf[js.Any]).asInstanceOf[AbortSignal]
}
