package typings.awsCryptoSha256Browser

import typings.awsSdkTypes.distTypesChecksumMod.Checksum
import typings.awsSdkTypes.distTypesCryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIe11Sha256Mod {
  
  @JSImport("@aws-crypto/sha256-browser/build/ie11Sha256", "Sha256")
  @js.native
  open class Sha256 ()
    extends StObject
       with Checksum {
    def this(secret: SourceData) = this()
    
    /**
      * Returns the digest of all of the data passed.
      */
    /* CompleteClass */
    override def digest(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /* private */ var operation: Any = js.native
    
    /**
      * Resets the checksum to its initial value.
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* private */ val secret: Any = js.native
    
    /**
      * Adds a chunk of data for which checksum needs to be computed.
      * This can be called many times with new data as it is streamed.
      *
      * Implementations may override this method which passes second param
      * which makes Checksum object stateless.
      *
      * @param chunk - The buffer to update checksum with.
      */
    /* CompleteClass */
    override def update(chunk: js.typedarray.Uint8Array): Unit = js.native
    def update(toHash: SourceData): Unit = js.native
  }
}
