package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartAssociationsOnceRequest extends js.Object {
  /**
    * The association IDs that you want to run immediately and only one time.
    */
  var AssociationIds: AssociationIdList
}

object StartAssociationsOnceRequest {
  @scala.inline
  def apply(AssociationIds: AssociationIdList): StartAssociationsOnceRequest = {
    val __obj = js.Dynamic.literal(AssociationIds = AssociationIds)
  
    __obj.asInstanceOf[StartAssociationsOnceRequest]
  }
}

