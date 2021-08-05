package typings.argon2Browser

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("argon2-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ArgonType extends StObject
  @JSImport("argon2-browser", "ArgonType")
  @js.native
  object ArgonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ArgonType & Double] = js.native
    
    @js.native
    sealed trait Argon2d
      extends StObject
         with ArgonType
    /* 0 */ val Argon2d: typings.argon2Browser.mod.ArgonType.Argon2d & Double = js.native
    
    @js.native
    sealed trait Argon2i
      extends StObject
         with ArgonType
    /* 1 */ val Argon2i: typings.argon2Browser.mod.ArgonType.Argon2i & Double = js.native
    
    @js.native
    sealed trait Argon2id
      extends StObject
         with ArgonType
    /* 2 */ val Argon2id: typings.argon2Browser.mod.ArgonType.Argon2id & Double = js.native
  }
  
  inline def hash(options: Argon2BrowserHashOptions): js.Promise[Argon2BrowserHashResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Argon2BrowserHashResult]]
  
  inline def unloadRuntime(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadRuntime")().asInstanceOf[Unit]
  
  inline def verify(options: Argon2VerifyOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait Argon2BrowserHashOptions extends StObject {
    
    var distPath: js.UndefOr[String] = js.undefined
    
    var hashLen: js.UndefOr[Double] = js.undefined
    
    var mem: js.UndefOr[Double] = js.undefined
    
    var parallelism: js.UndefOr[Double] = js.undefined
    
    var pass: String | Uint8Array
    
    var salt: String | Uint8Array
    
    var time: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[ArgonType] = js.undefined
  }
  object Argon2BrowserHashOptions {
    
    inline def apply(pass: String | Uint8Array, salt: String | Uint8Array): Argon2BrowserHashOptions = {
      val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argon2BrowserHashOptions]
    }
    
    extension [Self <: Argon2BrowserHashOptions](x: Self) {
      
      inline def setDistPath(value: String): Self = StObject.set(x, "distPath", value.asInstanceOf[js.Any])
      
      inline def setDistPathUndefined: Self = StObject.set(x, "distPath", js.undefined)
      
      inline def setHashLen(value: Double): Self = StObject.set(x, "hashLen", value.asInstanceOf[js.Any])
      
      inline def setHashLenUndefined: Self = StObject.set(x, "hashLen", js.undefined)
      
      inline def setMem(value: Double): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
      
      inline def setMemUndefined: Self = StObject.set(x, "mem", js.undefined)
      
      inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
      
      inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
      
      inline def setPass(value: String | Uint8Array): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String | Uint8Array): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setType(value: ArgonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Argon2BrowserHashResult extends StObject {
    
    var encoded: String
    
    var hash: Uint8Array
    
    var hashHex: String
  }
  object Argon2BrowserHashResult {
    
    inline def apply(encoded: String, hash: Uint8Array, hashHex: String): Argon2BrowserHashResult = {
      val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hashHex = hashHex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argon2BrowserHashResult]
    }
    
    extension [Self <: Argon2BrowserHashResult](x: Self) {
      
      inline def setEncoded(value: String): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
      
      inline def setHash(value: Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashHex(value: String): Self = StObject.set(x, "hashHex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Argon2Error extends StObject {
    
    var code: Double
    
    var message: String
  }
  object Argon2Error {
    
    inline def apply(code: Double, message: String): Argon2Error = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argon2Error]
    }
    
    extension [Self <: Argon2Error](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Argon2VerifyOptions extends StObject {
    
    var encoded: String | Uint8Array
    
    var pass: String
    
    var `type`: js.UndefOr[ArgonType] = js.undefined
  }
  object Argon2VerifyOptions {
    
    inline def apply(encoded: String | Uint8Array, pass: String): Argon2VerifyOptions = {
      val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argon2VerifyOptions]
    }
    
    extension [Self <: Argon2VerifyOptions](x: Self) {
      
      inline def setEncoded(value: String | Uint8Array): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setType(value: ArgonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
