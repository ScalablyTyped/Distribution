package typings.agenda

import typings.mongodb.mod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaDisableMod {
  
  @JSImport("agenda/dist/agenda/disable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disable(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[js.Promise[Double]]
  inline def disable(query: Filter[Any]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
}
