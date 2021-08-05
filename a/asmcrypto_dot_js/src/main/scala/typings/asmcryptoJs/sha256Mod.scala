package typings.asmcryptoJs

import typings.asmcryptoJs.hashMod.Hash
import typings.asmcryptoJs.sha256AsmMod.sha256result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha256Mod {
  
  @JSImport("asmcrypto.js/dist_es8/hash/sha256/sha256", "Sha256")
  @js.native
  class Sha256 () extends Hash[sha256result] {
    
    var NAME: String = js.native
  }
  /* static members */
  object Sha256 {
    
    @JSImport("asmcrypto.js/dist_es8/hash/sha256/sha256", "Sha256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js/dist_es8/hash/sha256/sha256", "Sha256.NAME")
    @js.native
    def NAME: String = js.native
    inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("asmcrypto.js/dist_es8/hash/sha256/sha256", "_sha256_block_size")
  @js.native
  val sha256BlockSize: /* 64 */ Double = js.native
  
  @JSImport("asmcrypto.js/dist_es8/hash/sha256/sha256", "_sha256_hash_size")
  @js.native
  val sha256HashSize: /* 32 */ Double = js.native
}
