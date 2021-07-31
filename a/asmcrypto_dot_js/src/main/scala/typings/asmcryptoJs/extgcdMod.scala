package typings.asmcryptoJs

import typings.asmcryptoJs.anon.X
import typings.asmcryptoJs.anon.Y
import typings.asmcryptoJs.bignumMod.BigNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extgcdMod {
  
  @JSImport("asmcrypto.js/dist_es8/bignum/extgcd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def BigNumberExtGCD(a: BigNumber, b: BigNumber): Y = (^.asInstanceOf[js.Dynamic].applyDynamic("BigNumber_extGCD")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Y]
  
  @scala.inline
  def NumberExtGCD(a: Double, b: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("Number_extGCD")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[X]
}
