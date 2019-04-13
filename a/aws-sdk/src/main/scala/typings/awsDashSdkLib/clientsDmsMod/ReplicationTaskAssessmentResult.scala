package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationTaskAssessmentResult extends js.Object {
  /**
    *  The task assessment results in JSON format. 
    */
  var AssessmentResults: js.UndefOr[String] = js.undefined
  /**
    *  The file containing the results of the task assessment. 
    */
  var AssessmentResultsFile: js.UndefOr[String] = js.undefined
  /**
    *  The status of the task assessment. 
    */
  var AssessmentStatus: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  /**
    *  The replication task identifier of the task on which the task assessment was run. 
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The date the task assessment was completed. 
    */
  var ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp] = js.undefined
  /**
    *  The URL of the S3 object containing the task assessment results. 
    */
  var S3ObjectUrl: js.UndefOr[String] = js.undefined
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
    if (AssessmentResults != null) __obj.updateDynamic("AssessmentResults")(AssessmentResults)
    if (AssessmentResultsFile != null) __obj.updateDynamic("AssessmentResultsFile")(AssessmentResultsFile)
    if (AssessmentStatus != null) __obj.updateDynamic("AssessmentStatus")(AssessmentStatus)
    if (ReplicationTaskArn != null) __obj.updateDynamic("ReplicationTaskArn")(ReplicationTaskArn)
    if (ReplicationTaskIdentifier != null) __obj.updateDynamic("ReplicationTaskIdentifier")(ReplicationTaskIdentifier)
    if (ReplicationTaskLastAssessmentDate != null) __obj.updateDynamic("ReplicationTaskLastAssessmentDate")(ReplicationTaskLastAssessmentDate)
    if (S3ObjectUrl != null) __obj.updateDynamic("S3ObjectUrl")(S3ObjectUrl)
    __obj.asInstanceOf[ReplicationTaskAssessmentResult]
  }
}

