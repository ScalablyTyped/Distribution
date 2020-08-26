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
  def apply(arn: AnalyzerArn, createdAt: Timestamp, name: Name, status: AnalyzerStatus, `type`: Type): AnalyzerSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzerSummary]
  }
  @scala.inline
  implicit class AnalyzerSummaryOps[Self <: AnalyzerSummary] (val x: Self) extends AnyVal {
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
    def setArn(value: AnalyzerArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: AnalyzerStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastResourceAnalyzed(value: String): Self = this.set("lastResourceAnalyzed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastResourceAnalyzed: Self = this.set("lastResourceAnalyzed", js.undefined)
    @scala.inline
    def setLastResourceAnalyzedAt(value: Timestamp): Self = this.set("lastResourceAnalyzedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastResourceAnalyzedAt: Self = this.set("lastResourceAnalyzedAt", js.undefined)
    @scala.inline
    def setStatusReason(value: StatusReason): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

