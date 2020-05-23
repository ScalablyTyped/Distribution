package typings.arangodb.anon

import typings.arangodb.arangodbRequestMod.RequestOptions
import typings.arangodb.arangodbRequestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(options: urlstringRequestOptions): Response = js.native
  def apply(url: String): Response = js.native
  def apply(url: String, options: RequestOptions): Response = js.native
}

