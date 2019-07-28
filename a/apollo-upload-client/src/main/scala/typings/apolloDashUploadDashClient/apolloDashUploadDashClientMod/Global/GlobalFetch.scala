package typings.apolloDashUploadDashClient.apolloDashUploadDashClientMod.Global

import typings.apolloDashUploadDashClient.Fn_Init
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalFetch extends js.Object {
  @JSName("fetch")
  var fetch_Original: Fn_Init = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
}

