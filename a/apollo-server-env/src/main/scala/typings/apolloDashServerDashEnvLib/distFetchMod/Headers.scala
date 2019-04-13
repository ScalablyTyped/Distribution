package typings
package apolloDashServerDashEnvLib.distFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/fetch", "Headers")
@js.native
class Headers ()
  extends stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]] {
  def this(init: HeadersInit) = this()
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  def entries(): stdLib.Iterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def keys(): stdLib.Iterator[java.lang.String] = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def values(): stdLib.Iterator[js.Array[java.lang.String]] = js.native
}

