package typings.asmcryptoJs

import typings.asmcryptoJs.asmcryptoJsNumbers.`0`
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bigintAsmMod {
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bigint.asm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bigintAsm(stdlib: js.Any, foreign: js.Any, buffer: ArrayBuffer): bigintresult = (^.asInstanceOf[js.Dynamic].applyDynamic("bigint_asm")(stdlib.asInstanceOf[js.Any], foreign.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[bigintresult]
  
  @js.native
  trait bigintresult extends StObject {
    
    def add(
      A: js.UndefOr[Double],
      lA: js.UndefOr[Double],
      B: js.UndefOr[Double],
      lB: js.UndefOr[Double],
      R: js.UndefOr[Double],
      lR: js.UndefOr[Double]
    ): Double = js.native
    
    def cmp(): `0` = js.native
    def cmp(A: Double): `0` = js.native
    def cmp(A: Double, lA: Double): `0` = js.native
    def cmp(A: Double, lA: Double, B: Double): `0` = js.native
    def cmp(A: Double, lA: Double, B: Double, lB: Double): `0` = js.native
    def cmp(A: Double, lA: Double, B: Unit, lB: Double): `0` = js.native
    def cmp(A: Double, lA: Unit, B: Double): `0` = js.native
    def cmp(A: Double, lA: Unit, B: Double, lB: Double): `0` = js.native
    def cmp(A: Double, lA: Unit, B: Unit, lB: Double): `0` = js.native
    def cmp(A: Unit, lA: Double): `0` = js.native
    def cmp(A: Unit, lA: Double, B: Double): `0` = js.native
    def cmp(A: Unit, lA: Double, B: Double, lB: Double): `0` = js.native
    def cmp(A: Unit, lA: Double, B: Unit, lB: Double): `0` = js.native
    def cmp(A: Unit, lA: Unit, B: Double): `0` = js.native
    def cmp(A: Unit, lA: Unit, B: Double, lB: Double): `0` = js.native
    def cmp(A: Unit, lA: Unit, B: Unit, lB: Double): `0` = js.native
    
    def div(): Unit = js.native
    def div(N: Double): Unit = js.native
    def div(N: Double, lN: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Double, lD: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Double, lD: Double, Q: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Double, lD: Unit, Q: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Unit, lD: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Unit, lD: Double, Q: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Unit, lD: Unit, Q: Double): Unit = js.native
    def div(N: Double, lN: Unit, D: Double): Unit = js.native
    def div(N: Double, lN: Unit, D: Double, lD: Double): Unit = js.native
    def div(N: Double, lN: Unit, D: Double, lD: Double, Q: Double): Unit = js.native
    def div(N: Double, lN: Unit, D: Double, lD: Unit, Q: Double): Unit = js.native
    def div(N: Double, lN: Unit, D: Unit, lD: Double): Unit = js.native
    def div(N: Double, lN: Unit, D: Unit, lD: Double, Q: Double): Unit = js.native
    def div(N: Double, lN: Unit, D: Unit, lD: Unit, Q: Double): Unit = js.native
    def div(N: Unit, lN: Double): Unit = js.native
    def div(N: Unit, lN: Double, D: Double): Unit = js.native
    def div(N: Unit, lN: Double, D: Double, lD: Double): Unit = js.native
    def div(N: Unit, lN: Double, D: Double, lD: Double, Q: Double): Unit = js.native
    def div(N: Unit, lN: Double, D: Double, lD: Unit, Q: Double): Unit = js.native
    def div(N: Unit, lN: Double, D: Unit, lD: Double): Unit = js.native
    def div(N: Unit, lN: Double, D: Unit, lD: Double, Q: Double): Unit = js.native
    def div(N: Unit, lN: Double, D: Unit, lD: Unit, Q: Double): Unit = js.native
    def div(N: Unit, lN: Unit, D: Double): Unit = js.native
    def div(N: Unit, lN: Unit, D: Double, lD: Double): Unit = js.native
    def div(N: Unit, lN: Unit, D: Double, lD: Double, Q: Double): Unit = js.native
    def div(N: Unit, lN: Unit, D: Double, lD: Unit, Q: Double): Unit = js.native
    def div(N: Unit, lN: Unit, D: Unit, lD: Double): Unit = js.native
    def div(N: Unit, lN: Unit, D: Unit, lD: Double, Q: Double): Unit = js.native
    def div(N: Unit, lN: Unit, D: Unit, lD: Unit, Q: Double): Unit = js.native
    
    def mredc(
      A: js.UndefOr[Double],
      lA: js.UndefOr[Double],
      N: js.UndefOr[Double],
      lN: js.UndefOr[Double],
      y: js.UndefOr[Double],
      R: js.UndefOr[Double]
    ): Unit = js.native
    
    def mul(
      A: js.UndefOr[Double],
      lA: js.UndefOr[Double],
      B: js.UndefOr[Double],
      lB: js.UndefOr[Double],
      R: js.UndefOr[Double],
      lR: js.UndefOr[Double]
    ): Unit = js.native
    
    def neg(): Double = js.native
    def neg(A: Double): Double = js.native
    def neg(A: Double, lA: Double): Double = js.native
    def neg(A: Double, lA: Double, R: Double): Double = js.native
    def neg(A: Double, lA: Double, R: Double, lR: Double): Double = js.native
    def neg(A: Double, lA: Double, R: Unit, lR: Double): Double = js.native
    def neg(A: Double, lA: Unit, R: Double): Double = js.native
    def neg(A: Double, lA: Unit, R: Double, lR: Double): Double = js.native
    def neg(A: Double, lA: Unit, R: Unit, lR: Double): Double = js.native
    def neg(A: Unit, lA: Double): Double = js.native
    def neg(A: Unit, lA: Double, R: Double): Double = js.native
    def neg(A: Unit, lA: Double, R: Double, lR: Double): Double = js.native
    def neg(A: Unit, lA: Double, R: Unit, lR: Double): Double = js.native
    def neg(A: Unit, lA: Unit, R: Double): Double = js.native
    def neg(A: Unit, lA: Unit, R: Double, lR: Double): Double = js.native
    def neg(A: Unit, lA: Unit, R: Unit, lR: Double): Double = js.native
    
    def salloc(): Double = js.native
    def salloc(n: Double): Double = js.native
    
    def sfree(): Unit = js.native
    def sfree(n: Double): Unit = js.native
    
    def sqr(): Unit = js.native
    def sqr(A: Double): Unit = js.native
    def sqr(A: Double, lA: Double): Unit = js.native
    def sqr(A: Double, lA: Double, R: Double): Unit = js.native
    def sqr(A: Double, lA: Unit, R: Double): Unit = js.native
    def sqr(A: Unit, lA: Double): Unit = js.native
    def sqr(A: Unit, lA: Double, R: Double): Unit = js.native
    def sqr(A: Unit, lA: Unit, R: Double): Unit = js.native
    
    def sreset(): Double = js.native
    def sreset(n: Double): Double = js.native
    
    def sub(
      A: js.UndefOr[Double],
      lA: js.UndefOr[Double],
      B: js.UndefOr[Double],
      lB: js.UndefOr[Double],
      R: js.UndefOr[Double],
      lR: js.UndefOr[Double]
    ): Double = js.native
    
    def tst(): `0` = js.native
    def tst(A: Double): `0` = js.native
    def tst(A: Double, lA: Double): `0` = js.native
    def tst(A: Unit, lA: Double): `0` = js.native
    
    def z(): Unit = js.native
    def z(l: Double): Unit = js.native
    def z(l: Double, z: Double): Unit = js.native
    def z(l: Double, z: Double, A: Double): Unit = js.native
    def z(l: Double, z: Unit, A: Double): Unit = js.native
    def z(l: Unit, z: Double): Unit = js.native
    def z(l: Unit, z: Double, A: Double): Unit = js.native
    def z(l: Unit, z: Unit, A: Double): Unit = js.native
  }
}
