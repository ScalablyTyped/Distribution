package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ajv", JSImport.Namespace)
@js.native
object namespacedNs extends js.Object {
  @js.native
  class ValidationError protected ()
    extends ajvLib.ajvMod.AjvErrorsNs.ValidationError {
    def this(errors: js.Array[ajvLib.ajvMod.ajvNs.ErrorObject]) = this()
    /* CompleteClass */
    override var ajv: ajvLib.ajvLibNumbers.`true` = js.native
    /* CompleteClass */
    override var errors: js.Array[ajvLib.ajvMod.ajvNs.ErrorObject] = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var validation: ajvLib.ajvLibNumbers.`true` = js.native
  }
  
}

