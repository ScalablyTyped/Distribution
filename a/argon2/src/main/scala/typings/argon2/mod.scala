package typings.argon2

import typings.argon2.anon.Optionsrawfalseundefined
import typings.argon2.anon.Optionsrawtrue
import typings.argon2.argon2Numbers.`0`
import typings.argon2.argon2Numbers.`1`
import typings.argon2.argon2Numbers.`2`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("argon2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("argon2", "argon2d")
  @js.native
  val argon2d: `0` = js.native
  
  @JSImport("argon2", "argon2i")
  @js.native
  val argon2i: `1` = js.native
  
  @JSImport("argon2", "argon2id")
  @js.native
  val argon2id: `2` = js.native
  
  @JSImport("argon2", "defaults")
  @js.native
  val defaults: Options = js.native
  
  inline def hash(plain: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(plain.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def hash(plain: String, options: Optionsrawfalseundefined): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hash(plain: String, options: Optionsrawtrue): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def hash(plain: Buffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(plain.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def hash(plain: Buffer, options: Optionsrawfalseundefined): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hash(plain: Buffer, options: Optionsrawtrue): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("argon2", "limits")
  @js.native
  val limits: OptionLimits = js.native
  
  inline def needsRehash(hash: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("needsRehash")(hash.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def needsRehash(hash: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("needsRehash")(hash.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def verify(hash: String, plain: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hash.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verify(hash: String, plain: String, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hash.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verify(hash: String, plain: Buffer): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hash.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verify(hash: String, plain: Buffer, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hash.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  trait NumericLimit extends StObject {
    
    var max: Double
    
    var min: Double
  }
  object NumericLimit {
    
    inline def apply(max: Double, min: Double): NumericLimit = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumericLimit]
    }
    
    extension [Self <: NumericLimit](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionLimits extends StObject {
    
    var hashLength: NumericLimit
    
    var memoryCost: NumericLimit
    
    var parallelism: NumericLimit
    
    var timeCost: NumericLimit
  }
  object OptionLimits {
    
    inline def apply(
      hashLength: NumericLimit,
      memoryCost: NumericLimit,
      parallelism: NumericLimit,
      timeCost: NumericLimit
    ): OptionLimits = {
      val __obj = js.Dynamic.literal(hashLength = hashLength.asInstanceOf[js.Any], memoryCost = memoryCost.asInstanceOf[js.Any], parallelism = parallelism.asInstanceOf[js.Any], timeCost = timeCost.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionLimits]
    }
    
    extension [Self <: OptionLimits](x: Self) {
      
      inline def setHashLength(value: NumericLimit): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      inline def setMemoryCost(value: NumericLimit): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
      
      inline def setParallelism(value: NumericLimit): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
      
      inline def setTimeCost(value: NumericLimit): Self = StObject.set(x, "timeCost", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var associatedData: js.UndefOr[Buffer] = js.undefined
    
    var hashLength: js.UndefOr[Double] = js.undefined
    
    var memoryCost: js.UndefOr[Double] = js.undefined
    
    var parallelism: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var salt: js.UndefOr[Buffer] = js.undefined
    
    var saltLength: js.UndefOr[Double] = js.undefined
    
    var secret: js.UndefOr[Buffer] = js.undefined
    
    var timeCost: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAssociatedData(value: Buffer): Self = StObject.set(x, "associatedData", value.asInstanceOf[js.Any])
      
      inline def setAssociatedDataUndefined: Self = StObject.set(x, "associatedData", js.undefined)
      
      inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      inline def setHashLengthUndefined: Self = StObject.set(x, "hashLength", js.undefined)
      
      inline def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
      
      inline def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
      
      inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
      
      inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
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
