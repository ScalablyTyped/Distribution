package typings.achingbrainSsdp

import typings.achingbrainSsdp.mod.SSDP
import typings.achingbrainSsdp.mod.SSDPSocket
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSocketsMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/create-sockets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSockets(ssdp: SSDP, signal: AbortSignal): js.Promise[js.Array[SSDPSocket]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSockets")(ssdp.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SSDPSocket]]]
}
