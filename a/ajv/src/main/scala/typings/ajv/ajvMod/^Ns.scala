package typings.ajv.ajvMod

import typings.ajv.ajvNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ajv", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  class ValidationError protected ()
    extends typings.ajv.ajvMod.AjvErrorsNs.ValidationError {
    def this(errors: js.Array[ErrorObject]) = this()
    /* CompleteClass */
    override var ajv: `true` = js.native
    /* CompleteClass */
    override var errors: js.Array[ErrorObject] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var validation: `true` = js.native
  }
  
}

