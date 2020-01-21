package typings.apolloReactCommon.parserMod

import typings.graphql.astMod.VariableDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentDefinition extends js.Object {
  var name: String
  var `type`: DocumentType
  var variables: js.Array[VariableDefinitionNode]
}

object IDocumentDefinition {
  @scala.inline
  def apply(name: String, `type`: DocumentType, variables: js.Array[VariableDefinitionNode]): IDocumentDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentDefinition]
  }
}

