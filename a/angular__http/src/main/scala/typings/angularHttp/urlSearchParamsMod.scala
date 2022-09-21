package typings.angularHttp

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlSearchParamsMod {
  
  @JSImport("@angular/http/src/url_search_params", "QueryEncoder")
  @js.native
  open class QueryEncoder () extends StObject {
    
    def encodeKey(key: String): String = js.native
    
    def encodeValue(value: String): String = js.native
  }
  
  @JSImport("@angular/http/src/url_search_params", "URLSearchParams")
  @js.native
  open class URLSearchParams () extends StObject {
    def this(rawParams: String) = this()
    def this(rawParams: String, queryEncoder: QueryEncoder) = this()
    def this(rawParams: Unit, queryEncoder: QueryEncoder) = this()
    
    def append(param: String, `val`: String): Unit = js.native
    
    def appendAll(searchParams: URLSearchParams): Unit = js.native
    
    def delete(param: String): Unit = js.native
    
    def get(param: String): String | Null = js.native
    
    def getAll(param: String): js.Array[String] = js.native
    
    def has(param: String): Boolean = js.native
    
    var paramsMap: Map[String, js.Array[String]] = js.native
    
    /* private */ var queryEncoder: Any = js.native
    
    var rawParams: String = js.native
    
    def replaceAll(searchParams: URLSearchParams): Unit = js.native
    
    def set(param: String, `val`: String): Unit = js.native
    
    def setAll(searchParams: URLSearchParams): Unit = js.native
  }
}
