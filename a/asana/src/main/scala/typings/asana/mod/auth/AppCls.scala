package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("asana", "auth.App")
@js.native
class AppCls protected ()
  extends typings.asana.mod.auth.App {
  /**
    * An abstraction around an App used with Asana.
    *
    * @options {Object} Options to construct the app
    * @option {String} clientId       The ID of the app
    * @option {String} [clientSecret] The secret key, if available here
    * @option {String} [redirectUri]  The default redirect URI
    * @option {String} [scope]        Scope to use, supports `default` and `scim`
    * @option {String} [asanaBaseUrl] Base URL to use for Asana, for debugging
    * @constructor
    */
  def this(options: AppOptions) = this()
}
