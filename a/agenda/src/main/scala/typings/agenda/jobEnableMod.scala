package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobEnableMod {
  
  @JSImport("agenda/dist/job/enable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Job[JobAttributesData]]
}
