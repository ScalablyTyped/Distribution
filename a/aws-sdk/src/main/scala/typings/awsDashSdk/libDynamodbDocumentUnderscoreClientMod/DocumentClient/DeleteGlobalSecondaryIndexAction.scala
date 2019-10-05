package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGlobalSecondaryIndexAction extends js.Object {
  /**
    * The name of the global secondary index to be deleted.
    */
  var IndexName: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.IndexName
}

object DeleteGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: IndexName): DeleteGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName)
  
    __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
  }
}

