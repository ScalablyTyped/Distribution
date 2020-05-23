package typings.apolloClient.anon

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document[TVariables] extends js.Object {
  var document: DocumentNode
  var previousResult: js.Any
  var variables: js.UndefOr[TVariables] = js.undefined
}

object Document {
  @scala.inline
  def apply[TVariables](document: DocumentNode, previousResult: js.Any, variables: TVariables = null): Document[TVariables] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], previousResult = previousResult.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document[TVariables]]
  }
}

