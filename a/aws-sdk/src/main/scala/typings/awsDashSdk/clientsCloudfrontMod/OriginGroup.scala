package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginGroup extends js.Object {
  /**
    * A complex type that contains information about the failover criteria for an origin group.
    */
  var FailoverCriteria: OriginGroupFailoverCriteria
  /**
    * The origin group's ID.
    */
  var Id: String
  /**
    * A complex type that contains information about the origins in an origin group.
    */
  var Members: OriginGroupMembers
}

object OriginGroup {
  @scala.inline
  def apply(FailoverCriteria: OriginGroupFailoverCriteria, Id: String, Members: OriginGroupMembers): OriginGroup = {
    val __obj = js.Dynamic.literal(FailoverCriteria = FailoverCriteria, Id = Id, Members = Members)
  
    __obj.asInstanceOf[OriginGroup]
  }
}

