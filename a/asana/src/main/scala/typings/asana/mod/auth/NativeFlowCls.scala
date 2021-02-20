package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("asana", "auth.NativeFlow")
@js.native
class NativeFlowCls protected () extends NativeFlow {
  /**
    * An Oauth flow that can be run from the console or an app that does
    * not have the ability to open and manage a browser on its own.
    * @param {Object} options
    * @option {App} app App to authenticate for
    * @option {String function(String)} [instructions] Function returning the
    *     instructions to output to the user. Passed the authorize url.
    * @option {String function()} [prompt] String to output immediately before
    *     waiting for a line from stdin.
    * @constructor
    */
  def this(options: js.Any) = this()
}
