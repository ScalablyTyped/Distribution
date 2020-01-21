package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppResult extends js.Object {
  var app: App = js.native
}

object DeleteAppResult {
  @scala.inline
  def apply(app: App): DeleteAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAppResult]
  }
}

