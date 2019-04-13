package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanFn extends js.Object {
  /**
  	 * Plan how many assertion there are in the test. The test will fail if the actual assertion count doesn't match the
  	 * number of planned assertions. See [assertion planning](https://github.com/avajs/ava#assertion-planning).
  	 */
  def apply(count: scala.Double): scala.Unit = js.native
  /** Don't plan assertions. */
  def skip(count: scala.Double): scala.Unit = js.native
}

