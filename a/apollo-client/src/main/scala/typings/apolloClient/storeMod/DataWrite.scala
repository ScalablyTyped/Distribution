package typings.apolloClient.storeMod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataWrite extends js.Object {
  var document: DocumentNode = js.native
  var operationName: String | Null = js.native
  var result: js.Any = js.native
  var rootId: String = js.native
  var variables: js.Object = js.native
}

object DataWrite {
  @scala.inline
  def apply(document: DocumentNode, result: js.Any, rootId: String, variables: js.Object): DataWrite = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataWrite]
  }
  @scala.inline
  implicit class DataWriteOps[Self <: DataWrite] (val x: Self) extends AnyVal {
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
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootId(value: String): Self = this.set("rootId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationNameNull: Self = this.set("operationName", null)
  }
  
}

