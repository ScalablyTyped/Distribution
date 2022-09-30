package typings.agenda

import typings.agenda.agendaMod.Agenda
import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributes
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createJobMod {
  
  @JSImport("agenda/dist/utils/create-job", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createJob(agenda: Agenda, jobData: JobAttributes[JobAttributesData]): Job[JobAttributesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJob")(agenda.asInstanceOf[js.Any], jobData.asInstanceOf[js.Any])).asInstanceOf[Job[JobAttributesData]]
}
