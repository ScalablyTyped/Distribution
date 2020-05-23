package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var app: String | js.Array[String]
  var subscribeAll: js.UndefOr[Boolean] = js.undefined
}

object App {
  @scala.inline
  def apply(app: String | js.Array[String], subscribeAll: js.UndefOr[Boolean] = js.undefined): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    if (!js.isUndefined(subscribeAll)) __obj.updateDynamic("subscribeAll")(subscribeAll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

