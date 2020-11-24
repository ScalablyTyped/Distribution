package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.sha1AsmMod.sha1result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/hash/sha1/sha1", JSImport.Namespace)
@js.native
object sha1Mod extends js.Object {
  
  @JSName("_sha1_block_size")
  val sha1BlockSize: /* 64 */ Double = js.native
  
  @JSName("_sha1_hash_size")
  val sha1HashSize: /* 20 */ Double = js.native
  
  @js.native
  class Sha1 () extends Hash[sha1result] {
    
    var NAME: String = js.native
  }
  /* static members */
  @js.native
  object Sha1 extends js.Object {
    
    var NAME: String = js.native
  }
}
