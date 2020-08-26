package typings.apolloReact.parserMod

import typings.typedGraphql.mod.VariableDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentDefinition extends js.Object {
  var name: String = js.native
  var `type`: DocumentType = js.native
  var variables: js.Array[VariableDefinition] = js.native
}

object IDocumentDefinition {
  @scala.inline
  def apply(name: String, `type`: DocumentType, variables: js.Array[VariableDefinition]): IDocumentDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentDefinition]
  }
  @scala.inline
  implicit class IDocumentDefinitionOps[Self <: IDocumentDefinition] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DocumentType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariablesVarargs(value: VariableDefinition*): Self = this.set("variables", js.Array(value :_*))
    @scala.inline
    def setVariables(value: js.Array[VariableDefinition]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

