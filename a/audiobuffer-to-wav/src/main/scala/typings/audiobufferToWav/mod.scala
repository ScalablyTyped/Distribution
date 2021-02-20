package typings.audiobufferToWav

import typings.std.ArrayBuffer
import typings.std.AudioBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("audiobuffer-to-wav", JSImport.Namespace)
  @js.native
  def apply(buffer: AudioBuffer): ArrayBuffer = js.native
  @JSImport("audiobuffer-to-wav", JSImport.Namespace)
  @js.native
  def apply(buffer: AudioBuffer, options: Options): ArrayBuffer = js.native
  
  @js.native
  trait Options extends StObject {
    
    var float32: js.UndefOr[Boolean] = js.native
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
      def setFloat32(value: Boolean): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloat32Undefined: Self = StObject.set(x, "float32", js.undefined)
    }
  }
}
