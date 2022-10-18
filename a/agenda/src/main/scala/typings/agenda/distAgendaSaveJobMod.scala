package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaSaveJobMod {
  
  @JSImport("agenda/dist/agenda/save-job", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def saveJob(job: Job[JobAttributesData]): js.Promise[Job[JobAttributesData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveJob")(job.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Job[JobAttributesData]]]
}
