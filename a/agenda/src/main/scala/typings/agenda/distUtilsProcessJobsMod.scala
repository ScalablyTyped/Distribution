package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsProcessJobsMod {
  
  @JSImport("agenda/dist/utils/process-jobs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processJobs(extraJob: Job[JobAttributesData]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("processJobs")(extraJob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
