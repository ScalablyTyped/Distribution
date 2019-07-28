package typings.arangodb.FoxxNs

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.Anon_Algorithm
import typings.arangodb.Anon_Basic
import typings.arangodb.ArangoDBNs.HttpMethod
import typings.arangodb.arangodbNumbers.`false`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var arangoUser: String | Null = js.native
  var arangoVersion: Double = js.native
  var auth: Null | Anon_Basic = js.native
  var baseUrl: String = js.native
  var body: js.Any = js.native
  var context: Context = js.native
  var database: String = js.native
  var headers: StringDictionary[js.UndefOr[String]] = js.native
  var hostname: String = js.native
  var method: HttpMethod = js.native
  var originalUrl: String = js.native
  var path: String = js.native
  var pathParams: StringDictionary[js.Any] = js.native
  var port: Double = js.native
  var protocol: String = js.native
  var queryParams: StringDictionary[js.Any] = js.native
  var rawBody: Buffer = js.native
  var remoteAddress: String = js.native
  var remoteAddresses: js.Array[String] = js.native
  var remotePort: Double = js.native
  var secure: Boolean = js.native
  var session: js.UndefOr[Session] = js.native
  var sessionStorage: js.UndefOr[SessionStorage] = js.native
  var suffix: String = js.native
  var trustProxy: Boolean = js.native
  var url: String = js.native
  var xhr: Boolean = js.native
  def accepts(types: String*): String | `false` = js.native
  def accepts(types: js.Array[String]): String | `false` = js.native
  def acceptsCharsets(charsets: String*): String | `false` = js.native
  def acceptsCharsets(charsets: js.Array[String]): String | `false` = js.native
  def acceptsEncodings(encodings: String*): String | `false` = js.native
  def acceptsEncodings(encodings: js.Array[String]): String | `false` = js.native
  def acceptsLanguages(languages: String*): String | `false` = js.native
  def acceptsLanguages(languages: js.Array[String]): String | `false` = js.native
  def cookie(name: String): String | Null = js.native
  def cookie(name: String, options: Anon_Algorithm): String | Null = js.native
  def get(name: String): js.UndefOr[String] = js.native
  def header(name: String): js.UndefOr[String] = js.native
  def is(types: String*): String = js.native
  def is(types: js.Array[String]): String = js.native
  def json(): js.Any = js.native
  def makeAbsolute(path: String): String = js.native
  def makeAbsolute(path: String, query: String): String = js.native
  def makeAbsolute(path: String, query: StringDictionary[js.UndefOr[String]]): String = js.native
  def param(name: String): js.Any = js.native
  def range(): Ranges | Double = js.native
  def range(size: Double): Ranges | Double = js.native
  def reverse(name: String): String = js.native
  def reverse(name: String, params: js.Object): String = js.native
}

