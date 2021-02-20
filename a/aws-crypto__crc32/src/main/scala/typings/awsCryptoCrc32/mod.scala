package typings.awsCryptoCrc32

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-crypto/crc32", "Crc32")
  @js.native
  class Crc32_ () extends StObject {
    
    var checksum: js.Any = js.native
    
    def digest(): Double = js.native
    
    def update(data: Uint8Array): this.type = js.native
  }
  
  @JSImport("@aws-crypto/crc32", "crc32")
  @js.native
  def crc32(data: Uint8Array): Double = js.native
}
