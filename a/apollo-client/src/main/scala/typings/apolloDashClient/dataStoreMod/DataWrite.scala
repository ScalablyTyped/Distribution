package typings.apolloDashClient.dataStoreMod

import typings.graphql.languageAstMod.DocumentNode
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
    val __obj = js.Dynamic.literal(document = document, result = result, rootId = rootId, variables = variables)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    __obj.asInstanceOf[DataWrite]
  }
}

