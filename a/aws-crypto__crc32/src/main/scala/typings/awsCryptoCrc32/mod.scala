package typings.awsCryptoCrc32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-crypto/crc32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-crypto/crc32", "AwsCrc32")
  @js.native
  open class AwsCrc32 ()
    extends typings.awsCryptoCrc32.awsCrc32Mod.AwsCrc32
  
  @JSImport("@aws-crypto/crc32", "Crc32")
  @js.native
  open class Crc32_ () extends StObject {
    
    /* private */ var checksum: Any = js.native
    
    def digest(): Double = js.native
    
    def update(data: js.typedarray.Uint8Array): this.type = js.native
  }
  
  inline def crc32(data: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
}
