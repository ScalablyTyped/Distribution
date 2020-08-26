package typings.apolloClient.anon

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document[TVariables] extends js.Object {
  var document: DocumentNode = js.native
  var previousResult: js.Any = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object Document {
  @scala.inline
  def apply[TVariables](document: DocumentNode, previousResult: js.Any): Document[TVariables] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], previousResult = previousResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document[TVariables]]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document[_], TVariables] (val x: Self with Document[TVariables]) extends AnyVal {
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
    def setPreviousResult(value: js.Any): Self = this.set("previousResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

