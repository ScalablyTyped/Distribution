package typings.angularCommon.httpMod

import typings.angularCommon.angularCommonStrings.DELETE
import typings.angularCommon.angularCommonStrings.GET
import typings.angularCommon.angularCommonStrings.HEAD
import typings.angularCommon.angularCommonStrings.JSONP
import typings.angularCommon.angularCommonStrings.OPTIONS
import typings.angularCommon.angularCommonStrings.PATCH
import typings.angularCommon.angularCommonStrings.POST
import typings.angularCommon.angularCommonStrings.PUT
import typings.angularCommon.anon.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpRequest")
@js.native
class HttpRequest[T] protected ()
  extends typings.angularCommon.httpHttpMod.HttpRequest[T] {
  def this(method: String, url: String) = this()
  def this(method: DELETE, url: String) = this()
  def this(method: GET, url: String) = this()
  def this(method: HEAD, url: String) = this()
  def this(method: JSONP, url: String) = this()
  def this(method: OPTIONS, url: String) = this()
  def this(method: PATCH, url: String) = this()
  def this(method: POST, url: String) = this()
  def this(method: PUT, url: String) = this()
  def this(method: String, url: String, body: T) = this()
  def this(method: DELETE, url: String, init: Params) = this()
  def this(method: GET, url: String, init: Params) = this()
  def this(method: HEAD, url: String, init: Params) = this()
  def this(method: JSONP, url: String, init: Params) = this()
  def this(method: OPTIONS, url: String, init: Params) = this()
  def this(method: PATCH, url: String, body: T) = this()
  def this(method: POST, url: String, body: T) = this()
  def this(method: PUT, url: String, body: T) = this()
  def this(method: String, url: String, body: T, init: Params) = this()
  def this(method: String, url: String, body: Null, init: Params) = this()
  def this(method: PATCH, url: String, body: T, init: Params) = this()
  def this(method: PATCH, url: String, body: Null, init: Params) = this()
  def this(method: POST, url: String, body: T, init: Params) = this()
  def this(method: POST, url: String, body: Null, init: Params) = this()
  def this(method: PUT, url: String, body: T, init: Params) = this()
  def this(method: PUT, url: String, body: Null, init: Params) = this()
}
