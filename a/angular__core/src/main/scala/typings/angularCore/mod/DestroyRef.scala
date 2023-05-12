package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/core", "DestroyRef")
@js.native
open class DestroyRef () extends StObject {
  
  /**
    * Registers a destroy callback in a given lifecycle scope.  Returns a cleanup function that can
    * be invoked to unregister the callback.
    *
    * @usageNotes
    * ### Example
    * ```typescript
    * const destroyRef = inject(DestroyRef);
    *
    * // register a destroy callback
    * const unregisterFn = destroyRef.onDestroy(() => doSomethingOnDestroy());
    *
    * // stop the destroy callback from executing if needed
    * unregisterFn();
    * ```
    */
  def onDestroy(callback: js.Function0[Unit]): js.Function0[Unit] = js.native
}
