package typings.achingbrainSsdp

import typings.achingbrainSsdp.mod.SSDP
import typings.achingbrainSsdp.mod.SearchMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchResponseMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/discover/search-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def searchResponse(ssdp: SSDP, message: SearchMessage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("searchResponse")(ssdp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
