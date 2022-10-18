package typings.awsCryptoUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNumToUint8Mod {
  
  @JSImport("@aws-crypto/util/build/numToUint8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def numToUint8(num: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("numToUint8")(num.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
