package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.shani.I.Test")
@js.native
class Test protected () extends js.Object {
  def this(description: java.lang.String, callback: TestCallback, block: Block, runtimeContext: js.Object, options: TestOptions) = this()
  var description: java.lang.String = js.native
  /**
                   * Returns a string of names from the root to this test
                   */
  def chain(): java.lang.String = js.native
  /**
                   * Checks if this test is exclusive (has skip flag)
                   */
  def isExclusive(): scala.Boolean = js.native
  /**
                   * Checks if this test is exclusive (has only flag)
                   */
  def isInclusive(): scala.Boolean = js.native
  /**
                   * Marks this test as inclusive
                   */
  def only(): this.type = js.native
  /**
                   * Handles params from options
                   */
  def prepare(): js.Promise[scala.Unit] = js.native
  /**
                   * Executes the test
                   */
  def run(): js.Promise[ExecutionResult] = js.native
  /**
                   * Skips this test
                   */
  def skip(): this.type = js.native
  /**
                   * Returns the timeout of the test
                   */
  def timeout(): scala.Double | scala.Null = js.native
  /**
                   * Sets a timeout for this test
                   */
  def timeout(ms: scala.Double): this.type = js.native
  /**
                   * Marks this test as todo
                   */
  def todo(): this.type = js.native
}

