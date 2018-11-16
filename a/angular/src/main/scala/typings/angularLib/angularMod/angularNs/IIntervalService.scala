package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// IntervalService
// see http://docs.angularjs.org/api/ng.$interval
///////////////////////////////////////////////////////////////////////////
@js.native
trait IIntervalService extends js.Object {
  def apply(func: js.Function, delay: scala.Double): IPromise[_] = js.native
  def apply(func: js.Function, delay: scala.Double, count: scala.Double): IPromise[_] = js.native
  def apply(
    func: js.Function,
    delay: scala.Double,
    count: scala.Double,
    invokeApply: scala.Boolean,
    args: js.Any*
  ): IPromise[_] = js.native
  def cancel(promise: IPromise[_]): scala.Boolean = js.native
}

