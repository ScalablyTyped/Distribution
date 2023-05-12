package typings.asana.mod.auth

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("asana", "auth.OauthError")
@js.native
open class OauthErrorCls protected ()
  extends StObject
     with Error {
  /**
    * @param options {Object} A data blob parsed from a query string or JSON
    * response from the Asana API
    * @option {String} error The string code identifying the error.
    * @option {String} [error_uri] A link to help and information about the error.
    * @option {String} [error_description] A description of the error.
    */
  def this(options: OauthErrorOptions) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
