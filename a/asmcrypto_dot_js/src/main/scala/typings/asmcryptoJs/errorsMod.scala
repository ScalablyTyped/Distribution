package typings.asmcryptoJs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/other/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class IllegalArgumentError protected () extends Error {
    def this(args: js.Any*) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class IllegalStateError protected () extends Error {
    def this(args: js.Any*) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class SecurityError protected () extends Error {
    def this(args: js.Any*) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

