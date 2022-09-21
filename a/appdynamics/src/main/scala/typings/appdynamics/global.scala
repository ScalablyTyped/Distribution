package typings.appdynamics

import typings.appdynamics.mod.ProfileParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object appdynamics {
    
    @JSGlobal("appdynamics")
    @js.native
    val ^ : js.Any = js.native
    
    inline def profile(config: ProfileParameter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
