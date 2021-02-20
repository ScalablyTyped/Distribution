package typings.angular.mod

import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// IntervalService
// see http://docs.angularjs.org/api/ng/service/$interval
///////////////////////////////////////////////////////////////////////////
@js.native
trait IIntervalService extends StObject {
  
  def apply(
    func: Function,
    delay: Double,
    count: js.UndefOr[scala.Nothing],
    invokeApply: js.UndefOr[scala.Nothing],
    args: js.Any*
  ): IPromise[_] = js.native
  def apply(
    func: Function,
    delay: Double,
    count: js.UndefOr[scala.Nothing],
    invokeApply: Boolean,
    args: js.Any*
  ): IPromise[_] = js.native
  def apply(
    func: Function,
    delay: Double,
    count: Double,
    invokeApply: js.UndefOr[scala.Nothing],
    args: js.Any*
  ): IPromise[_] = js.native
  def apply(func: Function, delay: Double, count: Double, invokeApply: Boolean, args: js.Any*): IPromise[_] = js.native
  
  def cancel(promise: IPromise[_]): Boolean = js.native
}
