package typings
package arangodbLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  @JSName("delete")
  var delete_Original: arangodbLib.Anon_Options = js.native
  @JSName("get")
  var get_Original: arangodbLib.Anon_Options = js.native
  @JSName("head")
  var head_Original: arangodbLib.Anon_Options = js.native
  @JSName("patch")
  var patch_Original: arangodbLib.Anon_Options = js.native
  @JSName("post")
  var post_Original: arangodbLib.Anon_Options = js.native
  @JSName("put")
  var put_Original: arangodbLib.Anon_Options = js.native
  def apply(options: arangodbLib.Anon_Method with RequestOptions): Response = js.native
  def delete(options: arangodbLib.Anon_Url with RequestOptions): Response = js.native
  def delete(url: java.lang.String): Response = js.native
  def delete(url: java.lang.String, options: RequestOptions): Response = js.native
  def get(options: arangodbLib.Anon_Url with RequestOptions): Response = js.native
  def get(url: java.lang.String): Response = js.native
  def get(url: java.lang.String, options: RequestOptions): Response = js.native
  def head(options: arangodbLib.Anon_Url with RequestOptions): Response = js.native
  def head(url: java.lang.String): Response = js.native
  def head(url: java.lang.String, options: RequestOptions): Response = js.native
  def patch(options: arangodbLib.Anon_Url with RequestOptions): Response = js.native
  def patch(url: java.lang.String): Response = js.native
  def patch(url: java.lang.String, options: RequestOptions): Response = js.native
  def post(options: arangodbLib.Anon_Url with RequestOptions): Response = js.native
  def post(url: java.lang.String): Response = js.native
  def post(url: java.lang.String, options: RequestOptions): Response = js.native
  def put(options: arangodbLib.Anon_Url with RequestOptions): Response = js.native
  def put(url: java.lang.String): Response = js.native
  def put(url: java.lang.String, options: RequestOptions): Response = js.native
}

