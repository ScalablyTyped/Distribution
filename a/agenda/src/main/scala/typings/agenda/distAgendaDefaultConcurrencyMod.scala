package typings.agenda

import typings.agenda.distAgendaMod.Agenda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaDefaultConcurrencyMod {
  
  @JSImport("agenda/dist/agenda/default-concurrency", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultConcurrency(concurrency: Double): Agenda = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultConcurrency")(concurrency.asInstanceOf[js.Any]).asInstanceOf[Agenda]
}
