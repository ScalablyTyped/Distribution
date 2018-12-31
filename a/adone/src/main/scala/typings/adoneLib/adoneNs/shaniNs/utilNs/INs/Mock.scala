package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mock extends js.Object {
  /**
    * Overrides obj.method with a mock function and returns it
    */
  def expects(method: java.lang.String): Expectation
  /**
    * Restores all mocked methods
    */
  def restore(): scala.Unit
  /**
    * Verifies all expectations on the mock
    */
  def verify(): scala.Unit
}

