package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGlobalSecondaryIndexAction extends js.Object {
  /**
    * The name of the global secondary index to be deleted.
    */
  var IndexName: IndexName
}

object DeleteGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: IndexName): DeleteGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IndexName")(IndexName)
    __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
  }
}

