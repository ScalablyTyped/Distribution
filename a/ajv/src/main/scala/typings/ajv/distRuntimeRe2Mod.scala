package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import typings.re2.mod.RE2
import typings.re2.mod.RE2Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRuntimeRe2Mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("ajv/dist/runtime/re2", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RE2 {
    def this(pattern: String) = this()
    def this(pattern: js.RegExp) = this()
    def this(pattern: Buffer) = this()
    def this(pattern: String, flags: String) = this()
    def this(pattern: Buffer, flags: String) = this()
  }
  @JSImport("ajv/dist/runtime/re2", JSImport.Default)
  @js.native
  val default: Re2 = js.native
  
  @js.native
  trait Re2
    extends StObject
       with RE2Constructor {
    
    var code: String = js.native
  }
  
  type _To = Re2
  
  /* This means you don't have to write `default`, but can instead just say `distRuntimeRe2Mod.foo` */
  override def _to: Re2 = default
}
