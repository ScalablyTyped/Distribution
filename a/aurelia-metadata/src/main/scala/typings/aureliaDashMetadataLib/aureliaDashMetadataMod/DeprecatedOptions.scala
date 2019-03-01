package typings
package aureliaDashMetadataLib.aureliaDashMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedOptions extends js.Object {
  /**
    * Specifies whether or not the deprecation should throw an error.
    */
  var error: scala.Boolean
  /**
    * Specifies a custom deprecation message.
    */
  var message: java.lang.String
}

object DeprecatedOptions {
  @scala.inline
  def apply(error: scala.Boolean, message: java.lang.String): DeprecatedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[DeprecatedOptions]
  }
}

