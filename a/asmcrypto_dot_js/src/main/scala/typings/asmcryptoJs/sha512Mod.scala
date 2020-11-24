package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.sha512AsmMod.sha512result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/hash/sha512/sha512", JSImport.Namespace)
@js.native
object sha512Mod extends js.Object {
  
  @JSName("_sha512_block_size")
  val sha512BlockSize: /* 128 */ Double = js.native
  
  @JSName("_sha512_hash_size")
  val sha512HashSize: /* 64 */ Double = js.native
  
  @js.native
  class Sha512 () extends Hash[sha512result] {
    
    var NAME: String = js.native
  }
  /* static members */
  @js.native
  object Sha512 extends js.Object {
    
    var NAME: String = js.native
  }
}
