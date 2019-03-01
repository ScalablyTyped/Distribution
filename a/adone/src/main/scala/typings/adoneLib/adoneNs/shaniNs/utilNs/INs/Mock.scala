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
  def apply(
    expects: js.Function1[java.lang.String, Expectation],
    restore: js.Function0[scala.Unit],
    verify: js.Function0[scala.Unit]
  ): Mock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expects")(expects)
    __obj.updateDynamic("restore")(restore)
    __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[Mock]
  }
}

