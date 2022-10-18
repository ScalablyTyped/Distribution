package typings.agenda

import typings.agenda.distAgendaMod.Agenda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaSortMod {
  
  @JSImport("agenda/dist/agenda/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sort(query: Any): Agenda = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(query.asInstanceOf[js.Any]).asInstanceOf[Agenda]
}
