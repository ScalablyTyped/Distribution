package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJobScheduleMod {
  
  @JSImport("agenda/dist/job/schedule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def schedule(time: String): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(time.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
  inline def schedule(time: js.Date): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(time.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
}
