package typings.asmcryptoJs.sha256AsmMod

import typings.asmcryptoJs.asmcryptoJsNumbers.`-1`
import typings.asmcryptoJs.asmcryptoJsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sha256result extends js.Object {
  /**
    * @param offset - multiple of 64
    * @param length
    * @param output - multiple of 32
    * @returns hashed
    */
  def finish(offset: Double, length: Double, output: Double): Double
  /**
    * @param offset - multiple of 64
    * @param length
    * @param output - multiple of 32
    * @returns hashed
    */
  def hmac_finish(offset: Double, length: Double, output: Double): Double
  def hmac_init(
    p0: Double,
    p1: Double,
    p2: Double,
    p3: Double,
    p4: Double,
    p5: Double,
    p6: Double,
    p7: Double,
    p8: Double,
    p9: Double,
    p10: Double,
    p11: Double,
    p12: Double,
    p13: Double,
    p14: Double,
    p15: Double
  ): Unit
  // HMAC-SHA;
  def hmac_reset(): Unit
  def init(h0: Double, h1: Double, h2: Double, h3: Double, h4: Double, total0: Double, total1: Double): Unit
  // ;
  /**
    * PBKDF2-HMAC-SHA
    * @param offset - multiple of 64
    * @param length
    * @param block
    * @param count
    * @param output - multiple of 32
    */
  def pbkdf2_generate_block(offset: Double, length: Double, block: Double, count: Double, output: Double): `0` | `-1`
  /**
    * @param offset - multiple of 64
    * @param length
    * @returns hashed
    */
  def process(offset: Double, length: Double): Double
  // SHA1
  def reset(): Unit
}

object sha256result {
  @scala.inline
  def apply(
    finish: (Double, Double, Double) => Double,
    hmac_finish: (Double, Double, Double) => Double,
    hmac_init: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    hmac_reset: () => Unit,
    init: (Double, Double, Double, Double, Double, Double, Double) => Unit,
    pbkdf2_generate_block: (Double, Double, Double, Double, Double) => `0` | `-1`,
    process: (Double, Double) => Double,
    reset: () => Unit
  ): sha256result = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction3(finish), hmac_finish = js.Any.fromFunction3(hmac_finish), hmac_init = js.Any.fromFunction16(hmac_init), hmac_reset = js.Any.fromFunction0(hmac_reset), init = js.Any.fromFunction7(init), pbkdf2_generate_block = js.Any.fromFunction5(pbkdf2_generate_block), process = js.Any.fromFunction2(process), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[sha256result]
  }
}

