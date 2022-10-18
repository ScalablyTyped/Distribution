package typings.agenda

import typings.agenda.anon.Force
import typings.agenda.distAgendaMod.Agenda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaCloseMod {
  
  @JSImport("agenda/dist/agenda/close", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(): js.Promise[Agenda] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Promise[Agenda]]
  inline def close(option: Force): js.Promise[Agenda] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(option.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Agenda]]
}
