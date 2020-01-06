package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTaskAssessmentResult extends js.Object {
  /**
    *  The task assessment results in JSON format. 
    */
  var AssessmentResults: js.UndefOr[String] = js.native
  /**
    *  The file containing the results of the task assessment. 
    */
  var AssessmentResultsFile: js.UndefOr[String] = js.native
  /**
    *  The status of the task assessment. 
    */
  var AssessmentStatus: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  /**
    *  The replication task identifier of the task on which the task assessment was run. 
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.native
  /**
    * The date the task assessment was completed. 
    */
  var ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp] = js.native
  /**
    *  The URL of the S3 object containing the task assessment results. 
    */
  var S3ObjectUrl: js.UndefOr[String] = js.native
}

object ReplicationTaskAssessmentResult {
  @scala.inline
  def apply(
    AssessmentResults: String = null,
    AssessmentResultsFile: String = null,
    AssessmentStatus: String = null,
    ReplicationTaskArn: String = null,
    ReplicationTaskIdentifier: String = null,
    ReplicationTaskLastAssessmentDate: TStamp = null,
    S3ObjectUrl: String = null
  ): ReplicationTaskAssessmentResult = {
    val __obj = js.Dynamic.literal()
    if (AssessmentResults != null) __obj.updateDynamic("AssessmentResults")(AssessmentResults.asInstanceOf[js.Any])
    if (AssessmentResultsFile != null) __obj.updateDynamic("AssessmentResultsFile")(AssessmentResultsFile.asInstanceOf[js.Any])
    if (AssessmentStatus != null) __obj.updateDynamic("AssessmentStatus")(AssessmentStatus.asInstanceOf[js.Any])
    if (ReplicationTaskArn != null) __obj.updateDynamic("ReplicationTaskArn")(ReplicationTaskArn.asInstanceOf[js.Any])
    if (ReplicationTaskIdentifier != null) __obj.updateDynamic("ReplicationTaskIdentifier")(ReplicationTaskIdentifier.asInstanceOf[js.Any])
    if (ReplicationTaskLastAssessmentDate != null) __obj.updateDynamic("ReplicationTaskLastAssessmentDate")(ReplicationTaskLastAssessmentDate.asInstanceOf[js.Any])
    if (S3ObjectUrl != null) __obj.updateDynamic("S3ObjectUrl")(S3ObjectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTaskAssessmentResult]
  }
}

