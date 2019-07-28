package typings.adone.benchmarkMod

import typings.benchmark.benchmarkMod.Options
import typings.benchmark.benchmarkMod.Platform
import typings.benchmark.benchmarkMod.Support
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/benchmark", "Benchmark")
@js.native
class Benchmark protected ()
  extends typings.benchmark.benchmarkMod.^ {
  def this(fn: String) = this()
  def this(fn: js.Function) = this()
  def this(options: Options) = this()
  def this(fn: String, options: Options) = this()
  def this(fn: js.Function, options: Options) = this()
  def this(name: String, fn: String) = this()
  def this(name: String, fn: js.Function) = this()
  def this(name: String, fn: String, options: Options) = this()
  def this(name: String, fn: js.Function, options: Options) = this()
}

/* static members */
@JSImport("adone/benchmark", "Benchmark")
@js.native
object Benchmark extends js.Object {
  var options: Options = js.native
  var platform: Platform = js.native
  var support: Support = js.native
  var version: String = js.native
  def deepClone[T](value: T): T = js.native
  def each(obj: js.Array[_], callback: js.Function): Unit = js.native
  def each(obj: js.Array[_], callback: js.Function, thisArg: js.Any): Unit = js.native
  def each(obj: js.Object, callback: js.Function): Unit = js.native
  def each(obj: js.Object, callback: js.Function, thisArg: js.Any): Unit = js.native
  def extend(destination: js.Object, sources: js.Object*): js.Object = js.native
  def filter[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _]): js.Array[T] = js.native
  def filter[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _], thisArg: js.Any): js.Array[T] = js.native
  def filter[T](arr: js.Array[T], filter: String): js.Array[T] = js.native
  def filter[T](arr: js.Array[T], filter: String, thisArg: js.Any): js.Array[T] = js.native
  def forEach[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _]): Unit = js.native
  def forEach[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _], thisArg: js.Any): Unit = js.native
  def forOwn(obj: js.Object, callback: js.Function): Unit = js.native
  def forOwn(obj: js.Object, callback: js.Function, thisArg: js.Any): Unit = js.native
  def formatNumber(num: Double): String = js.native
  def hasKey(obj: js.Object, key: String): Boolean = js.native
  def indexOf[T](arr: js.Array[T], value: T): Double = js.native
  def indexOf[T](arr: js.Array[T], value: T, fromIndex: Double): Double = js.native
  def interpolate(template: String, values: js.Object): String = js.native
  def invoke(benches: js.Array[typings.benchmark.benchmarkMod.Benchmark], name: String, args: js.Any*): js.Array[_] = js.native
  def invoke(benches: js.Array[typings.benchmark.benchmarkMod.Benchmark], name: js.Object, args: js.Any*): js.Array[_] = js.native
  def join(obj: js.Object): String = js.native
  def join(obj: js.Object, separator1: String): String = js.native
  def join(obj: js.Object, separator1: String, separator2: String): String = js.native
  def map[T, K](arr: js.Array[T], callback: js.Function1[/* value */ T, K]): js.Array[K] = js.native
  def map[T, K](arr: js.Array[T], callback: js.Function1[/* value */ T, K], thisArg: js.Any): js.Array[K] = js.native
  def pluck[T, K](arr: js.Array[T], key: String): js.Array[K] = js.native
  def reduce[T, K](arr: js.Array[T], callback: js.Function2[/* accumulator */ K, /* value */ T, K]): K = js.native
  def reduce[T, K](arr: js.Array[T], callback: js.Function2[/* accumulator */ K, /* value */ T, K], thisArg: js.Any): K = js.native
}

