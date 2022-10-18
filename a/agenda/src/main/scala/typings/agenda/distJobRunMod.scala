package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJobRunMod {
  
  @JSImport("agenda/dist/job/run", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def run(): js.Promise[Job[JobAttributesData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[js.Promise[Job[JobAttributesData]]]
}
