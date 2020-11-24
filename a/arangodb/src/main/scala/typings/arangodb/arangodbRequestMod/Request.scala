package typings.arangodb.arangodbRequestMod

import typings.arangodb.anon.FnCall
import typings.arangodb.anon.urlstringRequestOptions
import typings.arangodb.anon.urlstringmethodHttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  def apply(options: urlstringmethodHttpMethod): Response = js.native
  
  def delete(options: urlstringRequestOptions): Response = js.native
  def delete(url: String): Response = js.native
  def delete(url: String, options: RequestOptions): Response = js.native
  @JSName("delete")
  var delete_Original: FnCall = js.native
  
  def get(options: urlstringRequestOptions): Response = js.native
  def get(url: String): Response = js.native
  def get(url: String, options: RequestOptions): Response = js.native
  @JSName("get")
  var get_Original: FnCall = js.native
  
  def head(options: urlstringRequestOptions): Response = js.native
  def head(url: String): Response = js.native
  def head(url: String, options: RequestOptions): Response = js.native
  @JSName("head")
  var head_Original: FnCall = js.native
  
  def patch(options: urlstringRequestOptions): Response = js.native
  def patch(url: String): Response = js.native
  def patch(url: String, options: RequestOptions): Response = js.native
  @JSName("patch")
  var patch_Original: FnCall = js.native
  
  def post(options: urlstringRequestOptions): Response = js.native
  def post(url: String): Response = js.native
  def post(url: String, options: RequestOptions): Response = js.native
  @JSName("post")
  var post_Original: FnCall = js.native
  
  def put(options: urlstringRequestOptions): Response = js.native
  def put(url: String): Response = js.native
  def put(url: String, options: RequestOptions): Response = js.native
  @JSName("put")
  var put_Original: FnCall = js.native
}
