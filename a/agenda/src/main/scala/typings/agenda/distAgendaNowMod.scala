package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaNowMod {
  
  @JSImport("agenda/dist/agenda/now", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def now(name: String, data: Any): js.Promise[Job[JobAttributesData]] = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Job[JobAttributesData]]]
}
