package typings.achingbrainSsdp

import typings.achingbrainSsdp.distSrcAdvertiseMod.Advert
import typings.achingbrainSsdp.mod.SSDP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAdvertiseCreateLocationMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/advertise/create-location", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLocation(ssdp: SSDP, advert: Advert): js.Promise[js.Function0[js.Promise[Unit]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(ssdp.asInstanceOf[js.Any], advert.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Function0[js.Promise[Unit]]]]
}
