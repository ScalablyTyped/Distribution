package typings
package adoneLib.adoneNs.assertionNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectFunction extends js.Object {
  def apply(value: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy): MockAssertions = js.native
  def apply(value: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy, message: java.lang.String): MockAssertions = js.native
  def apply(value: js.Any): Assertion = js.native
  def apply(value: js.Any, message: java.lang.String): Assertion = js.native
  def fail(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: js.Any): scala.Unit = js.native
}

