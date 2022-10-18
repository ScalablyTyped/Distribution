package typings.agenda

import typings.agenda.distJobRepeatEveryMod.JobOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaEveryMod {
  
  @JSImport("agenda/dist/agenda/every", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def every(interval: String, names: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def every(interval: String, names: String, data: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def every(interval: String, names: String, data: Any, options: JobOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def every(interval: String, names: String, data: Unit, options: JobOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def every(interval: String, names: js.Array[String]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def every(interval: String, names: js.Array[String], data: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def every(interval: String, names: js.Array[String], data: Any, options: JobOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def every(interval: String, names: js.Array[String], data: Unit, options: JobOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], names.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
