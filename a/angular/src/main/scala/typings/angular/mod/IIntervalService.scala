package typings.angular.mod

import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// IntervalService
// see http://docs.angularjs.org/api/ng/service/$interval
///////////////////////////////////////////////////////////////////////////
@js.native
trait IIntervalService extends StObject {
  
  def apply(func: Function, delay: Double, count: Double, invokeApply: Boolean, args: Any*): IPromise[Any] = js.native
  def apply(func: Function, delay: Double, count: Double, invokeApply: Unit, args: Any*): IPromise[Any] = js.native
  def apply(func: Function, delay: Double, count: Unit, invokeApply: Boolean, args: Any*): IPromise[Any] = js.native
  def apply(func: Function, delay: Double, count: Unit, invokeApply: Unit, args: Any*): IPromise[Any] = js.native
  
  def cancel(promise: IPromise[Any]): Boolean = js.native
}
