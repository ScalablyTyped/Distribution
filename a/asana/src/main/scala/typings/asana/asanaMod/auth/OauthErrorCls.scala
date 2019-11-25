package typings.asana.asanaMod.auth

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asana", "auth.OauthError")
@js.native
class OauthErrorCls protected () extends Error {
  /**
    * @param options {Object} A data blob parsed from a query string or JSON
    * response from the Asana API
    * @option {String} error The string code identifying the error.
    * @option {String} [error_uri] A link to help and information about the error.
    * @option {String} [error_description] A description of the error.
    * @constructor
    */
  def this(options: OauthErrorOptions) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

