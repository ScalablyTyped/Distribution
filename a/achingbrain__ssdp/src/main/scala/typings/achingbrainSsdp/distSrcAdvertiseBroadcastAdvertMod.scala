package typings.achingbrainSsdp

import typings.achingbrainSsdp.distSrcAdvertiseMod.Advert
import typings.achingbrainSsdp.mod.SSDP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAdvertiseBroadcastAdvertMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/advertise/broadcast-advert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def broadcastAdvert(ssdp: SSDP, advert: Advert, notifcationSubType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastAdvert")(ssdp.asInstanceOf[js.Any], advert.asInstanceOf[js.Any], notifcationSubType.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
