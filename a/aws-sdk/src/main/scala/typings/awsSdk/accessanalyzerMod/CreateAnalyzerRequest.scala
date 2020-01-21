package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAnalyzerRequest extends js.Object {
  /**
    * The name of the analyzer to create.
    */
  var analyzerName: Name = js.native
  /**
    * Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that meet the criteria you define for the rule.
    */
  var archiveRules: js.UndefOr[InlineArchiveRulesList] = js.native
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The tags to apply to the analyzer.
    */
  var tags: js.UndefOr[TagsMap] = js.native
  /**
    * The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer per account per Region.
    */
  var `type`: Type = js.native
}

object CreateAnalyzerRequest {
  @scala.inline
  def apply(
    analyzerName: Name,
    `type`: Type,
    archiveRules: InlineArchiveRulesList = null,
    clientToken: String = null,
    tags: TagsMap = null
  ): CreateAnalyzerRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (archiveRules != null) __obj.updateDynamic("archiveRules")(archiveRules.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnalyzerRequest]
  }
}

