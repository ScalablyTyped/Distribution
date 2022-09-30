package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeNextRunAtMod {
  
  @JSImport("agenda/dist/job/compute-next-run-at", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeNextRunAt(): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNextRunAt")().asInstanceOf[Job[JobAttributesData]]
}
