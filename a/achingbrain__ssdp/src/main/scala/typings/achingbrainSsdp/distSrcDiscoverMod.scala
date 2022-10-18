package typings.achingbrainSsdp

import typings.achingbrainSsdp.mod.SSDP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDiscoverMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/discover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def discover(ssdp: SSDP): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("discover")(ssdp.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def discover(ssdp: SSDP, serviceType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("discover")(ssdp.asInstanceOf[js.Any], serviceType.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
