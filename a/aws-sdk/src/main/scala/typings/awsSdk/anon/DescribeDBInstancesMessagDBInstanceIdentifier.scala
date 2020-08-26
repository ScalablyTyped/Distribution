package typings.awsSdk.anon

import typings.awsSdk.neptuneMod.Filter
import typings.awsSdk.neptuneMod.FilterList
import typings.awsSdk.neptuneMod.IntegerOptional
import typings.awsSdk.neptuneMod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/neptune.DescribeDBInstancesMessage & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeDBInstancesMessagDBInstanceIdentifier extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The user-supplied instance identifier. If this parameter is specified, information from only the specific DB instance is returned. This parameter isn't case-sensitive. Constraints:   If supplied, must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * A filter that specifies one or more DB instances to describe. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list will only include information about the DB instances associated with the DB clusters identified by these ARNs.    engine - Accepts an engine name (such as neptune), and restricts the results list to DB instances created by that engine.   For example, to invoke this API from the AWS CLI and filter so that only Neptune DB instances are returned, you could use the following command:
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeDBInstances request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

object DescribeDBInstancesMessagDBInstanceIdentifier {
  @scala.inline
  def apply(): DescribeDBInstancesMessagDBInstanceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBInstancesMessagDBInstanceIdentifier]
  }
  @scala.inline
  implicit class DescribeDBInstancesMessagDBInstanceIdentifierOps[Self <: DescribeDBInstancesMessagDBInstanceIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceIdentifier: Self = this.set("DBInstanceIdentifier", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
  }
  
}

