package typings.awsDashSdk.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDimensionKeysResponse extends js.Object {
  /**
    * The end time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
    */
  var AlignedEndTime: js.UndefOr[ISOTimestamp] = js.native
  /**
    * The start time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
    */
  var AlignedStartTime: js.UndefOr[ISOTimestamp] = js.native
  /**
    * The dimension keys that were requested.
    */
  var Keys: js.UndefOr[DimensionKeyDescriptionList] = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * If PartitionBy was present in the request, PartitionKeys contains the breakdown of dimension keys by the specified partitions.
    */
  var PartitionKeys: js.UndefOr[ResponsePartitionKeyList] = js.native
}

object DescribeDimensionKeysResponse {
  @scala.inline
  def apply(
    AlignedEndTime: ISOTimestamp = null,
    AlignedStartTime: ISOTimestamp = null,
    Keys: DimensionKeyDescriptionList = null,
    NextToken: String = null,
    PartitionKeys: ResponsePartitionKeyList = null
  ): DescribeDimensionKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (AlignedEndTime != null) __obj.updateDynamic("AlignedEndTime")(AlignedEndTime.asInstanceOf[js.Any])
    if (AlignedStartTime != null) __obj.updateDynamic("AlignedStartTime")(AlignedStartTime.asInstanceOf[js.Any])
    if (Keys != null) __obj.updateDynamic("Keys")(Keys.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PartitionKeys != null) __obj.updateDynamic("PartitionKeys")(PartitionKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDimensionKeysResponse]
  }
}

