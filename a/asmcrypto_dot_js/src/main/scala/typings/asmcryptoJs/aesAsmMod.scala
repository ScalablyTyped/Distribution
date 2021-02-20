package typings.asmcryptoJs

import typings.asmcryptoJs.anon.CBC
import typings.asmcryptoJs.anon.Dictkey
import typings.asmcryptoJs.anon.GCM
import typings.asmcryptoJs.asmcryptoJsNumbers.`16`
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aesAsmMod {
  
  @JSImport("asmcrypto.js/dist_es8/aes/aes.asm", "AES_asm")
  @js.native
  class AESAsm protected () extends StObject {
    def this(foreign: js.Any, heap: ArrayBuffer) = this()
    
    /**
      * Perform ciphering operation on the supplied data
      *
      * @param mode - block cipher mode (see {@link AES_asm} mode constants)
      * @param pos - offset of the data being processed
      * @param len - length of the data being processed
      * @return Actual amount of data have been processed
      */
    def cipher(mode: Double, pos: Double, len: Double): Double = js.native
    
    /**
      * GCM initialization
      */
    def gcm_init(): Unit = js.native
    
    /**
      * Store the internal iv vector into the heap
      *
      * @returns The number of bytes have been written into the heap, always 16
      */
    def get_iv(pos: Double): `16` = js.native
    
    /**
      * Store the internal state vector into the heap.
      *
      * @param pos - offset where to put the data
      * @return The number of bytes have been written into the heap, always 16.
      */
    def get_state(pos: Double): `16` = js.native
    
    /**
      * Calculates MAC of the supplied data
      *
      * @param mode - block cipher mode (see {@link AES_asm} mode constants)
      * @param pos - offset of the data being processed
      * @param len - length of the data being processed
      * @return Actual amount of data have been processed
      */
    def mac(mode: Double, pos: Double, len: Double): Double = js.native
    
    /**
      * Set counter for CTR-family modes
      */
    def set_counter(c0: Double, c1: Double, c2: Double, c3: Double): Unit = js.native
    
    /**
      * Populate the internal iv of the module
      */
    def set_iv(i0: Double, i1: Double, i2: Double, i3: Double): Unit = js.native
    
    /**
      * @param ks - key size, 4/6/8 (for 128/192/256-bit key correspondingly)
      * @param k0 - key vector components
      * @param k1 - key vector components
      * @param k2 - key vector components
      * @param k3 - key vector components
      * @param k4 - key vector components
      * @param k5 - key vector components
      * @param k6 - key vector components
      * @param k7 - key vector components
      */
    def set_key(
      ks: Double,
      k0: Double,
      k1: Double,
      k2: Double,
      k3: Double,
      k4: Double,
      k5: Double,
      k6: Double,
      k7: Double
    ): Unit = js.native
    
    /**
      * Set counter mask for CTR-family modes
      */
    def set_mask(m0: Double, m1: Double, m2: Double, m3: Double): Unit = js.native
    
    /**
      * Set nonce for CTR-family modes
      */
    def set_nonce(n0: Double, n1: Double, n2: Double, n3: Double): Unit = js.native
  }
  /* static members */
  object AESAsm {
    
    @JSImport("asmcrypto.js/dist_es8/aes/aes.asm", "AES_asm")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * AES deciphering mode constants
      */
    @JSImport("asmcrypto.js/dist_es8/aes/aes.asm", "AES_asm.DEC")
    @js.native
    def DEC: CBC = js.native
    @scala.inline
    def DEC_=(x: CBC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEC")(x.asInstanceOf[js.Any])
    
    /**
      * AES enciphering mode constants
      */
    @JSImport("asmcrypto.js/dist_es8/aes/aes.asm", "AES_asm.ENC")
    @js.native
    def ENC: Dictkey = js.native
    @scala.inline
    def ENC_=(x: Dictkey): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENC")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js/dist_es8/aes/aes.asm", "AES_asm.HEAP_DATA")
    @js.native
    def HEAP_DATA: Double = js.native
    @scala.inline
    def HEAP_DATA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEAP_DATA")(x.asInstanceOf[js.Any])
    
    /**
      * AES MAC mode constants
      */
    @JSImport("asmcrypto.js/dist_es8/aes/aes.asm", "AES_asm.MAC")
    @js.native
    def MAC: GCM = js.native
    @scala.inline
    def MAC_=(x: GCM): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAC")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.asmcryptoJs.asmcryptoJsStrings.ECB
    - typings.asmcryptoJs.asmcryptoJsStrings.CBC
    - typings.asmcryptoJs.asmcryptoJsStrings.CFB
    - typings.asmcryptoJs.asmcryptoJsStrings.OFB
    - typings.asmcryptoJs.asmcryptoJsStrings.CTR
    - typings.asmcryptoJs.asmcryptoJsStrings.CCM
  */
  trait AESMode extends StObject
  object AESMode {
    
    @scala.inline
    def CBC: typings.asmcryptoJs.asmcryptoJsStrings.CBC = "CBC".asInstanceOf[typings.asmcryptoJs.asmcryptoJsStrings.CBC]
    
    @scala.inline
    def CCM: typings.asmcryptoJs.asmcryptoJsStrings.CCM = "CCM".asInstanceOf[typings.asmcryptoJs.asmcryptoJsStrings.CCM]
    
    @scala.inline
    def CFB: typings.asmcryptoJs.asmcryptoJsStrings.CFB = "CFB".asInstanceOf[typings.asmcryptoJs.asmcryptoJsStrings.CFB]
    
    @scala.inline
    def CTR: typings.asmcryptoJs.asmcryptoJsStrings.CTR = "CTR".asInstanceOf[typings.asmcryptoJs.asmcryptoJsStrings.CTR]
    
    @scala.inline
    def ECB: typings.asmcryptoJs.asmcryptoJsStrings.ECB = "ECB".asInstanceOf[typings.asmcryptoJs.asmcryptoJsStrings.ECB]
    
    @scala.inline
    def OFB: typings.asmcryptoJs.asmcryptoJsStrings.OFB = "OFB".asInstanceOf[typings.asmcryptoJs.asmcryptoJsStrings.OFB]
  }
}
