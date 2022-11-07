package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaScheduleMod {
  
  @JSImport("agenda/dist/agenda/schedule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def schedule[T /* <: JobAttributesData */](when: String, names: String, data: T): js.Promise[Job[JobAttributesData]] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(when.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Job[JobAttributesData]]]
  inline def schedule[T /* <: JobAttributesData */](when: String, names: js.Array[String], data: T): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(when.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def schedule[T /* <: JobAttributesData */](when: js.Date, names: String, data: T): js.Promise[Job[JobAttributesData]] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(when.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Job[JobAttributesData]]]
  inline def schedule[T /* <: JobAttributesData */](when: js.Date, names: js.Array[String], data: T): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(when.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
}
