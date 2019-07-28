package typings.apolloDashEnv.libFetchFetchMod

import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Headers")
@js.native
class Headers ()
  extends Iterable[js.Tuple2[String, String]] {
  def this(init: HeadersInit) = this()
  def append(name: String, value: String): Unit = js.native
  def delete(name: String): Unit = js.native
  def entries(): Iterator[js.Tuple2[String, String]] = js.native
  def get(name: String): String | Null = js.native
  def has(name: String): Boolean = js.native
  def keys(): Iterator[String] = js.native
  def set(name: String, value: String): Unit = js.native
  def values(): Iterator[js.Array[String]] = js.native
}

