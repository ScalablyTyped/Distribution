package typings.argon2

import typings.argon2.argon2Booleans.`false`
import typings.argon2.argon2Booleans.`true`
import typings.argon2.argon2Numbers.`0`
import typings.argon2.argon2Numbers.`1`
import typings.argon2.argon2Numbers.`2`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined argon2.argon2.Options & {  raw :false | undefined} */
  trait Optionsrawfalseundefined extends StObject {
    
    var associatedData: js.UndefOr[Buffer] = js.undefined
    
    var hashLength: js.UndefOr[Double] = js.undefined
    
    var memoryCost: js.UndefOr[Double] = js.undefined
    
    var parallelism: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    var salt: js.UndefOr[Buffer] = js.undefined
    
    var saltLength: js.UndefOr[Double] = js.undefined
    
    var secret: js.UndefOr[Buffer] = js.undefined
    
    var timeCost: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object Optionsrawfalseundefined {
    
    inline def apply(raw: js.UndefOr[Boolean] & js.UndefOr[`false`]): Optionsrawfalseundefined = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsrawfalseundefined]
    }
    
    extension [Self <: Optionsrawfalseundefined](x: Self) {
      
      inline def setAssociatedData(value: Buffer): Self = StObject.set(x, "associatedData", value.asInstanceOf[js.Any])
      
      inline def setAssociatedDataUndefined: Self = StObject.set(x, "associatedData", js.undefined)
      
      inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      inline def setHashLengthUndefined: Self = StObject.set(x, "hashLength", js.undefined)
      
      inline def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
      
      inline def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
      
      inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
      
      inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
      
      inline def setRaw(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setSecret(value: Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setTimeCost(value: Double): Self = StObject.set(x, "timeCost", value.asInstanceOf[js.Any])
      
      inline def setTimeCostUndefined: Self = StObject.set(x, "timeCost", js.undefined)
      
      inline def setType(value: `0` | `1` | `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined argon2.argon2.Options & {  raw :true} */
  trait Optionsrawtrue extends StObject {
    
    var associatedData: js.UndefOr[Buffer] = js.undefined
    
    var hashLength: js.UndefOr[Double] = js.undefined
    
    var memoryCost: js.UndefOr[Double] = js.undefined
    
    var parallelism: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] & `true`
    
    var salt: js.UndefOr[Buffer] = js.undefined
    
    var saltLength: js.UndefOr[Double] = js.undefined
    
    var secret: js.UndefOr[Buffer] = js.undefined
    
    var timeCost: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object Optionsrawtrue {
    
    inline def apply(raw: js.UndefOr[Boolean] & `true`): Optionsrawtrue = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsrawtrue]
    }
    
    extension [Self <: Optionsrawtrue](x: Self) {
      
      inline def setAssociatedData(value: Buffer): Self = StObject.set(x, "associatedData", value.asInstanceOf[js.Any])
      
      inline def setAssociatedDataUndefined: Self = StObject.set(x, "associatedData", js.undefined)
      
      inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      inline def setHashLengthUndefined: Self = StObject.set(x, "hashLength", js.undefined)
      
      inline def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
      
      inline def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
      
      inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
      
      inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
      
      inline def setRaw(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setSecret(value: Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setTimeCost(value: Double): Self = StObject.set(x, "timeCost", value.asInstanceOf[js.Any])
      
      inline def setTimeCostUndefined: Self = StObject.set(x, "timeCost", js.undefined)
      
      inline def setType(value: `0` | `1` | `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
