package typings.arangodb.Foxx

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.HttpMethod
import typings.arangodb.anon.Algorithm
import typings.arangodb.anon.Basic
import typings.arangodb.arangodbBooleans.`false`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  def accepts(types: String*): String | `false` = js.native
  def accepts(types: js.Array[String]): String | `false` = js.native
  
  def acceptsCharsets(charsets: String*): String | `false` = js.native
  def acceptsCharsets(charsets: js.Array[String]): String | `false` = js.native
  
  def acceptsEncodings(encodings: String*): String | `false` = js.native
  def acceptsEncodings(encodings: js.Array[String]): String | `false` = js.native
  
  def acceptsLanguages(languages: String*): String | `false` = js.native
  def acceptsLanguages(languages: js.Array[String]): String | `false` = js.native
  
  var arangoUser: String | Null = js.native
  
  var arangoVersion: Double = js.native
  
  var auth: Null | Basic = js.native
  
  var baseUrl: String = js.native
  
  var body: js.Any = js.native
  
  var context: Context = js.native
  
  def cookie(name: String): String | Null = js.native
  def cookie(name: String, options: Algorithm): String | Null = js.native
  
  var database: String = js.native
  
  def get(name: String): js.UndefOr[String] = js.native
  
  def header(name: String): js.UndefOr[String] = js.native
  
  var headers: StringDictionary[js.UndefOr[String]] = js.native
  
  var hostname: String = js.native
  
  def is(types: String*): String = js.native
  def is(types: js.Array[String]): String = js.native
  
  def json(): js.Any = js.native
  
  def makeAbsolute(path: String): String = js.native
  def makeAbsolute(path: String, query: String): String = js.native
  def makeAbsolute(path: String, query: StringDictionary[js.UndefOr[String]]): String = js.native
  
  var method: HttpMethod = js.native
  
  var originalUrl: String = js.native
  
  def param(name: String): js.Any = js.native
  
  var path: String = js.native
  
  var pathParams: StringDictionary[js.Any] = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
  
  var queryParams: StringDictionary[js.Any] = js.native
  
  def range(): Ranges | Double = js.native
  def range(size: Double): Ranges | Double = js.native
  
  var rawBody: Buffer = js.native
  
  var remoteAddress: String = js.native
  
  var remoteAddresses: js.Array[String] = js.native
  
  var remotePort: Double = js.native
  
  def reverse(name: String): String = js.native
  def reverse(name: String, params: js.Object): String = js.native
  
  var secure: Boolean = js.native
  
  var session: js.UndefOr[Session] = js.native
  
  var sessionStorage: js.UndefOr[SessionStorage] = js.native
  
  var suffix: String = js.native
  
  var trustProxy: Boolean = js.native
  
  var url: String = js.native
  
  var xhr: Boolean = js.native
}
