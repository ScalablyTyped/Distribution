package typings.arangodb.arangodbRequestMod

import typings.arangodb.AnonMethod
import typings.arangodb.AnonUrl
import typings.arangodb.FnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  @JSName("delete")
  var delete_Original: FnOptions = js.native
  @JSName("get")
  var get_Original: FnOptions = js.native
  @JSName("head")
  var head_Original: FnOptions = js.native
  @JSName("patch")
  var patch_Original: FnOptions = js.native
  @JSName("post")
  var post_Original: FnOptions = js.native
  @JSName("put")
  var put_Original: FnOptions = js.native
  def apply(options: AnonMethod with RequestOptions): Response = js.native
  def delete(options: AnonUrl with RequestOptions): Response = js.native
  def delete(url: String): Response = js.native
  def delete(url: String, options: RequestOptions): Response = js.native
  def get(options: AnonUrl with RequestOptions): Response = js.native
  def get(url: String): Response = js.native
  def get(url: String, options: RequestOptions): Response = js.native
  def head(options: AnonUrl with RequestOptions): Response = js.native
  def head(url: String): Response = js.native
  def head(url: String, options: RequestOptions): Response = js.native
  def patch(options: AnonUrl with RequestOptions): Response = js.native
  def patch(url: String): Response = js.native
  def patch(url: String, options: RequestOptions): Response = js.native
  def post(options: AnonUrl with RequestOptions): Response = js.native
  def post(url: String): Response = js.native
  def post(url: String, options: RequestOptions): Response = js.native
  def put(options: AnonUrl with RequestOptions): Response = js.native
  def put(url: String): Response = js.native
  def put(url: String, options: RequestOptions): Response = js.native
}

