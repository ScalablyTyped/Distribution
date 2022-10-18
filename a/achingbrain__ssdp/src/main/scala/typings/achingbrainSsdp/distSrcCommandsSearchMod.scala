package typings.achingbrainSsdp

import typings.achingbrainSsdp.mod.NetworkAddress
import typings.achingbrainSsdp.mod.SSDP
import typings.achingbrainSsdp.mod.SearchMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsSearchMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/commands/search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def search(ssdp: SSDP, message: SearchMessage, remote: NetworkAddress): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(ssdp.asInstanceOf[js.Any], message.asInstanceOf[js.Any], remote.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
