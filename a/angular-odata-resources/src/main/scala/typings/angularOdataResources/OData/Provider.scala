package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider[T] extends StObject {
  
  /* private */ var callback: Any = js.native
  
  def count(): ICountResult = js.native
  def count(success: js.Function1[/* result */ ICountResult, Any]): ICountResult = js.native
  def count(success: js.Function1[/* result */ ICountResult, Any], error: js.Function0[Any]): ICountResult = js.native
  def count(success: Unit, error: js.Function0[Any]): ICountResult = js.native
  
  /* private */ def execute(): Any = js.native
  
  def expand(params: String*): Provider[T] = js.native
  def expand(params: js.Array[String]): Provider[T] = js.native
  
  /* private */ var expandables: Any = js.native
  
  def filter(operand1: Any): Provider[T] = js.native
  def filter(operand1: Any, operand2: Any): Provider[T] = js.native
  def filter(operand1: Any, operand2: Any, operand3: Any): Provider[T] = js.native
  def filter(operand1: Any, operand2: Unit, operand3: Any): Provider[T] = js.native
  
  /* private */ var filters: Any = js.native
  
  def get(key: Any): T = js.native
  def get(key: Any, success: js.Function1[/* p */ T, Unit]): T = js.native
  def get(key: Any, success: js.Function1[/* p */ T, Unit], error: js.Function0[Unit]): T = js.native
  def get(key: Any, success: Unit, error: js.Function0[Unit]): T = js.native
  
  def orderBy(arg1: String): Provider[T] = js.native
  def orderBy(arg1: String, arg2: String): Provider[T] = js.native
  
  def query(): js.Array[T] = js.native
  def query(success: js.Function1[/* p */ js.Array[T], Unit]): js.Array[T] = js.native
  def query(success: js.Function1[/* p */ js.Array[T], Unit], error: js.Function0[Unit]): js.Array[T] = js.native
  def query(success: Unit, error: js.Function0[Unit]): js.Array[T] = js.native
  
  def select(params: String*): Provider[T] = js.native
  def select(params: js.Array[String]): Provider[T] = js.native
  
  def single(): T = js.native
  def single(success: js.Function1[/* p */ T, Unit]): T = js.native
  def single(success: js.Function1[/* p */ T, Unit], error: js.Function0[Unit]): T = js.native
  def single(success: Unit, error: js.Function0[Unit]): T = js.native
  
  def skip(amount: Double): Provider[T] = js.native
  
  /* private */ var skipAmount: Any = js.native
  
  /* private */ var sortOrders: Any = js.native
  
  def take(amount: Double): Provider[T] = js.native
  
  /* private */ var takeAmount: Any = js.native
  
  def transformUrl(transformMethod: js.Function1[/* url */ String, String]): Provider[T] = js.native
  
  def withInlineCount(): Provider[T] = js.native
}
