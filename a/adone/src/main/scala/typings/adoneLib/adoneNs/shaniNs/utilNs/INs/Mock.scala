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

object Mock {
  @scala.inline
  def apply(expects: java.lang.String => Expectation, restore: () => scala.Unit, verify: () => scala.Unit): Mock = {
    val __obj = js.Dynamic.literal(expects = js.Any.fromFunction1(expects), restore = js.Any.fromFunction0(restore), verify = js.Any.fromFunction0(verify))
  
    __obj.asInstanceOf[Mock]
  }
}

