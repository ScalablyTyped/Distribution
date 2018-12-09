package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.shani.I.Hook")
@js.native
class Hook protected () extends js.Object {
  def this(description: java.lang.String, callback: HookCallback, runtimeContext: js.Object) = this()
  var desctiption: java.lang.String = js.native
  /**
                   * The cause of the fail
                   */
  def cause(): js.Any = js.native
  /**
                   * Check if this hook failed
                   */
  def failed(): scala.Boolean = js.native
  /**
                   * Check if this hook has been run
                   */
  def fired(): scala.Boolean = js.native
  /**
                   * Executes the hook
                   */
  def run(): js.Promise[ExecutionResult] = js.native
  /**
                   * Returns the timeout of the hook
                   */
  def timeout(): scala.Double = js.native
  /**
                   * Seta a timeout for this hook
                   */
  def timeout(ms: scala.Double): this.type = js.native
}

