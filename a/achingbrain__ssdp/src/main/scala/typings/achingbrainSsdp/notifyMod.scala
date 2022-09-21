package typings.achingbrainSsdp

import typings.achingbrainSsdp.mod.NotfiyMessage
import typings.achingbrainSsdp.mod.SSDP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notifyMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/commands/notify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@achingbrain/ssdp/dist/src/commands/notify", "ALIVE")
  @js.native
  val ALIVE: /* "ssdp:alive" */ String = js.native
  
  @JSImport("@achingbrain/ssdp/dist/src/commands/notify", "BYEBYE")
  @js.native
  val BYEBYE: /* "ssdp:byebye" */ String = js.native
  
  inline def notify_(ssdp: SSDP, message: NotfiyMessage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(ssdp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
