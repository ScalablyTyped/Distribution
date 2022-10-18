package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJobPriorityMod {
  
  @JSImport("agenda/dist/job/priority", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def priority(priority: String): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("priority")(priority.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
}
