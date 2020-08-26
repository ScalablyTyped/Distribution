package typings.apolloClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.apolloCache.dataProxyMod.DataProxy
import typings.apolloClient.storeMod.QueryWithUpdater
import typings.graphql.astMod.DocumentNode
import typings.graphql.executeMod.ExecutionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var document: DocumentNode = js.native
  var mutationId: String = js.native
  var result: ExecutionResult[StringDictionary[_], StringDictionary[_]] = js.native
  var update: js.UndefOr[js.Function2[/* proxy */ DataProxy, /* mutationResult */ js.Object, Unit]] = js.native
  var updateQueries: StringDictionary[QueryWithUpdater] = js.native
  var variables: js.Any = js.native
}

object Result {
  @scala.inline
  def apply(
    document: DocumentNode,
    mutationId: String,
    result: ExecutionResult[StringDictionary[_], StringDictionary[_]],
    updateQueries: StringDictionary[QueryWithUpdater],
    variables: js.Any
  ): Result = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], mutationId = mutationId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], updateQueries = updateQueries.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutationId(value: String): Self = this.set("mutationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: ExecutionResult[StringDictionary[_], StringDictionary[_]]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateQueries(value: StringDictionary[QueryWithUpdater]): Self = this.set("updateQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: js.Any): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (/* proxy */ DataProxy, /* mutationResult */ js.Object) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

