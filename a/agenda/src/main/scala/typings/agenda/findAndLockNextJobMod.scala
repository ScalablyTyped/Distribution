package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findAndLockNextJobMod {
  
  @JSImport("agenda/dist/agenda/find-and-lock-next-job", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAndLockNextJob(jobName: String, definition: Any): js.Promise[js.UndefOr[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLockNextJob")(jobName.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Job[JobAttributesData]]]]
}
