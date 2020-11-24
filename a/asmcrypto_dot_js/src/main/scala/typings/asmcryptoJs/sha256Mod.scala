package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.sha256AsmMod.sha256result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/hash/sha256/sha256", JSImport.Namespace)
@js.native
object sha256Mod extends js.Object {
  
  @JSName("_sha256_block_size")
  val sha256BlockSize: /* 64 */ Double = js.native
  
  @JSName("_sha256_hash_size")
  val sha256HashSize: /* 32 */ Double = js.native
  
  @js.native
  class Sha256 () extends Hash[sha256result] {
    
    var NAME: String = js.native
  }
  /* static members */
  @js.native
  object Sha256 extends js.Object {
    
    var NAME: String = js.native
  }
}
