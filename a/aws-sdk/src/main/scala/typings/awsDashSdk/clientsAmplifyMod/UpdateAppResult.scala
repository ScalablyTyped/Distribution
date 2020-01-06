package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAppResult extends js.Object {
  /**
    *  App structure for the updated App. 
    */
  var app: App = js.native
}

object UpdateAppResult {
  @scala.inline
  def apply(app: App): UpdateAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateAppResult]
  }
}

