package typings.adone.adoneNs.assertionNs.INs

import typings.adone.adoneNs.shaniNs.utilNs.INs.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectFunction extends js.Object {
  def apply(value: js.Any): Assertion = js.native
  def apply(value: js.Any, message: String): Assertion = js.native
  def apply(value: Spy): MockAssertions = js.native
  def apply(value: Spy, message: String): MockAssertions = js.native
  def fail(actual: js.Any, expected: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: js.Any): Unit = js.native
}

