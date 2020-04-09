package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzerSummary extends js.Object {
  /**
    * The ARN of the analyzer.
    */
  var arn: AnalyzerArn = js.native
  /**
    * A timestamp for the time at which the analyzer was created.
    */
  var createdAt: Timestamp = js.native
  /**
    * The resource that was most recently analyzed by the analyzer.
    */
  var lastResourceAnalyzed: js.UndefOr[String] = js.native
  /**
    * The time at which the most recently analyzed resource was analyzed.
    */
  var lastResourceAnalyzedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the analyzer.
    */
  var name: Name = js.native
  /**
    * The status of the analyzer. An Active analyzer successfully monitors supported resources and generates new findings. The analyzer is Disabled when a user action, such as removing trusted access for IAM Access Analyzer from AWS Organizations, causes the analyzer to stop generating new findings. The status is Creating when the analyzer creation is in progress and Failed when the analyzer creation has failed. 
    */
  var status: AnalyzerStatus = js.native
  /**
    * The statusReason provides more details about the current status of the analyzer. For example, if the creation for the analyzer fails, a Failed status is displayed. For an analyzer with organization as the type, this failure can be due to an issue with creating the service-linked roles required in the member accounts of the AWS organization.
    */
  var statusReason: js.UndefOr[StatusReason] = js.native
  /**
    * The tags added to the analyzer.
    */
  var tags: js.UndefOr[TagsMap] = js.native
  /**
    * The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
    */
  var `type`: Type = js.native
}

object AnalyzerSummary {
  @scala.inline
  def apply(
    arn: AnalyzerArn,
    createdAt: Timestamp,
    name: Name,
    status: AnalyzerStatus,
    `type`: Type,
    lastResourceAnalyzed: String = null,
    lastResourceAnalyzedAt: Timestamp = null,
    statusReason: StatusReason = null,
    tags: TagsMap = null
  ): AnalyzerSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lastResourceAnalyzed != null) __obj.updateDynamic("lastResourceAnalyzed")(lastResourceAnalyzed.asInstanceOf[js.Any])
    if (lastResourceAnalyzedAt != null) __obj.updateDynamic("lastResourceAnalyzedAt")(lastResourceAnalyzedAt.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzerSummary]
  }
}

