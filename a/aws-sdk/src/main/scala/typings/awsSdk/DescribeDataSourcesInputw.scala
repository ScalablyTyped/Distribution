package typings.awsSdk

import typings.awsSdk.machinelearningMod.ComparatorValue
import typings.awsSdk.machinelearningMod.DataSourceFilterVariable
import typings.awsSdk.machinelearningMod.PageLimit
import typings.awsSdk.machinelearningMod.StringType
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/machinelearning.DescribeDataSourcesInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeDataSourcesInputw extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The equal to operator. The DataSource results will have FilterVariable values that exactly match the value specified with EQ.
    */
  var EQ: js.UndefOr[ComparatorValue] = js.native
  /**
    * Use one of the following variables to filter a list of DataSource:   CreatedAt - Sets the search criteria to DataSource creation dates.  Status - Sets the search criteria to DataSource statuses.  Name - Sets the search criteria to the contents of DataSource   Name.  DataUri - Sets the search criteria to the URI of data files used to create the DataSource. The URI can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.  IAMUser - Sets the search criteria to the user account that invoked the DataSource creation. 
    */
  var FilterVariable: js.UndefOr[DataSourceFilterVariable] = js.native
  /**
    * The greater than or equal to operator. The DataSource results will have FilterVariable values that are greater than or equal to the value specified with GE. 
    */
  var GE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The greater than operator. The DataSource results will have FilterVariable values that are greater than the value specified with GT.
    */
  var GT: js.UndefOr[ComparatorValue] = js.native
  /**
    * The less than or equal to operator. The DataSource results will have FilterVariable values that are less than or equal to the value specified with LE.
    */
  var LE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The less than operator. The DataSource results will have FilterVariable values that are less than the value specified with LT.
    */
  var LT: js.UndefOr[ComparatorValue] = js.native
  /**
    *  The maximum number of DataSource to include in the result.
    */
  var Limit: js.UndefOr[PageLimit] = js.native
  /**
    * The not equal to operator. The DataSource results will have FilterVariable values not equal to the value specified with NE.
    */
  var NE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The ID of the page in the paginated results.
    */
  var NextToken: js.UndefOr[StringType] = js.native
  /**
    * A string that is found at the beginning of a variable, such as Name or Id. For example, a DataSource could have the Name 2014-09-09-HolidayGiftMailer. To search for this DataSource, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
    */
  var Prefix: js.UndefOr[ComparatorValue] = js.native
  /**
    * A two-value parameter that determines the sequence of the resulting list of DataSource.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.machinelearningMod.SortOrder] = js.native
}

