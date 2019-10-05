package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsDefinition
import typings.astDashTypes.genKindsMod.ClassPropertyDefinitionKind
import typings.astDashTypes.genKindsMod.ClassPropertyKind
import typings.astDashTypes.genKindsMod.MethodDefinitionKind
import typings.astDashTypes.genKindsMod.VariableDeclaratorKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPropertyDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassPropertyDefinitionBuilder extends js.Object {
  def apply(definition: ClassPropertyDefinitionKind): ClassPropertyDefinition = js.native
  def apply(definition: ClassPropertyKind): ClassPropertyDefinition = js.native
  def apply(definition: MethodDefinitionKind): ClassPropertyDefinition = js.native
  def apply(definition: VariableDeclaratorKind): ClassPropertyDefinition = js.native
  def from(params: Anon_CommentsDefinition): ClassPropertyDefinition = js.native
}

