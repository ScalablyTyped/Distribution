package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.sha1AsmMod.sha1result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha1Mod {
  
  @JSImport("asmcrypto.js/dist_es8/hash/sha1/sha1", "Sha1")
  @js.native
  class Sha1 () extends Hash[sha1result] {
    
    var NAME: String = js.native
  }
  /* static members */
  object Sha1 {
    
    @JSImport("asmcrypto.js/dist_es8/hash/sha1/sha1", "Sha1")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js/dist_es8/hash/sha1/sha1", "Sha1.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("asmcrypto.js/dist_es8/hash/sha1/sha1", "_sha1_block_size")
  @js.native
  val sha1BlockSize: /* 64 */ Double = js.native
  
  @JSImport("asmcrypto.js/dist_es8/hash/sha1/sha1", "_sha1_hash_size")
  @js.native
  val sha1HashSize: /* 20 */ Double = js.native
}
