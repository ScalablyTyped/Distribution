package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppResult extends js.Object {
  var app: App = js.native
}

object GetAppResult {
  @scala.inline
  def apply(app: App): GetAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppResult]
  }
}

