package typings.arangodb

import typings.arangodb.arangodbRequestMod.RequestOptions
import typings.arangodb.arangodbRequestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOptions extends js.Object {
  def apply(options: AnonUrl with RequestOptions): Response = js.native
  def apply(url: String): Response = js.native
  def apply(url: String, options: RequestOptions): Response = js.native
}

