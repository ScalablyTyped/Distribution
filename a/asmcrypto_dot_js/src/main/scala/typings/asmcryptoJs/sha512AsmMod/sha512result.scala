package typings.asmcryptoJs.sha512AsmMod

import typings.asmcryptoJs.asmcryptoJsNumbers.`-1`
import typings.asmcryptoJs.asmcryptoJsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sha512result extends js.Object {
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
    p0h: Double,
    p0l: Double,
    p1h: Double,
    p1l: Double,
    p2h: Double,
    p2l: Double,
    p3h: Double,
    p3l: Double,
    p4h: Double,
    p4l: Double,
    p5h: Double,
    p5l: Double,
    p6h: Double,
    p6l: Double,
    p7h: Double,
    p7l: Double,
    p8h: Double,
    p8l: Double,
    p9h: Double,
    p9l: Double,
    p10h: Double,
    p10l: Double,
    p11h: Double,
    p11l: Double,
    p12h: Double,
    p12l: Double,
    p13h: Double,
    p13l: Double,
    p14h: Double,
    p14l: Double,
    p15h: Double,
    p15l: Double
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

object sha512result {
  @scala.inline
  def apply(
    finish: (Double, Double, Double) => Double,
    hmac_finish: (Double, Double, Double) => Double,
    hmac_reset: () => Unit,
    init: (Double, Double, Double, Double, Double, Double, Double) => Unit,
    pbkdf2_generate_block: (Double, Double, Double, Double, Double) => `0` | `-1`,
    process: (Double, Double) => Double,
    reset: () => Unit
  ): sha512result = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction3(finish), hmac_finish = js.Any.fromFunction3(hmac_finish), hmac_reset = js.Any.fromFunction0(hmac_reset), init = js.Any.fromFunction7(init), pbkdf2_generate_block = js.Any.fromFunction5(pbkdf2_generate_block), process = js.Any.fromFunction2(process), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[sha512result]
  }
}

