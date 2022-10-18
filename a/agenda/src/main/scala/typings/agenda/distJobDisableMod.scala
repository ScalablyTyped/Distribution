package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJobDisableMod {
  
  @JSImport("agenda/dist/job/disable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disable(): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Job[JobAttributesData]]
}
