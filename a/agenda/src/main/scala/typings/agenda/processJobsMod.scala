package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processJobsMod {
  
  @JSImport("agenda/dist/utils/process-jobs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processJobs(extraJob: Job[JobAttributesData]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("processJobs")(extraJob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
