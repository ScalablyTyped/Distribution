package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/core", "EnvironmentInjector")
@js.native
open class EnvironmentInjector () extends Injector {
  
  def destroy(): Unit = js.native
  
  /**
    * Runs the given function in the context of this `EnvironmentInjector`.
    *
    * Within the function's stack frame, `inject` can be used to inject dependencies from this
    * injector. Note that `inject` is only usable synchronously, and cannot be used in any
    * asynchronous callbacks or after any `await` points.
    *
    * @param fn the closure to be run in the context of this injector
    * @returns the return value of the function, if any
    * @deprecated use the standalone function `runInInjectionContext` instead
    */
  def runInContext[ReturnT](fn: js.Function0[ReturnT]): ReturnT = js.native
}
