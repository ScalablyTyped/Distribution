package typings.argon2

import typings.argon2.anon.Optionsrawfalseundefined
import typings.argon2.anon.Optionsrawtrue
import typings.argon2.argon2Numbers.`0`
import typings.argon2.argon2Numbers.`1`
import typings.argon2.argon2Numbers.`2`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("argon2", "hash")
  @js.native
  def hash(plain: String): js.Promise[String] = js.native
  @JSImport("argon2", "hash")
  @js.native
  def hash(plain: String, options: Optionsrawfalseundefined): js.Promise[String] = js.native
  @JSImport("argon2", "hash")
  @js.native
  def hash(plain: String, options: Optionsrawtrue): js.Promise[Buffer] = js.native
  @JSImport("argon2", "hash")
  @js.native
  def hash(plain: Buffer): js.Promise[String] = js.native
  @JSImport("argon2", "hash")
  @js.native
  def hash(plain: Buffer, options: Optionsrawfalseundefined): js.Promise[String] = js.native
  @JSImport("argon2", "hash")
  @js.native
  def hash(plain: Buffer, options: Optionsrawtrue): js.Promise[Buffer] = js.native
  
  @JSImport("argon2", "limits")
  @js.native
  val limits: OptionLimits = js.native
  
  @JSImport("argon2", "needsRehash")
  @js.native
  def needsRehash(hash: String): Boolean = js.native
  @JSImport("argon2", "needsRehash")
  @js.native
  def needsRehash(hash: String, options: Options): Boolean = js.native
  
  @JSImport("argon2", "verify")
  @js.native
  def verify(hash: String, plain: String): js.Promise[Boolean] = js.native
  @JSImport("argon2", "verify")
  @js.native
  def verify(hash: String, plain: String, options: Options): js.Promise[Boolean] = js.native
  @JSImport("argon2", "verify")
  @js.native
  def verify(hash: String, plain: Buffer): js.Promise[Boolean] = js.native
  @JSImport("argon2", "verify")
  @js.native
  def verify(hash: String, plain: Buffer, options: Options): js.Promise[Boolean] = js.native
  
  @js.native
  trait NumericLimit extends StObject {
    
    var max: Double = js.native
    
    var min: Double = js.native
  }
  object NumericLimit {
    
    @scala.inline
    def apply(max: Double, min: Double): NumericLimit = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumericLimit]
    }
    
    @scala.inline
    implicit class NumericLimitMutableBuilder[Self <: NumericLimit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionLimits extends StObject {
    
    var hashLength: NumericLimit = js.native
    
    var memoryCost: NumericLimit = js.native
    
    var parallelism: NumericLimit = js.native
    
    var timeCost: NumericLimit = js.native
  }
  object OptionLimits {
    
    @scala.inline
    def apply(
      hashLength: NumericLimit,
      memoryCost: NumericLimit,
      parallelism: NumericLimit,
      timeCost: NumericLimit
    ): OptionLimits = {
      val __obj = js.Dynamic.literal(hashLength = hashLength.asInstanceOf[js.Any], memoryCost = memoryCost.asInstanceOf[js.Any], parallelism = parallelism.asInstanceOf[js.Any], timeCost = timeCost.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionLimits]
    }
    
    @scala.inline
    implicit class OptionLimitsMutableBuilder[Self <: OptionLimits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashLength(value: NumericLimit): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryCost(value: NumericLimit): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelism(value: NumericLimit): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCost(value: NumericLimit): Self = StObject.set(x, "timeCost", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var associatedData: js.UndefOr[Buffer] = js.native
    
    var hashLength: js.UndefOr[Double] = js.native
    
    var memoryCost: js.UndefOr[Double] = js.native
    
    var parallelism: js.UndefOr[Double] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
    
    var salt: js.UndefOr[Buffer] = js.native
    
    var saltLength: js.UndefOr[Double] = js.native
    
    var secret: js.UndefOr[Buffer] = js.native
    
    var timeCost: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[`0` | `1` | `2`] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssociatedData(value: Buffer): Self = StObject.set(x, "associatedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatedDataUndefined: Self = StObject.set(x, "associatedData", js.undefined)
      
      @scala.inline
      def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashLengthUndefined: Self = StObject.set(x, "hashLength", js.undefined)
      
      @scala.inline
      def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
      
      @scala.inline
      def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setSalt(value: Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setSecret(value: Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setTimeCost(value: Double): Self = StObject.set(x, "timeCost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCostUndefined: Self = StObject.set(x, "timeCost", js.undefined)
      
      @scala.inline
      def setType(value: `0` | `1` | `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
