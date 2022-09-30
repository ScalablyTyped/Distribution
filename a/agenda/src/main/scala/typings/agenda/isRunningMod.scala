package typings.agenda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isRunningMod {
  
  @JSImport("agenda/dist/job/is-running", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRunning(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRunning")().asInstanceOf[Boolean]
}
