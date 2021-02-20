package typings.asmcryptoJs

import typings.asmcryptoJs.asmcryptoJsNumbers.`-1`
import typings.asmcryptoJs.asmcryptoJsNumbers.`0`
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha1AsmMod {
  
  @JSImport("asmcrypto.js/dist_es8/hash/sha1/sha1.asm", "sha1_asm")
  @js.native
  def sha1Asm(stdlib: js.Any, foreign: js.Any, buffer: ArrayBuffer): sha1result = js.native
  
  @js.native
  trait sha1result extends StObject {
    
    /**
      * @param offset - multiple of 64
      * @param length
      * @param output - multiple of 32
      * @returns hashed
      */
    def finish(offset: Double, length: Double, output: Double): Double = js.native
    
    /**
      * @param offset - multiple of 64
      * @param length
      * @param output - multiple of 32
      * @returns hashed
      */
    def hmac_finish(offset: Double, length: Double, output: Double): Double = js.native
    
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
    ): Unit = js.native
    
    // HMAC-SHA;
    def hmac_reset(): Unit = js.native
    
    def init(h0: Double, h1: Double, h2: Double, h3: Double, h4: Double, total0: Double, total1: Double): Unit = js.native
    
    // ;
    /**
      * PBKDF2-HMAC-SHA
      * @param offset - multiple of 64
      * @param length
      * @param block
      * @param count
      * @param output - multiple of 32
      */
    def pbkdf2_generate_block(offset: Double, length: Double, block: Double, count: Double, output: Double): `0` | `-1` = js.native
    
    /**
      * @param offset - multiple of 64
      * @param length
      * @returns hashed
      */
    def process(offset: Double, length: Double): Double = js.native
    
    // SHA1
    def reset(): Unit = js.native
  }
  object sha1result {
    
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
    ): sha1result = {
      val __obj = js.Dynamic.literal(finish = js.Any.fromFunction3(finish), hmac_finish = js.Any.fromFunction3(hmac_finish), hmac_init = js.Any.fromFunction16(hmac_init), hmac_reset = js.Any.fromFunction0(hmac_reset), init = js.Any.fromFunction7(init), pbkdf2_generate_block = js.Any.fromFunction5(pbkdf2_generate_block), process = js.Any.fromFunction2(process), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[sha1result]
    }
    
    @scala.inline
    implicit class sha1resultMutableBuilder[Self <: sha1result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinish(value: (Double, Double, Double) => Double): Self = StObject.set(x, "finish", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHmac_finish(value: (Double, Double, Double) => Double): Self = StObject.set(x, "hmac_finish", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHmac_init(
        value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit
      ): Self = StObject.set(x, "hmac_init", js.Any.fromFunction16(value))
      
      @scala.inline
      def setHmac_reset(value: () => Unit): Self = StObject.set(x, "hmac_reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInit(value: (Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction7(value))
      
      @scala.inline
      def setPbkdf2_generate_block(value: (Double, Double, Double, Double, Double) => `0` | `-1`): Self = StObject.set(x, "pbkdf2_generate_block", js.Any.fromFunction5(value))
      
      @scala.inline
      def setProcess(value: (Double, Double) => Double): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
}
