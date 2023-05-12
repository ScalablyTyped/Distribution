package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tracks all effects registered within a given application and runs them via `flush`.
  */
@js.native
trait EffectManager extends StObject {
  
  /* private */ var all: Any = js.native
  
  def create(
    effectFn: js.Function1[/* onCleanup */ js.Function1[/* cleanupFn */ EffectCleanupFn, Unit], Unit],
    destroyRef: Null,
    allowSignalWrites: Boolean
  ): EffectRef = js.native
  def create(
    effectFn: js.Function1[/* onCleanup */ js.Function1[/* cleanupFn */ EffectCleanupFn, Unit], Unit],
    destroyRef: DestroyRef,
    allowSignalWrites: Boolean
  ): EffectRef = js.native
  
  def flush(): Unit = js.native
  
  def isQueueEmpty: Boolean = js.native
  
  /* private */ var queue: Any = js.native
}
