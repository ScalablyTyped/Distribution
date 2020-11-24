package typings.angularHttp

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/url_search_params", JSImport.Namespace)
@js.native
object urlSearchParamsMod extends js.Object {
  
  @js.native
  class QueryEncoder () extends js.Object {
    
    def encodeKey(key: String): String = js.native
    
    def encodeValue(value: String): String = js.native
  }
  
  @js.native
  class URLSearchParams () extends js.Object {
    def this(rawParams: String) = this()
    def this(rawParams: js.UndefOr[scala.Nothing], queryEncoder: QueryEncoder) = this()
    def this(rawParams: String, queryEncoder: QueryEncoder) = this()
    
    def append(param: String, `val`: String): Unit = js.native
    
    def appendAll(searchParams: URLSearchParams): Unit = js.native
    
    def delete(param: String): Unit = js.native
    
    def get(param: String): String | Null = js.native
    
    def getAll(param: String): js.Array[String] = js.native
    
    def has(param: String): Boolean = js.native
    
    var paramsMap: Map[String, js.Array[String]] = js.native
    
    var queryEncoder: js.Any = js.native
    
    var rawParams: String = js.native
    
    def replaceAll(searchParams: URLSearchParams): Unit = js.native
    
    def set(param: String, `val`: String): Unit = js.native
    
    def setAll(searchParams: URLSearchParams): Unit = js.native
  }
}
