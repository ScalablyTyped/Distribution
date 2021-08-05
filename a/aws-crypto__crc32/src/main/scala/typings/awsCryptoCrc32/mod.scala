package typings.awsCryptoCrc32

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-crypto/crc32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-crypto/crc32", "Crc32")
  @js.native
  class Crc32_ () extends StObject {
    
    /* private */ var checksum: js.Any = js.native
    
    def digest(): Double = js.native
    
    def update(data: Uint8Array): this.type = js.native
  }
  
  inline def crc32(data: Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
}
