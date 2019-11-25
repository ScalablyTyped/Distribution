package typings.aureliaDashMetadata.aureliaDashMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedOptions extends js.Object {
  /**
    * Specifies whether or not the deprecation should throw an error.
    */
  var error: Boolean
  /**
    * Specifies a custom deprecation message.
    */
  var message: String
}

object DeprecatedOptions {
  @scala.inline
  def apply(error: Boolean, message: String): DeprecatedOptions = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeprecatedOptions]
  }
}

