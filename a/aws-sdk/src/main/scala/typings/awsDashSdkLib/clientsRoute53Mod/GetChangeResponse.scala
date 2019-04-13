package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetChangeResponse extends js.Object {
  /**
    * A complex type that contains information about the specified change batch.
    */
  var ChangeInfo: awsDashSdkLib.clientsRoute53Mod.ChangeInfo
}

object GetChangeResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): GetChangeResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo)
  
    __obj.asInstanceOf[GetChangeResponse]
  }
}

