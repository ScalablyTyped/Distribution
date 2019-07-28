package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAppResult extends js.Object {
  /**
    *  App structure for the updated App. 
    */
  var app: App
}

object UpdateAppResult {
  @scala.inline
  def apply(app: App): UpdateAppResult = {
    val __obj = js.Dynamic.literal(app = app)
  
    __obj.asInstanceOf[UpdateAppResult]
  }
}

