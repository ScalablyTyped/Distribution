package typings.awsCryptoSha256Js

import typings.awsSdkTypes.cryptoMod.Hash
import typings.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSha256Mod {
  
  @JSImport("@aws-crypto/sha256-js/build/jsSha256", "Sha256")
  @js.native
  open class Sha256 ()
    extends StObject
       with Hash {
    def this(secret: SourceData) = this()
    
    def digestSync(): js.typedarray.Uint8Array = js.native
    
    /* private */ var error: Any = js.native
    
    /* private */ val hash: Any = js.native
    
    /* private */ val outer: Any = js.native
  }
}
