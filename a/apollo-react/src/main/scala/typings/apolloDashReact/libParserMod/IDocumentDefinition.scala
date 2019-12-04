package typings.apolloDashReact.libParserMod

import typings.typedDashGraphql.graphqlMod.VariableDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentDefinition extends js.Object {
  var name: String
  var `type`: DocumentType
  var variables: js.Array[VariableDefinition]
}

object IDocumentDefinition {
  @scala.inline
  def apply(name: String, `type`: DocumentType, variables: js.Array[VariableDefinition]): IDocumentDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentDefinition]
  }
}

