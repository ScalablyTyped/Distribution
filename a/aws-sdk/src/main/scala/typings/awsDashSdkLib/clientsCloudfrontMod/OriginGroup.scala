package typings
package awsDashSdkLib.clientsCloudfrontMod

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
  var Id: java.lang.String
  /**
    * A complex type that contains information about the origins in an origin group.
    */
  var Members: OriginGroupMembers
}

object OriginGroup {
  @scala.inline
  def apply(FailoverCriteria: OriginGroupFailoverCriteria, Id: java.lang.String, Members: OriginGroupMembers): OriginGroup = {
    val __obj = js.Dynamic.literal(FailoverCriteria = FailoverCriteria, Id = Id, Members = Members)
  
    __obj.asInstanceOf[OriginGroup]
  }
}

