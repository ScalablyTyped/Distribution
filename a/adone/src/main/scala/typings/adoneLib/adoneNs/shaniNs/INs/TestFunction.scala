package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestFunction extends js.Object {
  /**
                   * Mark this test as inclusive
                   */
  @JSName("only")
  var only_Original: TestFunction = js.native
  /**
                   * Mark this test as exclusive
                   */
  @JSName("skip")
  var skip_Original: TestFunction = js.native
  /**
                   * Mark this test as todo
                   */
  @JSName("todo")
  var todo_Original: TestFunction = js.native
  def apply(description: java.lang.String, callback: TestCallback): scala.Unit = js.native
  def apply(description: java.lang.String, options: TestOptions, callback: TestCallback): scala.Unit = js.native
  /**
                   * Mark this test as inclusive
                   */
  def only(description: java.lang.String, callback: TestCallback): scala.Unit = js.native
  /**
                   * Mark this test as inclusive
                   */
  def only(description: java.lang.String, options: TestOptions, callback: TestCallback): scala.Unit = js.native
  /**
                   * Mark this test as exclusive
                   */
  def skip(description: java.lang.String, callback: TestCallback): scala.Unit = js.native
  /**
                   * Mark this test as exclusive
                   */
  def skip(description: java.lang.String, options: TestOptions, callback: TestCallback): scala.Unit = js.native
  /**
                   * Mark this test as todo
                   */
  def todo(description: java.lang.String, callback: TestCallback): scala.Unit = js.native
  /**
                   * Mark this test as todo
                   */
  def todo(description: java.lang.String, options: TestOptions, callback: TestCallback): scala.Unit = js.native
}

