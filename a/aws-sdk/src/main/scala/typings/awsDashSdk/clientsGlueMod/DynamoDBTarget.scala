package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamoDBTarget extends js.Object {
  /**
    * The name of the DynamoDB table to crawl.
    */
  var Path: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Path] = js.undefined
}

object DynamoDBTarget {
  @scala.inline
  def apply(Path: Path = null): DynamoDBTarget = {
    val __obj = js.Dynamic.literal()
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[DynamoDBTarget]
  }
}

