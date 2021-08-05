package typings.asmcryptoJs

import org.scalablytyped.runtime.StringDictionary
import typings.asmcryptoJs.asmcryptoJsNumbers.`0`
import typings.asmcryptoJs.asmcryptoJsNumbers.`1`
import typings.asmcryptoJs.asmcryptoJsNumbers.`2`
import typings.asmcryptoJs.asmcryptoJsNumbers.`3`
import typings.asmcryptoJs.asmcryptoJsNumbers.`4`
import typings.asmcryptoJs.asmcryptoJsNumbers.`5`
import typings.asmcryptoJs.asmcryptoJsNumbers.`6`
import typings.asmcryptoJs.asmcryptoJsNumbers.`7`
import typings.asmcryptoJs.bignumMod.BigNumber
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BitLength extends StObject {
    
    var bitLength: Double
    
    var limbs: Uint32Array
    
    var sign: Double
  }
  object BitLength {
    
    inline def apply(bitLength: Double, limbs: Uint32Array, sign: Double): BitLength = {
      val __obj = js.Dynamic.literal(bitLength = bitLength.asInstanceOf[js.Any], limbs = limbs.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitLength]
    }
    
    extension [Self <: BitLength](x: Self) {
      
      inline def setBitLength(value: Double): Self = StObject.set(x, "bitLength", value.asInstanceOf[js.Any])
      
      inline def setLimbs(value: Uint32Array): Self = StObject.set(x, "limbs", value.asInstanceOf[js.Any])
      
      inline def setSign(value: Double): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
    }
  }
  
  trait CBC
    extends StObject
       with /* key */ StringDictionary[Double] {
    
    var CBC: `3`
    
    var CFB: `5`
    
    var CTR: `7`
    
    var ECB: `1`
    
    var OFB: `6`
  }
  object CBC {
    
    inline def apply(): CBC = {
      val __obj = js.Dynamic.literal(CBC = 3, CFB = 5, CTR = 7, ECB = 1, OFB = 6)
      __obj.asInstanceOf[CBC]
    }
    
    extension [Self <: CBC](x: Self) {
      
      inline def setCBC(value: `3`): Self = StObject.set(x, "CBC", value.asInstanceOf[js.Any])
      
      inline def setCFB(value: `5`): Self = StObject.set(x, "CFB", value.asInstanceOf[js.Any])
      
      inline def setCTR(value: `7`): Self = StObject.set(x, "CTR", value.asInstanceOf[js.Any])
      
      inline def setECB(value: `1`): Self = StObject.set(x, "ECB", value.asInstanceOf[js.Any])
      
      inline def setOFB(value: `6`): Self = StObject.set(x, "OFB", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Double] {
    
    var CBC: `2`
    
    var CFB: `4`
    
    var CTR: `7`
    
    var ECB: `0`
    
    var OFB: `6`
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal(CBC = 2, CFB = 4, CTR = 7, ECB = 0, OFB = 6)
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setCBC(value: `2`): Self = StObject.set(x, "CBC", value.asInstanceOf[js.Any])
      
      inline def setCFB(value: `4`): Self = StObject.set(x, "CFB", value.asInstanceOf[js.Any])
      
      inline def setCTR(value: `7`): Self = StObject.set(x, "CTR", value.asInstanceOf[js.Any])
      
      inline def setECB(value: `0`): Self = StObject.set(x, "ECB", value.asInstanceOf[js.Any])
      
      inline def setOFB(value: `6`): Self = StObject.set(x, "OFB", value.asInstanceOf[js.Any])
    }
  }
  
  trait GCM
    extends StObject
       with /* key */ StringDictionary[Double] {
    
    var CBC: `0`
    
    var GCM: `1`
  }
  object GCM {
    
    inline def apply(): GCM = {
      val __obj = js.Dynamic.literal(CBC = 0, GCM = 1)
      __obj.asInstanceOf[GCM]
    }
    
    extension [Self <: GCM](x: Self) {
      
      inline def setCBC(value: `0`): Self = StObject.set(x, "CBC", value.asInstanceOf[js.Any])
      
      inline def setGCM(value: `1`): Self = StObject.set(x, "GCM", value.asInstanceOf[js.Any])
    }
  }
  
  trait Gcd extends StObject {
    
    var gcd: this.type
    
    var x: this.type
    
    var y: this.type
  }
  object Gcd {
    
    inline def apply(gcd: Gcd, x: Gcd, y: Gcd): Gcd = {
      val __obj = js.Dynamic.literal(gcd = gcd.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gcd]
    }
    
    extension [Self <: Gcd](x: Self) {
      
      inline def setGcd(value: Gcd): Self = StObject.set(x, "gcd", value.asInstanceOf[js.Any])
      
      inline def setX(value: Gcd): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Gcd): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Quotient extends StObject {
    
    var quotient: BigNumber
    
    var remainder: BigNumber
  }
  object Quotient {
    
    inline def apply(quotient: BigNumber, remainder: BigNumber): Quotient = {
      val __obj = js.Dynamic.literal(quotient = quotient.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quotient]
    }
    
    extension [Self <: Quotient](x: Self) {
      
      inline def setQuotient(value: BigNumber): Self = StObject.set(x, "quotient", value.asInstanceOf[js.Any])
      
      inline def setRemainder(value: BigNumber): Self = StObject.set(x, "remainder", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var gcd: Double
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(gcd: Double, x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(gcd = gcd.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setGcd(value: Double): Self = StObject.set(x, "gcd", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var gcd: BigNumber
    
    var x: BigNumber
    
    var y: BigNumber
  }
  object Y {
    
    inline def apply(gcd: BigNumber, x: BigNumber, y: BigNumber): Y = {
      val __obj = js.Dynamic.literal(gcd = gcd.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    extension [Self <: Y](x: Self) {
      
      inline def setGcd(value: BigNumber): Self = StObject.set(x, "gcd", value.asInstanceOf[js.Any])
      
      inline def setX(value: BigNumber): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: BigNumber): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
