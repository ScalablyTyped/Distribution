package typings.apolloLink.testingUtilsMod

import typings.apolloLink.linkMod.ApolloLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultType extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  var link: ApolloLink = js.native
  var query: js.UndefOr[String] = js.native
  var results: js.UndefOr[js.Array[_]] = js.native
  var variables: js.UndefOr[js.Any] = js.native
}

object TestResultType {
  @scala.inline
  def apply(link: ApolloLink): TestResultType = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultType]
  }
  @scala.inline
  implicit class TestResultTypeOps[Self <: TestResultType] (val x: Self) extends AnyVal {
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
    def setLink(value: ApolloLink): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDone(value: () => Unit): Self = this.set("done", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setResultsVarargs(value: js.Any*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[_]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setVariables(value: js.Any): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

