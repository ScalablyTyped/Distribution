package typings.achingbrainNatPortMapper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@achingbrain/nat-port-mapper/dist/src/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pmpNat(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pmpNat")().asInstanceOf[js.Promise[Unit]]
  
  inline def upnpNat(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("upnpNat")().asInstanceOf[js.Promise[Unit]]
}
