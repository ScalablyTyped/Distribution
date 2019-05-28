package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassBenchmark
  extends org.scalablytyped.runtime.Instantiable1[/* fn */ js.Function, adoneLib.benchmarkMod.Benchmark] {
  var options: benchmarkLib.benchmarkMod.Options = js.native
  var platform: benchmarkLib.benchmarkMod.Platform = js.native
  var support: benchmarkLib.benchmarkMod.Support = js.native
  var version: java.lang.String = js.native
  def deepClone[T](value: T): T = js.native
  def each(obj: js.Array[_], callback: js.Function): scala.Unit = js.native
  def each(obj: js.Array[_], callback: js.Function, thisArg: js.Any): scala.Unit = js.native
  def each(obj: js.Object, callback: js.Function): scala.Unit = js.native
  def each(obj: js.Object, callback: js.Function, thisArg: js.Any): scala.Unit = js.native
  def extend(destination: js.Object, sources: js.Object*): js.Object = js.native
  def filter[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _]): js.Array[T] = js.native
  def filter[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _], thisArg: js.Any): js.Array[T] = js.native
  def filter[T](arr: js.Array[T], filter: java.lang.String): js.Array[T] = js.native
  def filter[T](arr: js.Array[T], filter: java.lang.String, thisArg: js.Any): js.Array[T] = js.native
  def forEach[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _]): scala.Unit = js.native
  def forEach[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _], thisArg: js.Any): scala.Unit = js.native
  def forOwn(obj: js.Object, callback: js.Function): scala.Unit = js.native
  def forOwn(obj: js.Object, callback: js.Function, thisArg: js.Any): scala.Unit = js.native
  def formatNumber(num: scala.Double): java.lang.String = js.native
  def hasKey(obj: js.Object, key: java.lang.String): scala.Boolean = js.native
  def indexOf[T](arr: js.Array[T], value: T): scala.Double = js.native
  def indexOf[T](arr: js.Array[T], value: T, fromIndex: scala.Double): scala.Double = js.native
  def interpolate(template: java.lang.String, values: js.Object): java.lang.String = js.native
  def invoke(benches: js.Array[benchmarkLib.benchmarkMod.Benchmark], name: java.lang.String, args: js.Any*): js.Array[_] = js.native
  def invoke(benches: js.Array[benchmarkLib.benchmarkMod.Benchmark], name: js.Object, args: js.Any*): js.Array[_] = js.native
  def join(obj: js.Object): java.lang.String = js.native
  def join(obj: js.Object, separator1: java.lang.String): java.lang.String = js.native
  def join(obj: js.Object, separator1: java.lang.String, separator2: java.lang.String): java.lang.String = js.native
  def map[T, K](arr: js.Array[T], callback: js.Function1[/* value */ T, K]): js.Array[K] = js.native
  def map[T, K](arr: js.Array[T], callback: js.Function1[/* value */ T, K], thisArg: js.Any): js.Array[K] = js.native
  def pluck[T, K](arr: js.Array[T], key: java.lang.String): js.Array[K] = js.native
  def reduce[T, K](arr: js.Array[T], callback: js.Function2[/* accumulator */ K, /* value */ T, K]): K = js.native
  def reduce[T, K](arr: js.Array[T], callback: js.Function2[/* accumulator */ K, /* value */ T, K], thisArg: js.Any): K = js.native
}

