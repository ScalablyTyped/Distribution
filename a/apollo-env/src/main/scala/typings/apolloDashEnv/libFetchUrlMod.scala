package typings.apolloDashEnv

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEnv.libPolyfillsArrayMod._Global_.Array
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/url", JSImport.Namespace)
@js.native
object libFetchUrlMod extends js.Object {
  @js.native
  class URL protected ()
    extends typings.node.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typings.node.urlMod.URL) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typings.node.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[js.UndefOr[String | js.Array[String]]]) = this()
    def this(init: typings.node.urlMod.URLSearchParams) = this()
    def this(init: Iterable[js.Tuple2[String, String]]) = this()
  }
  
  type URLSearchParamsInit = typings.node.urlMod.URLSearchParams | String | (StringDictionary[js.UndefOr[js.Object | Array[js.Object]]]) | (Iterable[js.Tuple2[String, js.Object]]) | (Array[js.Tuple2[String, js.Object]])
}

