package typings.argon2Browser

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait ArgonType extends StObject
  @JSImport("argon2-browser", "ArgonType")
  @js.native
  object ArgonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ArgonType with Double] = js.native
    
    @js.native
    sealed trait Argon2d extends ArgonType
    /* 0 */ val Argon2d: typings.argon2Browser.mod.ArgonType.Argon2d with Double = js.native
    
    @js.native
    sealed trait Argon2i extends ArgonType
    /* 1 */ val Argon2i: typings.argon2Browser.mod.ArgonType.Argon2i with Double = js.native
    
    @js.native
    sealed trait Argon2id extends ArgonType
    /* 2 */ val Argon2id: typings.argon2Browser.mod.ArgonType.Argon2id with Double = js.native
  }
  
  @JSImport("argon2-browser", "hash")
  @js.native
  def hash(options: Argon2BrowserHashOptions): js.Promise[Argon2BrowserHashResult] = js.native
  
  @JSImport("argon2-browser", "unloadRuntime")
  @js.native
  def unloadRuntime(): Unit = js.native
  
  @JSImport("argon2-browser", "verify")
  @js.native
  def verify(options: Argon2VerifyOptions): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  
  @js.native
  trait Argon2BrowserHashOptions extends StObject {
    
    var distPath: js.UndefOr[String] = js.native
    
    var hashLen: js.UndefOr[Double] = js.native
    
    var mem: js.UndefOr[Double] = js.native
    
    var parallelism: js.UndefOr[Double] = js.native
    
    var pass: String | Uint8Array = js.native
    
    var salt: String | Uint8Array = js.native
    
    var time: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[ArgonType] = js.native
  }
  object Argon2BrowserHashOptions {
    
    @scala.inline
    def apply(pass: String | Uint8Array, salt: String | Uint8Array): Argon2BrowserHashOptions = {
      val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argon2BrowserHashOptions]
    }
    
    @scala.inline
    implicit class Argon2BrowserHashOptionsMutableBuilder[Self <: Argon2BrowserHashOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistPath(value: String): Self = StObject.set(x, "distPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistPathUndefined: Self = StObject.set(x, "distPath", js.undefined)
      
      @scala.inline
      def setHashLen(value: Double): Self = StObject.set(x, "hashLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashLenUndefined: Self = StObject.set(x, "hashLen", js.undefined)
      
      @scala.inline
      def setMem(value: Double): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemUndefined: Self = StObject.set(x, "mem", js.undefined)
      
      @scala.inline
      def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
      
      @scala.inline
      def setPass(value: String | Uint8Array): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String | Uint8Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setType(value: ArgonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Argon2BrowserHashResult extends StObject {
    
    var encoded: String = js.native
    
    var hash: Uint8Array = js.native
    
    var hashHex: String = js.native
  }
  object Argon2BrowserHashResult {
    
    @scala.inline
    def apply(encoded: String, hash: Uint8Array, hashHex: String): Argon2BrowserHashResult = {
      val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hashHex = hashHex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argon2BrowserHashResult]
    }
    
    @scala.inline
    implicit class Argon2BrowserHashResultMutableBuilder[Self <: Argon2BrowserHashResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoded(value: String): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashHex(value: String): Self = StObject.set(x, "hashHex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Argon2Error extends StObject {
    
    var code: Double = js.native
    
    var message: String = js.native
  }
  object Argon2Error {
    
    @scala.inline
    def apply(code: Double, message: String): Argon2Error = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argon2Error]
    }
    
    @scala.inline
    implicit class Argon2ErrorMutableBuilder[Self <: Argon2Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Argon2VerifyOptions extends StObject {
    
    var encoded: String | Uint8Array = js.native
    
    var pass: String = js.native
    
    var `type`: js.UndefOr[ArgonType] = js.native
  }
  object Argon2VerifyOptions {
    
    @scala.inline
    def apply(encoded: String | Uint8Array, pass: String): Argon2VerifyOptions = {
      val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argon2VerifyOptions]
    }
    
    @scala.inline
    implicit class Argon2VerifyOptionsMutableBuilder[Self <: Argon2VerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoded(value: String | Uint8Array): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ArgonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
