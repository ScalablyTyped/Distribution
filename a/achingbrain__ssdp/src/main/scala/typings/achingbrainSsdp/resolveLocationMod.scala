package typings.achingbrainSsdp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveLocationMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/commands/resolve-location", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveLocation(location: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLocation")(location.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
