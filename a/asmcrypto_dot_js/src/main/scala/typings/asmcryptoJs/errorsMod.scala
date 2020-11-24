package typings.asmcryptoJs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/other/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class IllegalArgumentError protected () extends Error {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class IllegalStateError protected () extends Error {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class SecurityError protected () extends Error {
    def this(args: js.Any*) = this()
  }
}
