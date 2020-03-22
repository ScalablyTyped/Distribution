package typings.arangodb.arangodbRequestMod

import typings.arangodb.FnCallUrlOptions
import typings.arangodb.urlstringRequestOptions
import typings.arangodb.urlstringmethodHttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  @JSName("delete")
  var delete_Original: FnCallUrlOptions = js.native
  @JSName("get")
  var get_Original: FnCallUrlOptions = js.native
  @JSName("head")
  var head_Original: FnCallUrlOptions = js.native
  @JSName("patch")
  var patch_Original: FnCallUrlOptions = js.native
  @JSName("post")
  var post_Original: FnCallUrlOptions = js.native
  @JSName("put")
  var put_Original: FnCallUrlOptions = js.native
  def apply(options: urlstringmethodHttpMethod): Response = js.native
  def delete(options: urlstringRequestOptions): Response = js.native
  def delete(url: String): Response = js.native
  def delete(url: String, options: RequestOptions): Response = js.native
  def get(options: urlstringRequestOptions): Response = js.native
  def get(url: String): Response = js.native
  def get(url: String, options: RequestOptions): Response = js.native
  def head(options: urlstringRequestOptions): Response = js.native
  def head(url: String): Response = js.native
  def head(url: String, options: RequestOptions): Response = js.native
  def patch(options: urlstringRequestOptions): Response = js.native
  def patch(url: String): Response = js.native
  def patch(url: String, options: RequestOptions): Response = js.native
  def post(options: urlstringRequestOptions): Response = js.native
  def post(url: String): Response = js.native
  def post(url: String, options: RequestOptions): Response = js.native
  def put(options: urlstringRequestOptions): Response = js.native
  def put(url: String): Response = js.native
  def put(url: String, options: RequestOptions): Response = js.native
}

