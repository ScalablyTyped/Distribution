package typings.agenda

import typings.agenda.agendaMod.Agenda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processEveryMod {
  
  @JSImport("agenda/dist/agenda/process-every", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processEvery(time: String): Agenda = ^.asInstanceOf[js.Dynamic].applyDynamic("processEvery")(time.asInstanceOf[js.Any]).asInstanceOf[Agenda]
}
