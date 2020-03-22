package typings.awsSdk

import typings.awsSdk.dmsMod.FilterList
import typings.awsSdk.dmsMod.IntegerOptional
import typings.awsSdk.dmsMod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/dms.DescribeReplicationInstancesMessage & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeReplicationInstan extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Filters applied to the describe action. Valid filter names: replication-instance-arn | replication-instance-id | replication-instance-class | engine-version
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

