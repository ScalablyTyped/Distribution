package typings.agenda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaDrainMod {
  
  @JSImport("agenda/dist/agenda/drain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drain(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("drain")().asInstanceOf[js.Promise[Unit]]
}
