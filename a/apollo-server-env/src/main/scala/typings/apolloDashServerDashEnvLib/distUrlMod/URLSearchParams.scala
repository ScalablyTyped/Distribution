package typings
package apolloDashServerDashEnvLib.distUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/url", "URLSearchParams")
@js.native
class URLSearchParams ()
  extends stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]] {
  def this(init: URLSearchParamsInit) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator_URLSearchParams: js.Function0[stdLib.IterableIterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  def entries(): stdLib.IterableIterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def forEach(callback: js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def keys(): stdLib.IterableIterator[java.lang.String] = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def sort(): scala.Unit = js.native
  def values(): stdLib.IterableIterator[java.lang.String] = js.native
}

