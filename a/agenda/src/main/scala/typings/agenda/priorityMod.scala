package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priorityMod {
  
  @JSImport("agenda/dist/job/priority", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def priority(priority: String): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("priority")(priority.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
}
