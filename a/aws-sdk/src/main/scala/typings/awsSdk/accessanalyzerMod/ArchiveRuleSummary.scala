package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveRuleSummary extends js.Object {
  /**
    * The time at which the archive rule was created.
    */
  var createdAt: Timestamp = js.native
  /**
    * A filter used to define the archive rule.
    */
  var filter: FilterCriteriaMap = js.native
  /**
    * The name of the archive rule.
    */
  var ruleName: Name = js.native
  /**
    * The time at which the archive rule was last updated.
    */
  var updatedAt: Timestamp = js.native
}

object ArchiveRuleSummary {
  @scala.inline
  def apply(createdAt: Timestamp, filter: FilterCriteriaMap, ruleName: Name, updatedAt: Timestamp): ArchiveRuleSummary = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveRuleSummary]
  }
  @scala.inline
  implicit class ArchiveRuleSummaryOps[Self <: ArchiveRuleSummary] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: FilterCriteriaMap): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleName(value: Name): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
  }
  
}

