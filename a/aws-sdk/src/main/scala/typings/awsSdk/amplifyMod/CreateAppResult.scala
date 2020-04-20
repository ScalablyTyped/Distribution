package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppResult extends js.Object {
  var app: App = js.native
}

object CreateAppResult {
  @scala.inline
  def apply(app: App): CreateAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppResult]
  }
}

