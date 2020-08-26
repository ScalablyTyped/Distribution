package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.algoliaClientSearchStrings.contains
import typings.algoliaClientSearch.algoliaClientSearchStrings.endsWith
import typings.algoliaClientSearch.algoliaClientSearchStrings.is
import typings.algoliaClientSearch.algoliaClientSearchStrings.startsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * If set to true, alternatives make the rule to trigger on synonyms, typos and plurals.
    * Note that setting ignorePlurals to false overrides this parameter.
    */
  val alternatives: js.UndefOr[Boolean] = js.native
  /**
    * is | startsWith | endsWith | contains: Whether the pattern must match the beginning or the end of the query string, or both, or none.
    */
  val anchoring: js.UndefOr[is | startsWith | endsWith | contains] = js.native
  /**
    * Rule context (format: [A-Za-z0-9_-]+). When specified, the rule is contextual and applies only when the same context is specified at query time (using the ruleContexts parameter).
    * When absent, the rule is generic and always applies (provided that its other conditions are met, of course).
    */
  val context: js.UndefOr[String] = js.native
  /**
    * Query patterns are expressed as a string with a specific syntax. A pattern is a sequence of tokens.
    */
  val pattern: js.UndefOr[String] = js.native
}

object Condition {
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlternatives(value: Boolean): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternatives: Self = this.set("alternatives", js.undefined)
    @scala.inline
    def setAnchoring(value: is | startsWith | endsWith | contains): Self = this.set("anchoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchoring: Self = this.set("anchoring", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
  
}

