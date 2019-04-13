package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrueAssertion extends js.Object {
  /** Assert that `actual` is strictly true. */
  def apply(actual: js.Any): scala.Unit = js.native
  def apply(actual: js.Any, message: java.lang.String): scala.Unit = js.native
  /** Skip this assertion. */
  def skip(actual: js.Any): scala.Unit = js.native
  def skip(actual: js.Any, message: java.lang.String): scala.Unit = js.native
}

