package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsDefinition
import typings.astTypes.kindsMod.ClassPropertyDefinitionKind
import typings.astTypes.kindsMod.ClassPropertyKind
import typings.astTypes.kindsMod.MethodDefinitionKind
import typings.astTypes.kindsMod.VariableDeclaratorKind
import typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassPropertyDefinitionBuilder extends js.Object {
  def apply(definition: ClassPropertyDefinitionKind): ClassPropertyDefinition = js.native
  def apply(definition: ClassPropertyKind): ClassPropertyDefinition = js.native
  def apply(definition: MethodDefinitionKind): ClassPropertyDefinition = js.native
  def apply(definition: VariableDeclaratorKind): ClassPropertyDefinition = js.native
  def from(params: AnonCommentsDefinition): ClassPropertyDefinition = js.native
}

