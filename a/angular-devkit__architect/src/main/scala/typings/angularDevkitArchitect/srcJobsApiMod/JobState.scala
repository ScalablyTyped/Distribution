package typings.angularDevkitArchitect.srcJobsApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobState extends StObject
@JSImport("@angular-devkit/architect/src/jobs/api", "JobState")
@js.native
object JobState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JobState & String] = js.native
  
  /**
    * The job has ended and is done running.
    */
  @js.native
  sealed trait Ended
    extends StObject
       with JobState
  /* "ended" */ val Ended: typings.angularDevkitArchitect.srcJobsApiMod.JobState.Ended & String = js.native
  
  /**
    * An error occured and the job stopped because of internal state.
    */
  @js.native
  sealed trait Errored
    extends StObject
       with JobState
  /* "errored" */ val Errored: typings.angularDevkitArchitect.srcJobsApiMod.JobState.Errored & String = js.native
  
  /**
    * The job was queued and is waiting to start.
    */
  @js.native
  sealed trait Queued
    extends StObject
       with JobState
  /* "queued" */ val Queued: typings.angularDevkitArchitect.srcJobsApiMod.JobState.Queued & String = js.native
  
  /**
    * The job description was found, its dependencies (see "Synchronizing and Dependencies")
    * are done running, and the job's argument is validated and the job's code will be executed.
    */
  @js.native
  sealed trait Ready
    extends StObject
       with JobState
  /* "ready" */ val Ready: typings.angularDevkitArchitect.srcJobsApiMod.JobState.Ready & String = js.native
  
  /**
    * The job has been started. The job implementation is expected to send this as soon as its
    * work is starting.
    */
  @js.native
  sealed trait Started
    extends StObject
       with JobState
  /* "started" */ val Started: typings.angularDevkitArchitect.srcJobsApiMod.JobState.Started & String = js.native
}
