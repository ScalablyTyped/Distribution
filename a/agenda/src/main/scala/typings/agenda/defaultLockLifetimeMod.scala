package typings.agenda

import typings.agenda.agendaMod.Agenda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultLockLifetimeMod {
  
  @JSImport("agenda/dist/agenda/default-lock-lifetime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultLockLifetime(ms: Double): Agenda = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLockLifetime")(ms.asInstanceOf[js.Any]).asInstanceOf[Agenda]
}
