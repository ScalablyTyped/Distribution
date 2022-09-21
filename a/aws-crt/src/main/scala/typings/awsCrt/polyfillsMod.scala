package typings.awsCrt

import typings.node.anon.Fatal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyfillsMod {
  
  @JSImport("aws-crt/dist/native/polyfills", "TextDecoder")
  @js.native
  open class TextDecoder ()
    extends typings.node.utilMod.TextDecoder {
    def this(encoding: String) = this()
    def this(encoding: String, options: Fatal) = this()
    def this(encoding: Unit, options: Fatal) = this()
  }
  
  @JSImport("aws-crt/dist/native/polyfills", "TextEncoder")
  @js.native
  open class TextEncoder ()
    extends typings.node.utilMod.TextEncoder
}
