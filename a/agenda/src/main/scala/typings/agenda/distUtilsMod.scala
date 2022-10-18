package typings.agenda

import typings.agenda.distAgendaMod.Agenda
import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributes
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("agenda/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createJob(agenda: Agenda, jobData: JobAttributes[JobAttributesData]): Job[JobAttributesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJob")(agenda.asInstanceOf[js.Any], jobData.asInstanceOf[js.Any])).asInstanceOf[Job[JobAttributesData]]
  
  inline def parsePriority(priority: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePriority")(priority.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parsePriority(priority: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePriority")(priority.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def processJobs(extraJob: Job[JobAttributesData]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("processJobs")(extraJob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
