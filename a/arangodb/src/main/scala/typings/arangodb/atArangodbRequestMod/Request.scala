package typings.arangodb.atArangodbRequestMod

import typings.arangodb.Anon_Method
import typings.arangodb.Anon_Url
import typings.arangodb.Fn_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  @JSName("delete")
  var delete_Original: Fn_Options = js.native
  @JSName("get")
  var get_Original: Fn_Options = js.native
  @JSName("head")
  var head_Original: Fn_Options = js.native
  @JSName("patch")
  var patch_Original: Fn_Options = js.native
  @JSName("post")
  var post_Original: Fn_Options = js.native
  @JSName("put")
  var put_Original: Fn_Options = js.native
  def apply(options: Anon_Method with RequestOptions): Response = js.native
  def delete(options: Anon_Url with RequestOptions): Response = js.native
  def delete(url: String): Response = js.native
  def delete(url: String, options: RequestOptions): Response = js.native
  def get(options: Anon_Url with RequestOptions): Response = js.native
  def get(url: String): Response = js.native
  def get(url: String, options: RequestOptions): Response = js.native
  def head(options: Anon_Url with RequestOptions): Response = js.native
  def head(url: String): Response = js.native
  def head(url: String, options: RequestOptions): Response = js.native
  def patch(options: Anon_Url with RequestOptions): Response = js.native
  def patch(url: String): Response = js.native
  def patch(url: String, options: RequestOptions): Response = js.native
  def post(options: Anon_Url with RequestOptions): Response = js.native
  def post(url: String): Response = js.native
  def post(url: String, options: RequestOptions): Response = js.native
  def put(options: Anon_Url with RequestOptions): Response = js.native
  def put(url: String): Response = js.native
  def put(url: String, options: RequestOptions): Response = js.native
}

