package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailAssertion extends js.Object {
  /** Fail the test. */
  def apply(): scala.Unit = js.native
  def apply(message: java.lang.String): scala.Unit = js.native
  /** Skip this assertion. */
  def skip(): scala.Unit = js.native
  def skip(message: java.lang.String): scala.Unit = js.native
}

