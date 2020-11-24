package typings.angularOdataResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider[T] extends js.Object {
  
  var callback: js.Any = js.native
  
  def count(): ICountResult = js.native
  def count(success: js.UndefOr[scala.Nothing], error: js.Function0[_]): ICountResult = js.native
  def count(success: js.Function1[/* result */ ICountResult, _]): ICountResult = js.native
  def count(success: js.Function1[/* result */ ICountResult, _], error: js.Function0[_]): ICountResult = js.native
  
  /* private */ def execute(): js.Any = js.native
  
  def expand(params: String*): Provider[T] = js.native
  def expand(params: js.Array[String]): Provider[T] = js.native
  
  var expandables: js.Any = js.native
  
  def filter(operand1: js.Any): Provider[T] = js.native
  def filter(operand1: js.Any, operand2: js.UndefOr[scala.Nothing], operand3: js.Any): Provider[T] = js.native
  def filter(operand1: js.Any, operand2: js.Any): Provider[T] = js.native
  def filter(operand1: js.Any, operand2: js.Any, operand3: js.Any): Provider[T] = js.native
  
  var filters: js.Any = js.native
  
  def get(key: js.Any): T = js.native
  def get(key: js.Any, success: js.UndefOr[scala.Nothing], error: js.Function0[Unit]): T = js.native
  def get(key: js.Any, success: js.Function1[/* p */ T, Unit]): T = js.native
  def get(key: js.Any, success: js.Function1[/* p */ T, Unit], error: js.Function0[Unit]): T = js.native
  
  def orderBy(arg1: String): Provider[T] = js.native
  def orderBy(arg1: String, arg2: String): Provider[T] = js.native
  
  def query(): js.Array[T] = js.native
  def query(success: js.UndefOr[scala.Nothing], error: js.Function0[Unit]): js.Array[T] = js.native
  def query(success: js.Function1[/* p */ js.Array[T], Unit]): js.Array[T] = js.native
  def query(success: js.Function1[/* p */ js.Array[T], Unit], error: js.Function0[Unit]): js.Array[T] = js.native
  
  def select(params: String*): Provider[T] = js.native
  def select(params: js.Array[String]): Provider[T] = js.native
  
  def single(): T = js.native
  def single(success: js.UndefOr[scala.Nothing], error: js.Function0[Unit]): T = js.native
  def single(success: js.Function1[/* p */ T, Unit]): T = js.native
  def single(success: js.Function1[/* p */ T, Unit], error: js.Function0[Unit]): T = js.native
  
  def skip(amount: Double): Provider[T] = js.native
  
  var skipAmount: js.Any = js.native
  
  var sortOrders: js.Any = js.native
  
  def take(amount: Double): Provider[T] = js.native
  
  var takeAmount: js.Any = js.native
  
  def transformUrl(transformMethod: js.Function1[/* url */ String, String]): Provider[T] = js.native
  
  def withInlineCount(): Provider[T] = js.native
}
