package typings.awsDashSdk.clientsAccessanalyzerMod

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
    `type`: Type,
    lastResourceAnalyzed: String = null,
    lastResourceAnalyzedAt: Timestamp = null,
    tags: TagsMap = null
  ): AnalyzerSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lastResourceAnalyzed != null) __obj.updateDynamic("lastResourceAnalyzed")(lastResourceAnalyzed.asInstanceOf[js.Any])
    if (lastResourceAnalyzedAt != null) __obj.updateDynamic("lastResourceAnalyzedAt")(lastResourceAnalyzedAt.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzerSummary]
  }
}

