package typings.awsCryptoSha256Universal

import typings.awsSdkTypes.distTypesCryptoMod.Hash
import typings.awsSdkTypes.distTypesCryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-crypto/sha256-universal", "Sha256")
  @js.native
  open class Sha256 ()
    extends StObject
       with Hash {
    def this(secret: SourceData) = this()
    
    /* private */ val hash: Any = js.native
  }
}
