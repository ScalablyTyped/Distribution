package typings.achingbrainSsdp

import typings.node.osMod.NetworkInterfaceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAdvertiseFindAllInterfacesMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/advertise/find-all-interfaces", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAllInterfaces(includeIPv4: Boolean, includeIPv6: Boolean): js.Array[NetworkInterfaceInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllInterfaces")(includeIPv4.asInstanceOf[js.Any], includeIPv6.asInstanceOf[js.Any])).asInstanceOf[js.Array[NetworkInterfaceInfo]]
}
