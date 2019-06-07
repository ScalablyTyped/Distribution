package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMasterAccountResponse extends js.Object {
  /**
    * Master account details.
    */
  var Master: awsDashSdkLib.clientsGuarddutyMod.Master
}

object GetMasterAccountResponse {
  @scala.inline
  def apply(Master: Master): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal(Master = Master)
  
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
}

