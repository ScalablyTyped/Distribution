package typings
package apolloDashUploadDashClientLib.apolloDashUploadDashClientMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalFetch extends js.Object {
  @JSName("fetch")
  var fetch_Original: apolloDashUploadDashClientLib.Fn_Init = js.native
  def fetch(input: stdLib.RequestInfo): js.Promise[stdLib.Response] = js.native
  def fetch(input: stdLib.RequestInfo, init: stdLib.RequestInit): js.Promise[stdLib.Response] = js.native
}

