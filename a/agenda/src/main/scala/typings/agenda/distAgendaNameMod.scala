package typings.agenda

import typings.agenda.distAgendaMod.Agenda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaNameMod {
  
  @JSImport("agenda/dist/agenda/name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def name(name: String): Agenda = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(name.asInstanceOf[js.Any]).asInstanceOf[Agenda]
}
