package typings.adone.adoneNs.shaniNs.INs

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
  def apply(description: String, callback: TestCallback): Unit = js.native
  def apply(description: String, options: TestOptions, callback: TestCallback): Unit = js.native
  /**
    * Mark this test as inclusive
    */
  def only(description: String, callback: TestCallback): Unit = js.native
  /**
    * Mark this test as inclusive
    */
  def only(description: String, options: TestOptions, callback: TestCallback): Unit = js.native
  /**
    * Mark this test as exclusive
    */
  def skip(description: String, callback: TestCallback): Unit = js.native
  /**
    * Mark this test as exclusive
    */
  def skip(description: String, options: TestOptions, callback: TestCallback): Unit = js.native
  /**
    * Mark this test as todo
    */
  def todo(description: String, callback: TestCallback): Unit = js.native
  /**
    * Mark this test as todo
    */
  def todo(description: String, options: TestOptions, callback: TestCallback): Unit = js.native
}

