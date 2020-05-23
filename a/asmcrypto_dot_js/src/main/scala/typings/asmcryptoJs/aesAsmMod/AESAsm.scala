package typings.asmcryptoJs.aesAsmMod

import typings.asmcryptoJs.anon.CBC
import typings.asmcryptoJs.anon.Dictkey
import typings.asmcryptoJs.anon.GCM
import typings.asmcryptoJs.asmcryptoJsNumbers.`16`
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/aes/aes.asm", "AES_asm")
@js.native
class AESAsm protected () extends js.Object {
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
@JSImport("asmcrypto.js/dist_es8/aes/aes.asm", "AES_asm")
@js.native
object AESAsm extends js.Object {
  /**
    * AES deciphering mode constants
    */
  var DEC: CBC = js.native
  /**
    * AES enciphering mode constants
    */
  var ENC: Dictkey = js.native
  var HEAP_DATA: Double = js.native
  /**
    * AES MAC mode constants
    */
  var MAC: GCM = js.native
}

