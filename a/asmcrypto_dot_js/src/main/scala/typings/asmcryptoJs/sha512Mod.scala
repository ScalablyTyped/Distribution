package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.sha512AsmMod.sha512result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha512Mod {
  
  @JSImport("asmcrypto.js/dist_es8/hash/sha512/sha512", "Sha512")
  @js.native
  class Sha512 () extends Hash[sha512result] {
    
    var NAME: String = js.native
  }
  /* static members */
  object Sha512 {
    
    @JSImport("asmcrypto.js/dist_es8/hash/sha512/sha512", "Sha512")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js/dist_es8/hash/sha512/sha512", "Sha512.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("asmcrypto.js/dist_es8/hash/sha512/sha512", "_sha512_block_size")
  @js.native
  val sha512BlockSize: /* 128 */ Double = js.native
  
  @JSImport("asmcrypto.js/dist_es8/hash/sha512/sha512", "_sha512_hash_size")
  @js.native
  val sha512HashSize: /* 64 */ Double = js.native
}
