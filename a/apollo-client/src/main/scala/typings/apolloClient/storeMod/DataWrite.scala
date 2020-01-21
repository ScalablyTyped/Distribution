package typings.apolloClient.storeMod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataWrite extends js.Object {
  var document: DocumentNode
  var operationName: String | Null
  var result: js.Any
  var rootId: String
  var variables: js.Object
}

object DataWrite {
  @scala.inline
  def apply(
    document: DocumentNode,
    result: js.Any,
    rootId: String,
    variables: js.Object,
    operationName: String = null
  ): DataWrite = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataWrite]
  }
}

