package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginGroupMembers extends js.Object {
  /**
    * Items (origins) in an origin group.
    */
  var Items: OriginGroupMemberList
  /**
    * The number of origins in an origin group.
    */
  var Quantity: integer
}

object OriginGroupMembers {
  @scala.inline
  def apply(Items: OriginGroupMemberList, Quantity: integer): OriginGroupMembers = {
    val __obj = js.Dynamic.literal(Items = Items, Quantity = Quantity)
  
    __obj.asInstanceOf[OriginGroupMembers]
  }
}

