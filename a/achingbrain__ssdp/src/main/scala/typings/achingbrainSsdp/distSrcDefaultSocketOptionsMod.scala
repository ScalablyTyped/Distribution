package typings.achingbrainSsdp

import typings.achingbrainSsdp.anon.PartialSSDPSocketOptions
import typings.achingbrainSsdp.mod.SSDPSocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDefaultSocketOptionsMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/default-socket-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultSocketOptions(): SSDPSocketOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSocketOptions")().asInstanceOf[SSDPSocketOptions]
  inline def defaultSocketOptions(options: PartialSSDPSocketOptions): SSDPSocketOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSocketOptions")(options.asInstanceOf[js.Any]).asInstanceOf[SSDPSocketOptions]
}
