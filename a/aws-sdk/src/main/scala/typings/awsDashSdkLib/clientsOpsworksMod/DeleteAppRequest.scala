package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAppRequest extends js.Object {
  /**
    * The app ID.
    */
  var AppId: String
}

object DeleteAppRequest {
  @scala.inline
  def apply(AppId: String): DeleteAppRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId)
  
    __obj.asInstanceOf[DeleteAppRequest]
  }
}

