package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CbExecutionContext[Context] extends ExecutionContext[Context] {
  /**
  	 * End the test. If `error` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy) the test or hook
  	 * will fail.
  	 */
  def end(): scala.Unit = js.native
  def end(error: js.Any): scala.Unit = js.native
}

