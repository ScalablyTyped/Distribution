package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var arangoUser: java.lang.String | scala.Null = js.native
  var arangoVersion: scala.Double = js.native
  var auth: scala.Null | arangodbLib.Anon_Basic = js.native
  var baseUrl: java.lang.String = js.native
  var body: js.Any = js.native
  var context: Context = js.native
  var database: java.lang.String = js.native
  var headers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = js.native
  var hostname: java.lang.String = js.native
  var method: arangodbLib.ArangoDBNs.HttpMethod = js.native
  var originalUrl: java.lang.String = js.native
  var path: java.lang.String = js.native
  var pathParams: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var port: scala.Double = js.native
  var protocol: java.lang.String = js.native
  var queryParams: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var rawBody: nodeLib.Buffer = js.native
  var remoteAddress: java.lang.String = js.native
  var remoteAddresses: js.Array[java.lang.String] = js.native
  var remotePort: scala.Double = js.native
  var secure: scala.Boolean = js.native
  var session: js.UndefOr[Session] = js.native
  var sessionStorage: js.UndefOr[SessionStorage] = js.native
  var suffix: java.lang.String = js.native
  var trustProxy: scala.Boolean = js.native
  var url: java.lang.String = js.native
  var xhr: scala.Boolean = js.native
  def accepts(types: java.lang.String*): java.lang.String | arangodbLib.arangodbLibNumbers.`false` = js.native
  def accepts(types: js.Array[java.lang.String]): java.lang.String | arangodbLib.arangodbLibNumbers.`false` = js.native
  def acceptsCharsets(charsets: java.lang.String*): java.lang.String | arangodbLib.arangodbLibNumbers.`false` = js.native
  def acceptsCharsets(charsets: js.Array[java.lang.String]): java.lang.String | arangodbLib.arangodbLibNumbers.`false` = js.native
  def acceptsEncodings(encodings: java.lang.String*): java.lang.String | arangodbLib.arangodbLibNumbers.`false` = js.native
  def acceptsEncodings(encodings: js.Array[java.lang.String]): java.lang.String | arangodbLib.arangodbLibNumbers.`false` = js.native
  def acceptsLanguages(languages: java.lang.String*): java.lang.String | arangodbLib.arangodbLibNumbers.`false` = js.native
  def acceptsLanguages(languages: js.Array[java.lang.String]): java.lang.String | arangodbLib.arangodbLibNumbers.`false` = js.native
  def cookie(name: java.lang.String): java.lang.String | scala.Null = js.native
  def cookie(name: java.lang.String, options: arangodbLib.Anon_Algorithm): java.lang.String | scala.Null = js.native
  def get(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def header(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def is(types: java.lang.String*): java.lang.String = js.native
  def is(types: js.Array[java.lang.String]): java.lang.String = js.native
  def json(): js.Any = js.native
  def makeAbsolute(path: java.lang.String): java.lang.String = js.native
  def makeAbsolute(path: java.lang.String, query: java.lang.String): java.lang.String = js.native
  def makeAbsolute(
    path: java.lang.String,
    query: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  ): java.lang.String = js.native
  def param(name: java.lang.String): js.Any = js.native
  def range(): Ranges | scala.Double = js.native
  def range(size: scala.Double): Ranges | scala.Double = js.native
  def reverse(name: java.lang.String): java.lang.String = js.native
  def reverse(name: java.lang.String, params: js.Object): java.lang.String = js.native
}

