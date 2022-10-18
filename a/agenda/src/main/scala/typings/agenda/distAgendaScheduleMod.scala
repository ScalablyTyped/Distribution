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
  
  inline def schedule(when: String, names: String, data: Any): js.Promise[Job[JobAttributesData]] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(when.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Job[JobAttributesData]]]
  inline def schedule(when: String, names: js.Array[String], data: Any): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(when.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def schedule(when: js.Date, names: String, data: Any): js.Promise[Job[JobAttributesData]] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(when.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Job[JobAttributesData]]]
  inline def schedule(when: js.Date, names: js.Array[String], data: Any): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(when.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
}
