package typings.awsSdk

import typings.awsSdk.redshiftMod.IntegerOptional
import typings.awsSdk.redshiftMod.String
import typings.awsSdk.redshiftMod.TagKeyList
import typings.awsSdk.redshiftMod.TagValueList
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/redshift.DescribeClustersMessage & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeClustersMessagewa extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The unique identifier of a cluster whose properties you are requesting. This parameter is case sensitive. The default is that all clusters defined for an account are returned.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusters request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.  Constraints: You can specify either the ClusterIdentifier parameter or the Marker parameter, but not both. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * A tag key or keys for which you want to return all matching clusters that are associated with the specified key or keys. For example, suppose that you have clusters that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the clusters that have either or both of these tag keys associated with them.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.native
  /**
    * A tag value or values for which you want to return all matching clusters that are associated with the specified tag value or values. For example, suppose that you have clusters that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the clusters that have either or both of these tag values associated with them.
    */
  var TagValues: js.UndefOr[TagValueList] = js.native
}

