package typings.audiobufferToWav

import typings.std.ArrayBuffer
import typings.std.AudioBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(buffer: AudioBuffer): ArrayBuffer = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  inline def apply(buffer: AudioBuffer, options: Options): ArrayBuffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
  
  @JSImport("audiobuffer-to-wav", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var float32: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFloat32(value: Boolean): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      inline def setFloat32Undefined: Self = StObject.set(x, "float32", js.undefined)
    }
  }
}
