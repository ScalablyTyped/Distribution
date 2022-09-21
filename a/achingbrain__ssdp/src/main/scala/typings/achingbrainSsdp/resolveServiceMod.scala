package typings.achingbrainSsdp

import typings.achingbrainSsdp.mod.SSDP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveServiceMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/commands/resolve-service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveService(ssdp: SSDP, usn: String, st: String, location: String, ttl: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveService")(ssdp.asInstanceOf[js.Any], usn.asInstanceOf[js.Any], st.asInstanceOf[js.Any], location.asInstanceOf[js.Any], ttl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
