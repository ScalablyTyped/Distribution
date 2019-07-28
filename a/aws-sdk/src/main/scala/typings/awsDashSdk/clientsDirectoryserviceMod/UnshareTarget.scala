package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnshareTarget extends js.Object {
  /**
    * Identifier of the directory consumer account.
    */
  var Id: TargetId
  /**
    * Type of identifier to be used in the Id field.
    */
  var Type: TargetType
}

object UnshareTarget {
  @scala.inline
  def apply(Id: TargetId, Type: TargetType): UnshareTarget = {
    val __obj = js.Dynamic.literal(Id = Id, Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnshareTarget]
  }
}

