package typings.agenda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stopMod {
  
  @JSImport("agenda/dist/agenda/stop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stop(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[js.Promise[Unit]]
}
