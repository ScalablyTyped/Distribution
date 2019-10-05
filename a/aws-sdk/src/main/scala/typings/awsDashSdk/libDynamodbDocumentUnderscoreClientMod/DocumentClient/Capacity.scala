package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capacity extends js.Object {
  /**
    * The total number of capacity units consumed on a table or an index.
    */
  var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  /**
    * The total number of read capacity units consumed on a table or an index.
    */
  var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  /**
    * The total number of write capacity units consumed on a table or an index.
    */
  var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
}

object Capacity {
  @scala.inline
  def apply(
    CapacityUnits: Int | scala.Double = null,
    ReadCapacityUnits: Int | scala.Double = null,
    WriteCapacityUnits: Int | scala.Double = null
  ): Capacity = {
    val __obj = js.Dynamic.literal()
    if (CapacityUnits != null) __obj.updateDynamic("CapacityUnits")(CapacityUnits.asInstanceOf[js.Any])
    if (ReadCapacityUnits != null) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.asInstanceOf[js.Any])
    if (WriteCapacityUnits != null) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capacity]
  }
}

