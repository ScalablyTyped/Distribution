package typings
package atAngularHttpLib.srcUrlUnderscoreSearchUnderscoreParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/url_search_params", "URLSearchParams")
@js.native
class URLSearchParams () extends js.Object {
  def this(rawParams: java.lang.String) = this()
  def this(rawParams: java.lang.String, queryEncoder: QueryEncoder) = this()
  var paramsMap: nodeLib.Map[java.lang.String, js.Array[java.lang.String]] = js.native
  var queryEncoder: js.Any = js.native
  var rawParams: java.lang.String = js.native
  def append(param: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  def appendAll(searchParams: URLSearchParams): scala.Unit = js.native
  def delete(param: java.lang.String): scala.Unit = js.native
  def get(param: java.lang.String): java.lang.String | scala.Null = js.native
  def getAll(param: java.lang.String): js.Array[java.lang.String] = js.native
  def has(param: java.lang.String): scala.Boolean = js.native
  def replaceAll(searchParams: URLSearchParams): scala.Unit = js.native
  def set(param: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  def setAll(searchParams: URLSearchParams): scala.Unit = js.native
}

