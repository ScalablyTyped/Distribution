package typings.achingbrainSsdp

import typings.achingbrainSsdp.mod.NetworkAddress
import typings.achingbrainSsdp.mod.SSDP
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendSsdpMessageMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/send-ssdp-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendSsdpMessage(ssdp: SSDP, status: String, headers: Record[String, String], remote: NetworkAddress): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSsdpMessage")(ssdp.asInstanceOf[js.Any], status.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], remote.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
