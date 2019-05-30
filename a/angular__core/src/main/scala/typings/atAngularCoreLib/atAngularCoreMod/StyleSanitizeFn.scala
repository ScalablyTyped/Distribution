package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to intercept and sanitize style values before they are written to the renderer.
  *
  * This function is designed to be called in two modes. When a value is not provided
  * then the function will return a boolean whether a property will be sanitized later.
  * If a value is provided then the sanitized version of that will be returned.
  */
@js.native
trait StyleSanitizeFn extends js.Object {
  /** This mode is designed to instruct whether the property will be used for sanitization
    * at a later point */
  def apply(prop: java.lang.String): scala.Boolean = js.native
  /** This mode is designed to sanitize the provided value */
  def apply(prop: java.lang.String, value: java.lang.String): java.lang.String = js.native
}

