package typings.apolloDashEnv.libFetchUrlMod

import typings.apolloDashEnv.libPolyfillsArrayMod.Global.Array
import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/url", "URLSearchParams")
@js.native
class URLSearchParams ()
  extends Iterable[js.Tuple2[String, String]] {
  def this(init: URLSearchParamsInit) = this()
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_URLSearchParams: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
  def append(name: String, value: String): Unit = js.native
  def delete(name: String): Unit = js.native
  def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
  def forEach(callback: js.Function2[/* value */ String, /* name */ String, Unit]): Unit = js.native
  def get(name: String): String | Null = js.native
  def getAll(name: String): Array[String] = js.native
  def has(name: String): Boolean = js.native
  def keys(): IterableIterator[String] = js.native
  def set(name: String, value: String): Unit = js.native
  def sort(): Unit = js.native
  def values(): IterableIterator[String] = js.native
}

