package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAssociationBatchRequest extends js.Object {
  /**
    * One or more associations.
    */
  var Entries: CreateAssociationBatchRequestEntries
}

object CreateAssociationBatchRequest {
  @scala.inline
  def apply(Entries: CreateAssociationBatchRequestEntries): CreateAssociationBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries)
  
    __obj.asInstanceOf[CreateAssociationBatchRequest]
  }
}

