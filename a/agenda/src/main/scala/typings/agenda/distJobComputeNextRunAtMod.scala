package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJobComputeNextRunAtMod {
  
  @JSImport("agenda/dist/job/compute-next-run-at", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeNextRunAt(): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNextRunAt")().asInstanceOf[Job[JobAttributesData]]
}
