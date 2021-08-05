package typings.awsCryptoSha256Js

import typings.awsSdkTypes.cryptoMod.Hash
import typings.awsSdkTypes.cryptoMod.SourceData
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSha256Mod {
  
  @JSImport("@aws-crypto/sha256-js/build/jsSha256", "Sha256")
  @js.native
  class Sha256 ()
    extends StObject
       with Hash {
    def this(secret: SourceData) = this()
    
    def digestSync(): Uint8Array = js.native
    
    /* private */ var error: js.Any = js.native
    
    /* private */ val hash: js.Any = js.native
    
    /* private */ val outer: js.Any = js.native
  }
}
