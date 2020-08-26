package typings.asmcryptoJs

import typings.asmcryptoJs.asmcryptoJsNumbers.`0`
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/bignum/bigint.asm", JSImport.Namespace)
@js.native
object bigintAsmMod extends js.Object {
  @js.native
  trait bigintresult extends js.Object {
    def add(
      A: js.UndefOr[Double],
      lA: js.UndefOr[Double],
      B: js.UndefOr[Double],
      lB: js.UndefOr[Double],
      R: js.UndefOr[Double],
      lR: js.UndefOr[Double]
    ): Double = js.native
    def cmp(): `0` = js.native
    def cmp(
      A: js.UndefOr[scala.Nothing],
      lA: js.UndefOr[scala.Nothing],
      B: js.UndefOr[scala.Nothing],
      lB: Double
    ): `0` = js.native
    def cmp(A: js.UndefOr[scala.Nothing], lA: js.UndefOr[scala.Nothing], B: Double): `0` = js.native
    def cmp(A: js.UndefOr[scala.Nothing], lA: js.UndefOr[scala.Nothing], B: Double, lB: Double): `0` = js.native
    def cmp(A: js.UndefOr[scala.Nothing], lA: Double): `0` = js.native
    def cmp(A: js.UndefOr[scala.Nothing], lA: Double, B: js.UndefOr[scala.Nothing], lB: Double): `0` = js.native
    def cmp(A: js.UndefOr[scala.Nothing], lA: Double, B: Double): `0` = js.native
    def cmp(A: js.UndefOr[scala.Nothing], lA: Double, B: Double, lB: Double): `0` = js.native
    def cmp(A: Double): `0` = js.native
    def cmp(A: Double, lA: js.UndefOr[scala.Nothing], B: js.UndefOr[scala.Nothing], lB: Double): `0` = js.native
    def cmp(A: Double, lA: js.UndefOr[scala.Nothing], B: Double): `0` = js.native
    def cmp(A: Double, lA: js.UndefOr[scala.Nothing], B: Double, lB: Double): `0` = js.native
    def cmp(A: Double, lA: Double): `0` = js.native
    def cmp(A: Double, lA: Double, B: js.UndefOr[scala.Nothing], lB: Double): `0` = js.native
    def cmp(A: Double, lA: Double, B: Double): `0` = js.native
    def cmp(A: Double, lA: Double, B: Double, lB: Double): `0` = js.native
    def div(): Unit = js.native
    def div(
      N: js.UndefOr[scala.Nothing],
      lN: js.UndefOr[scala.Nothing],
      D: js.UndefOr[scala.Nothing],
      lD: js.UndefOr[scala.Nothing],
      Q: Double
    ): Unit = js.native
    def div(
      N: js.UndefOr[scala.Nothing],
      lN: js.UndefOr[scala.Nothing],
      D: js.UndefOr[scala.Nothing],
      lD: Double
    ): Unit = js.native
    def div(
      N: js.UndefOr[scala.Nothing],
      lN: js.UndefOr[scala.Nothing],
      D: js.UndefOr[scala.Nothing],
      lD: Double,
      Q: Double
    ): Unit = js.native
    def div(N: js.UndefOr[scala.Nothing], lN: js.UndefOr[scala.Nothing], D: Double): Unit = js.native
    def div(
      N: js.UndefOr[scala.Nothing],
      lN: js.UndefOr[scala.Nothing],
      D: Double,
      lD: js.UndefOr[scala.Nothing],
      Q: Double
    ): Unit = js.native
    def div(N: js.UndefOr[scala.Nothing], lN: js.UndefOr[scala.Nothing], D: Double, lD: Double): Unit = js.native
    def div(N: js.UndefOr[scala.Nothing], lN: js.UndefOr[scala.Nothing], D: Double, lD: Double, Q: Double): Unit = js.native
    def div(N: js.UndefOr[scala.Nothing], lN: Double): Unit = js.native
    def div(
      N: js.UndefOr[scala.Nothing],
      lN: Double,
      D: js.UndefOr[scala.Nothing],
      lD: js.UndefOr[scala.Nothing],
      Q: Double
    ): Unit = js.native
    def div(N: js.UndefOr[scala.Nothing], lN: Double, D: js.UndefOr[scala.Nothing], lD: Double): Unit = js.native
    def div(N: js.UndefOr[scala.Nothing], lN: Double, D: js.UndefOr[scala.Nothing], lD: Double, Q: Double): Unit = js.native
    def div(N: js.UndefOr[scala.Nothing], lN: Double, D: Double): Unit = js.native
    def div(N: js.UndefOr[scala.Nothing], lN: Double, D: Double, lD: js.UndefOr[scala.Nothing], Q: Double): Unit = js.native
    def div(N: js.UndefOr[scala.Nothing], lN: Double, D: Double, lD: Double): Unit = js.native
    def div(N: js.UndefOr[scala.Nothing], lN: Double, D: Double, lD: Double, Q: Double): Unit = js.native
    def div(N: Double): Unit = js.native
    def div(
      N: Double,
      lN: js.UndefOr[scala.Nothing],
      D: js.UndefOr[scala.Nothing],
      lD: js.UndefOr[scala.Nothing],
      Q: Double
    ): Unit = js.native
    def div(N: Double, lN: js.UndefOr[scala.Nothing], D: js.UndefOr[scala.Nothing], lD: Double): Unit = js.native
    def div(N: Double, lN: js.UndefOr[scala.Nothing], D: js.UndefOr[scala.Nothing], lD: Double, Q: Double): Unit = js.native
    def div(N: Double, lN: js.UndefOr[scala.Nothing], D: Double): Unit = js.native
    def div(N: Double, lN: js.UndefOr[scala.Nothing], D: Double, lD: js.UndefOr[scala.Nothing], Q: Double): Unit = js.native
    def div(N: Double, lN: js.UndefOr[scala.Nothing], D: Double, lD: Double): Unit = js.native
    def div(N: Double, lN: js.UndefOr[scala.Nothing], D: Double, lD: Double, Q: Double): Unit = js.native
    def div(N: Double, lN: Double): Unit = js.native
    def div(N: Double, lN: Double, D: js.UndefOr[scala.Nothing], lD: js.UndefOr[scala.Nothing], Q: Double): Unit = js.native
    def div(N: Double, lN: Double, D: js.UndefOr[scala.Nothing], lD: Double): Unit = js.native
    def div(N: Double, lN: Double, D: js.UndefOr[scala.Nothing], lD: Double, Q: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Double, lD: js.UndefOr[scala.Nothing], Q: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Double, lD: Double): Unit = js.native
    def div(N: Double, lN: Double, D: Double, lD: Double, Q: Double): Unit = js.native
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
    def neg(
      A: js.UndefOr[scala.Nothing],
      lA: js.UndefOr[scala.Nothing],
      R: js.UndefOr[scala.Nothing],
      lR: Double
    ): Double = js.native
    def neg(A: js.UndefOr[scala.Nothing], lA: js.UndefOr[scala.Nothing], R: Double): Double = js.native
    def neg(A: js.UndefOr[scala.Nothing], lA: js.UndefOr[scala.Nothing], R: Double, lR: Double): Double = js.native
    def neg(A: js.UndefOr[scala.Nothing], lA: Double): Double = js.native
    def neg(A: js.UndefOr[scala.Nothing], lA: Double, R: js.UndefOr[scala.Nothing], lR: Double): Double = js.native
    def neg(A: js.UndefOr[scala.Nothing], lA: Double, R: Double): Double = js.native
    def neg(A: js.UndefOr[scala.Nothing], lA: Double, R: Double, lR: Double): Double = js.native
    def neg(A: Double): Double = js.native
    def neg(A: Double, lA: js.UndefOr[scala.Nothing], R: js.UndefOr[scala.Nothing], lR: Double): Double = js.native
    def neg(A: Double, lA: js.UndefOr[scala.Nothing], R: Double): Double = js.native
    def neg(A: Double, lA: js.UndefOr[scala.Nothing], R: Double, lR: Double): Double = js.native
    def neg(A: Double, lA: Double): Double = js.native
    def neg(A: Double, lA: Double, R: js.UndefOr[scala.Nothing], lR: Double): Double = js.native
    def neg(A: Double, lA: Double, R: Double): Double = js.native
    def neg(A: Double, lA: Double, R: Double, lR: Double): Double = js.native
    def salloc(): Double = js.native
    def salloc(n: Double): Double = js.native
    def sfree(): Unit = js.native
    def sfree(n: Double): Unit = js.native
    def sqr(): Unit = js.native
    def sqr(A: js.UndefOr[scala.Nothing], lA: js.UndefOr[scala.Nothing], R: Double): Unit = js.native
    def sqr(A: js.UndefOr[scala.Nothing], lA: Double): Unit = js.native
    def sqr(A: js.UndefOr[scala.Nothing], lA: Double, R: Double): Unit = js.native
    def sqr(A: Double): Unit = js.native
    def sqr(A: Double, lA: js.UndefOr[scala.Nothing], R: Double): Unit = js.native
    def sqr(A: Double, lA: Double): Unit = js.native
    def sqr(A: Double, lA: Double, R: Double): Unit = js.native
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
    def tst(A: js.UndefOr[scala.Nothing], lA: Double): `0` = js.native
    def tst(A: Double): `0` = js.native
    def tst(A: Double, lA: Double): `0` = js.native
    def z(): Unit = js.native
    def z(l: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], A: Double): Unit = js.native
    def z(l: js.UndefOr[scala.Nothing], z: Double): Unit = js.native
    def z(l: js.UndefOr[scala.Nothing], z: Double, A: Double): Unit = js.native
    def z(l: Double): Unit = js.native
    def z(l: Double, z: js.UndefOr[scala.Nothing], A: Double): Unit = js.native
    def z(l: Double, z: Double): Unit = js.native
    def z(l: Double, z: Double, A: Double): Unit = js.native
  }
  
  @JSName("bigint_asm")
  def bigintAsm(stdlib: js.Any, foreign: js.Any, buffer: ArrayBuffer): bigintresult = js.native
}

