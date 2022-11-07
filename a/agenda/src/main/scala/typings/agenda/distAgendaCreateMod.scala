package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaCreateMod {
  
  @JSImport("agenda/dist/agenda/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create[T /* <: JobAttributesData */](name: String, data: T): Job[JobAttributesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Job[JobAttributesData]]
}
