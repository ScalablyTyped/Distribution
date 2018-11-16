package typings
package angularDashOdataDashResourcesLib.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OData.Provider")
@js.native
class Provider[T] protected () extends js.Object {
  def this(callback: ProviderCallback[T]) = this()
  var callback: js.Any = js.native
  var expandables: js.Any = js.native
  var filters: js.Any = js.native
  var skipAmount: js.Any = js.native
  var sortOrders: js.Any = js.native
  var takeAmount: js.Any = js.native
  def count(): ICountResult = js.native
  def count(success: js.Function1[/* result */ ICountResult, _]): ICountResult = js.native
  def count(success: js.Function1[/* result */ ICountResult, _], error: js.Function0[_]): ICountResult = js.native
  /* private */ def execute(): js.Any = js.native
  def expand(params: java.lang.String*): Provider[T] = js.native
  def expand(params: js.Array[java.lang.String]): Provider[T] = js.native
  def filter(operand1: js.Any): Provider[T] = js.native
  def filter(operand1: js.Any, operand2: js.Any): Provider[T] = js.native
  def filter(operand1: js.Any, operand2: js.Any, operand3: js.Any): Provider[T] = js.native
  def get(key: js.Any): T = js.native
  def get(key: js.Any, success: js.Function1[/* p */ T, scala.Unit]): T = js.native
  def get(key: js.Any, success: js.Function1[/* p */ T, scala.Unit], error: js.Function0[scala.Unit]): T = js.native
  def orderBy(arg1: java.lang.String): Provider[T] = js.native
  def orderBy(arg1: java.lang.String, arg2: java.lang.String): Provider[T] = js.native
  def query(): js.Array[T] = js.native
  def query(success: js.Function1[/* p */ js.Array[T], scala.Unit]): js.Array[T] = js.native
  def query(success: js.Function1[/* p */ js.Array[T], scala.Unit], error: js.Function0[scala.Unit]): js.Array[T] = js.native
  def select(params: java.lang.String*): Provider[T] = js.native
  def select(params: js.Array[java.lang.String]): Provider[T] = js.native
  def single(): T = js.native
  def single(success: js.Function1[/* p */ T, scala.Unit]): T = js.native
  def single(success: js.Function1[/* p */ T, scala.Unit], error: js.Function0[scala.Unit]): T = js.native
  def skip(amount: scala.Double): Provider[T] = js.native
  def take(amount: scala.Double): Provider[T] = js.native
  def transformUrl(transformMethod: js.Function1[/* url */ java.lang.String, java.lang.String]): Provider[T] = js.native
  def withInlineCount(): Provider[T] = js.native
}

