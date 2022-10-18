package typings.achingbrainSsdp

import typings.achingbrainSsdp.anon.PartialSSDPOptions
import typings.achingbrainSsdp.mod.SSDPOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDefaultSsdpOptionsMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/default-ssdp-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultSsdpOptions(): SSDPOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSsdpOptions")().asInstanceOf[SSDPOptions]
  inline def defaultSsdpOptions(options: PartialSSDPOptions): SSDPOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSsdpOptions")(options.asInstanceOf[js.Any]).asInstanceOf[SSDPOptions]
}
