package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBatchPredictionsInput extends js.Object {
  /**
    * The equal to operator. The BatchPrediction results will have FilterVariable values that exactly match the value specified with EQ.
    */
  var EQ: js.UndefOr[ComparatorValue] = js.native
  /**
    * Use one of the following variables to filter a list of BatchPrediction:   CreatedAt - Sets the search criteria to the BatchPrediction creation date.  Status - Sets the search criteria to the BatchPrediction status.  Name - Sets the search criteria to the contents of the BatchPrediction  Name.  IAMUser - Sets the search criteria to the user account that invoked the BatchPrediction creation.  MLModelId - Sets the search criteria to the MLModel used in the BatchPrediction.  DataSourceId - Sets the search criteria to the DataSource used in the BatchPrediction.  DataURI - Sets the search criteria to the data file(s) used in the BatchPrediction. The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory. 
    */
  var FilterVariable: js.UndefOr[BatchPredictionFilterVariable] = js.native
  /**
    * The greater than or equal to operator. The BatchPrediction results will have FilterVariable values that are greater than or equal to the value specified with GE. 
    */
  var GE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The greater than operator. The BatchPrediction results will have FilterVariable values that are greater than the value specified with GT.
    */
  var GT: js.UndefOr[ComparatorValue] = js.native
  /**
    * The less than or equal to operator. The BatchPrediction results will have FilterVariable values that are less than or equal to the value specified with LE.
    */
  var LE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The less than operator. The BatchPrediction results will have FilterVariable values that are less than the value specified with LT.
    */
  var LT: js.UndefOr[ComparatorValue] = js.native
  /**
    * The number of pages of information to include in the result. The range of acceptable values is 1 through 100. The default value is 100.
    */
  var Limit: js.UndefOr[PageLimit] = js.native
  /**
    * The not equal to operator. The BatchPrediction results will have FilterVariable values not equal to the value specified with NE.
    */
  var NE: js.UndefOr[ComparatorValue] = js.native
  /**
    * An ID of the page in the paginated results.
    */
  var NextToken: js.UndefOr[StringType] = js.native
  /**
    * A string that is found at the beginning of a variable, such as Name or Id. For example, a Batch Prediction operation could have the Name 2014-09-09-HolidayGiftMailer. To search for this BatchPrediction, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
    */
  var Prefix: js.UndefOr[ComparatorValue] = js.native
  /**
    * A two-value parameter that determines the sequence of the resulting list of MLModels.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
    */
  var SortOrder: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.SortOrder] = js.native
}

object DescribeBatchPredictionsInput {
  @scala.inline
  def apply(
    EQ: ComparatorValue = null,
    FilterVariable: BatchPredictionFilterVariable = null,
    GE: ComparatorValue = null,
    GT: ComparatorValue = null,
    LE: ComparatorValue = null,
    LT: ComparatorValue = null,
    Limit: Int | Double = null,
    NE: ComparatorValue = null,
    NextToken: StringType = null,
    Prefix: ComparatorValue = null,
    SortOrder: SortOrder = null
  ): DescribeBatchPredictionsInput = {
    val __obj = js.Dynamic.literal()
    if (EQ != null) __obj.updateDynamic("EQ")(EQ.asInstanceOf[js.Any])
    if (FilterVariable != null) __obj.updateDynamic("FilterVariable")(FilterVariable.asInstanceOf[js.Any])
    if (GE != null) __obj.updateDynamic("GE")(GE.asInstanceOf[js.Any])
    if (GT != null) __obj.updateDynamic("GT")(GT.asInstanceOf[js.Any])
    if (LE != null) __obj.updateDynamic("LE")(LE.asInstanceOf[js.Any])
    if (LT != null) __obj.updateDynamic("LT")(LT.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NE != null) __obj.updateDynamic("NE")(NE.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBatchPredictionsInput]
  }
}

