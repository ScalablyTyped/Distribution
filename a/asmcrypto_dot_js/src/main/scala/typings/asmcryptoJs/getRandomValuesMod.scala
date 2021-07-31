package typings.asmcryptoJs

import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRandomValuesMod {
  
  @JSImport("asmcrypto.js/dist_es8/other/get-random-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRandomValues(buf: Uint32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def getRandomValues(buf: Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
