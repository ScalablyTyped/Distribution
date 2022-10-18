package typings.awsCryptoSha256Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRawSha256Mod {
  
  @JSImport("@aws-crypto/sha256-js/build/RawSha256", "RawSha256")
  @js.native
  open class RawSha256 () extends StObject {
    
    /* private */ var buffer: Any = js.native
    
    /* private */ var bufferLength: Any = js.native
    
    /* private */ var bytesHashed: Any = js.native
    
    def digest(): js.typedarray.Uint8Array = js.native
    
    /**
      * @internal
      */
    var finished: Boolean = js.native
    
    /* private */ var hashBuffer: Any = js.native
    
    /* private */ var state: Any = js.native
    
    /* private */ var temp: Any = js.native
    
    def update(data: js.typedarray.Uint8Array): Unit = js.native
  }
}
