package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchMod {
  
  @JSImport("agenda/dist/job/touch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def touch(): js.Promise[Job[JobAttributesData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("touch")().asInstanceOf[js.Promise[Job[JobAttributesData]]]
}
