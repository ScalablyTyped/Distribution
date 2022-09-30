package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import typings.mongodb.mod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsMod {
  
  @JSImport("agenda/dist/agenda/jobs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jobs(): js.Promise[js.Array[Job[JobAttributesData]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("jobs")().asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Unit, sort: js.Object): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Unit, sort: js.Object, limit: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Unit, sort: js.Object, limit: Double, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Unit, sort: js.Object, limit: Unit, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Unit, sort: Unit, limit: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Unit, sort: Unit, limit: Double, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Unit, sort: Unit, limit: Unit, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Filter[Any]): js.Promise[js.Array[Job[JobAttributesData]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Filter[Any], sort: js.Object): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Filter[Any], sort: js.Object, limit: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Filter[Any], sort: js.Object, limit: Double, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Filter[Any], sort: js.Object, limit: Unit, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Filter[Any], sort: Unit, limit: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Filter[Any], sort: Unit, limit: Double, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
  inline def jobs(query: Filter[Any], sort: Unit, limit: Unit, skip: Double): js.Promise[js.Array[Job[JobAttributesData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(query.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Job[JobAttributesData]]]]
}
