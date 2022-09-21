package typings.awsCryptoUtil

import typings.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertToBufferMod {
  
  @JSImport("@aws-crypto/util/build/convertToBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToBuffer(data: SourceData): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
