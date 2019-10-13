package typings.apolloDashEnv

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEnv.libFetchUrlMod.URL
import typings.apolloDashEnv.libFetchUrlMod.URLSearchParams
import typings.apolloDashEnv.libFetchUrlMod.URLSearchParamsInit
import typings.apolloDashEnv.libPolyfillsArrayMod._Global_.Array
import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/url", JSImport.Namespace)
@js.native
object libFetchUrlMod extends js.Object {
  @js.native
  class URL protected () extends js.Object {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL) = this()
    var hash: String = js.native
    var host: String = js.native
    var hostname: String = js.native
    var href: String = js.native
    val origin: String = js.native
    var password: String = js.native
    var pathname: String = js.native
    var port: String = js.native
    var protocol: String = js.native
    var search: String = js.native
    val searchParams: URLSearchParams = js.native
    var username: String = js.native
    def toJSON(): String = js.native
  }
  
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
  
  type URLSearchParamsInit = URLSearchParams | String | (StringDictionary[js.UndefOr[js.Object | Array[js.Object]]]) | (Iterable[js.Tuple2[String, js.Object]]) | (Array[js.Tuple2[String, js.Object]])
}

