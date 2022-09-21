package typings.angularDevkitBuildWebpack.jobsApiMod

import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scheduler[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] extends StObject {
  
  /**
    * Get a job description for a named job.
    *
    * @param name The name of the job.
    * @returns A description, or null if no description is available for this job.
    */
  def getDescription(name: JobName): Any = js.native
  
  /**
    * Returns true if the job name has been registered.
    * @param name The name of the job.
    * @returns True if the job exists, false otherwise.
    */
  def has(name: JobName): Any = js.native
  
  /**
    * Pause the scheduler, temporary queueing _new_ jobs. Returns a resume function that should be
    * used to resume execution. If multiple `pause()` were called, all their resume functions must
    * be called before the Scheduler actually starts new jobs. Additional calls to the same resume
    * function will have no effect.
    *
    * Jobs already running are NOT paused. This is pausing the scheduler only.
    *
    * @returns A function that can be run to resume the scheduler. If multiple `pause()` calls
    *          were made, all their return function must be called (in any order) before the
    *          scheduler can resume.
    */
  def pause(): js.Function0[Unit] = js.native
  
  /**
    * Schedule a job to be run, using its name.
    * @param name The name of job to be run.
    * @param argument The argument to send to the job when starting it.
    * @param options Scheduling options.
    * @returns The job being run.
    */
  def schedule[A /* <: MinimumArgumentValueT */, I /* <: MinimumInputValueT */, O /* <: MinimumOutputValueT */](name: JobName, argument: A): Job[A, I, O] = js.native
  def schedule[A /* <: MinimumArgumentValueT */, I /* <: MinimumInputValueT */, O /* <: MinimumOutputValueT */](name: JobName, argument: A, options: ScheduleJobOptions): Job[A, I, O] = js.native
}
