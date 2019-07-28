package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteImportDataRequest extends js.Object {
  /**
    * The IDs for the import tasks that you want to delete.
    */
  var importTaskIds: ToDeleteIdentifierList
}

object BatchDeleteImportDataRequest {
  @scala.inline
  def apply(importTaskIds: ToDeleteIdentifierList): BatchDeleteImportDataRequest = {
    val __obj = js.Dynamic.literal(importTaskIds = importTaskIds)
  
    __obj.asInstanceOf[BatchDeleteImportDataRequest]
  }
}

