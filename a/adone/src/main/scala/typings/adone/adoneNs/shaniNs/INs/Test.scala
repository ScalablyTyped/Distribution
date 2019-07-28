package typings.adone.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.shani.I.Test")
@js.native
class Test protected () extends js.Object {
  def this(
    description: String,
    callback: TestCallback,
    block: Block,
    runtimeContext: js.Object,
    options: TestOptions
  ) = this()
  var description: String = js.native
  /**
    * Returns a string of names from the root to this test
    */
  def chain(): String = js.native
  /**
    * Checks if this test is exclusive (has skip flag)
    */
  def isExclusive(): Boolean = js.native
  /**
    * Checks if this test is exclusive (has only flag)
    */
  def isInclusive(): Boolean = js.native
  /**
    * Marks this test as inclusive
    */
  def only(): this.type = js.native
  /**
    * Handles params from options
    */
  def prepare(): js.Promise[Unit] = js.native
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
  def timeout(): Double | Null = js.native
  /**
    * Sets a timeout for this test
    */
  def timeout(ms: Double): this.type = js.native
  /**
    * Marks this test as todo
    */
  def todo(): this.type = js.native
}

