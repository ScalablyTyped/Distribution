package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLimitsOutput extends js.Object {
  /**
    * The maximum total read capacity units that your account allows you to provision across all of your tables in this Region.
    */
  var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * The maximum total write capacity units that your account allows you to provision across all of your tables in this Region.
    */
  var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * The maximum read capacity units that your account allows you to provision for a new table that you are creating in this Region, including the read capacity units provisioned for its global secondary indexes (GSIs).
    */
  var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * The maximum write capacity units that your account allows you to provision for a new table that you are creating in this Region, including the write capacity units provisioned for its global secondary indexes (GSIs).
    */
  var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
}

object DescribeLimitsOutput {
  @scala.inline
  def apply(
    AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  ): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AccountMaxReadCapacityUnits)) __obj.updateDynamic("AccountMaxReadCapacityUnits")(AccountMaxReadCapacityUnits)
    if (!js.isUndefined(AccountMaxWriteCapacityUnits)) __obj.updateDynamic("AccountMaxWriteCapacityUnits")(AccountMaxWriteCapacityUnits)
    if (!js.isUndefined(TableMaxReadCapacityUnits)) __obj.updateDynamic("TableMaxReadCapacityUnits")(TableMaxReadCapacityUnits)
    if (!js.isUndefined(TableMaxWriteCapacityUnits)) __obj.updateDynamic("TableMaxWriteCapacityUnits")(TableMaxWriteCapacityUnits)
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
}

