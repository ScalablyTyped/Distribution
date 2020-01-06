package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogPattern extends js.Object {
  /**
    * A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters, and it cannot be empty.
    */
  var Pattern: js.UndefOr[LogPatternRegex] = js.native
  /**
    * The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
    */
  var PatternName: js.UndefOr[LogPatternName] = js.native
  /**
    * The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
    */
  var PatternSetName: js.UndefOr[LogPatternSetName] = js.native
  /**
    * Rank of the log pattern.
    */
  var Rank: js.UndefOr[LogPatternRank] = js.native
}

object LogPattern {
  @scala.inline
  def apply(
    Pattern: LogPatternRegex = null,
    PatternName: LogPatternName = null,
    PatternSetName: LogPatternSetName = null,
    Rank: Int | Double = null
  ): LogPattern = {
    val __obj = js.Dynamic.literal()
    if (Pattern != null) __obj.updateDynamic("Pattern")(Pattern.asInstanceOf[js.Any])
    if (PatternName != null) __obj.updateDynamic("PatternName")(PatternName.asInstanceOf[js.Any])
    if (PatternSetName != null) __obj.updateDynamic("PatternSetName")(PatternSetName.asInstanceOf[js.Any])
    if (Rank != null) __obj.updateDynamic("Rank")(Rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogPattern]
  }
}

