package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMod {
  
  @JSImport("agenda/dist/agenda/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(name: String, data: Any): Job[JobAttributesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Job[JobAttributesData]]
}
