package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReplicationTaskAssessmentResultsResponse extends js.Object {
  /**
    * - The Amazon S3 bucket where the task assessment report is located. 
    */
  var BucketName: js.UndefOr[String] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The task assessment report. 
    */
  var ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList] = js.native
}

object DescribeReplicationTaskAssessmentResultsResponse {
  @scala.inline
  def apply(
    BucketName: String = null,
    Marker: String = null,
    ReplicationTaskAssessmentResults: ReplicationTaskAssessmentResultList = null
  ): DescribeReplicationTaskAssessmentResultsResponse = {
    val __obj = js.Dynamic.literal()
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ReplicationTaskAssessmentResults != null) __obj.updateDynamic("ReplicationTaskAssessmentResults")(ReplicationTaskAssessmentResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReplicationTaskAssessmentResultsResponse]
  }
}

