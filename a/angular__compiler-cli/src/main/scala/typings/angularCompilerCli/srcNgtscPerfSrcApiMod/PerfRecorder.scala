package typings.angularCompilerCli.srcNgtscPerfSrcApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfRecorder extends StObject {
  
  /**
    * Record that a specific event has occurred, possibly more than once.
    */
  def eventCount(event: PerfEvent): Unit = js.native
  def eventCount(event: PerfEvent, incrementBy: Double): Unit = js.native
  
  /**
    * Run `fn` in the given `PerfPhase` and return the result.
    *
    * Enters `phase` before executing the given `fn`, then exits the phase and returns the result.
    * Prefer this API to `phase()` where possible.
    */
  def inPhase[T](phase: PerfPhase, fn: js.Function0[T]): T = js.native
  
  /**
    * Record the memory usage of the compiler at the given checkpoint.
    */
  def memory(after: PerfCheckpoint): Unit = js.native
  
  /**
    * Set the current phase of compilation.
    *
    * Time spent in the previous phase will be accounted to that phase. The caller is responsible for
    * exiting the phase when work that should be tracked within it is completed, and either returning
    * to the previous phase or transitioning to the next one directly.
    *
    * In general, prefer using `inPhase()` to instrument a section of code, as it automatically
    * handles entering and exiting the phase. `phase()` should only be used when the former API
    * cannot be cleanly applied to a particular operation.
    *
    * @returns the previous phase
    */
  def phase(phase: PerfPhase): PerfPhase = js.native
  
  /**
    * Return the `PerfRecorder` to an empty state (clear all tracked statistics) and reset the zero
    * point to the current time.
    */
  def reset(): Unit = js.native
}
