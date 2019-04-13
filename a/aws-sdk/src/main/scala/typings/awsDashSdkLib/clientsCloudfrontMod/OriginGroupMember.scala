package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginGroupMember extends js.Object {
  /**
    * The ID for an origin in an origin group.
    */
  var OriginId: java.lang.String
}

object OriginGroupMember {
  @scala.inline
  def apply(OriginId: java.lang.String): OriginGroupMember = {
    val __obj = js.Dynamic.literal(OriginId = OriginId)
  
    __obj.asInstanceOf[OriginGroupMember]
  }
}

