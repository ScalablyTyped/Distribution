package typings.agenda

import typings.agenda.distAgendaMod.Agenda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaMaxConcurrencyMod {
  
  @JSImport("agenda/dist/agenda/max-concurrency", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxConcurrency(concurrency: Double): Agenda = ^.asInstanceOf[js.Dynamic].applyDynamic("maxConcurrency")(concurrency.asInstanceOf[js.Any]).asInstanceOf[Agenda]
}
