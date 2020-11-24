package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQProvider extends js.Object {
  
  /**
    * Retrieves or overrides whether to generate an error when a rejected promise is not handled.
    * This feature is enabled by default.
    *
    * @returns Current value
    */
  def errorOnUnhandledRejections(): Boolean = js.native
  /**
    * Retrieves or overrides whether to generate an error when a rejected promise is not handled.
    * This feature is enabled by default.
    *
    * @param value Whether to generate an error when a rejected promise is not handled.
    * @returns Self for chaining otherwise.
    */
  def errorOnUnhandledRejections(value: Boolean): IQProvider = js.native
}
