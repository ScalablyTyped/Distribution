package typings.achingbrainSsdp

import typings.achingbrainSsdp.mod.NetworkAddress
import typings.achingbrainSsdp.mod.SSDP
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcParseSsdpMessageMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/parse-ssdp-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseSsdpMessage(ssdp: SSDP, buffer: Buffer, remote: NetworkAddress): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSsdpMessage")(ssdp.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], remote.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
