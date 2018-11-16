package typings
package arangodbLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  @JSName("delete")
  var delete_Original: js.Function2[/* url */ java.lang.String, /* options */ js.UndefOr[RequestOptions], Response] = js.native
  @JSName("get")
  var get_Original: js.Function2[/* url */ java.lang.String, /* options */ js.UndefOr[RequestOptions], Response] = js.native
  @JSName("head")
  var head_Original: js.Function2[/* url */ java.lang.String, /* options */ js.UndefOr[RequestOptions], Response] = js.native
  @JSName("patch")
  var patch_Original: js.Function2[/* url */ java.lang.String, /* options */ js.UndefOr[RequestOptions], Response] = js.native
  @JSName("post")
  var post_Original: js.Function2[/* url */ java.lang.String, /* options */ js.UndefOr[RequestOptions], Response] = js.native
  @JSName("put")
  var put_Original: js.Function2[/* url */ java.lang.String, /* options */ js.UndefOr[RequestOptions], Response] = js.native
  def apply(options: arangodbLib.Anon_Url with RequestOptions): Response = js.native
  def delete(url: java.lang.String): Response = js.native
  def delete(url: java.lang.String, options: RequestOptions): Response = js.native
  def get(url: java.lang.String): Response = js.native
  def get(url: java.lang.String, options: RequestOptions): Response = js.native
  def head(url: java.lang.String): Response = js.native
  def head(url: java.lang.String, options: RequestOptions): Response = js.native
  def patch(url: java.lang.String): Response = js.native
  def patch(url: java.lang.String, options: RequestOptions): Response = js.native
  def post(url: java.lang.String): Response = js.native
  def post(url: java.lang.String, options: RequestOptions): Response = js.native
  def put(url: java.lang.String): Response = js.native
  def put(url: java.lang.String, options: RequestOptions): Response = js.native
}

