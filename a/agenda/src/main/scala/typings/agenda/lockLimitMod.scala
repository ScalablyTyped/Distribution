package typings.agenda

import typings.agenda.agendaMod.Agenda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockLimitMod {
  
  @JSImport("agenda/dist/agenda/lock-limit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lockLimit(limit: Double): Agenda = ^.asInstanceOf[js.Dynamic].applyDynamic("lockLimit")(limit.asInstanceOf[js.Any]).asInstanceOf[Agenda]
}
