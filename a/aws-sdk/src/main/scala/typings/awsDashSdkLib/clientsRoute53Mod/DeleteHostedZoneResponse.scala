package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHostedZoneResponse extends js.Object {
  /**
    * A complex type that contains the ID, the status, and the date and time of a request to delete a hosted zone.
    */
  var ChangeInfo: awsDashSdkLib.clientsRoute53Mod.ChangeInfo
}

object DeleteHostedZoneResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): DeleteHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo)
  
    __obj.asInstanceOf[DeleteHostedZoneResponse]
  }
}

