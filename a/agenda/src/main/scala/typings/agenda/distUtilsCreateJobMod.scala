package typings.agenda

import typings.agenda.distAgendaMod.Agenda
import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributes
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsCreateJobMod {
  
  @JSImport("agenda/dist/utils/create-job", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createJob(agenda: Agenda, jobData: JobAttributes[JobAttributesData]): Job[JobAttributesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJob")(agenda.asInstanceOf[js.Any], jobData.asInstanceOf[js.Any])).asInstanceOf[Job[JobAttributesData]]
}
