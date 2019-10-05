package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsComputedConstructor
import typings.astDashTypes.astDashTypesStrings.constructor
import typings.astDashTypes.astDashTypesStrings.get
import typings.astDashTypes.astDashTypesStrings.method
import typings.astDashTypes.astDashTypesStrings.set
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.FunctionKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.MethodDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodDefinitionBuilder extends js.Object {
  def apply(kind: constructor, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: constructor, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def apply(kind: get, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: get, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def apply(kind: method, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: method, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def apply(kind: set, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: set, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def from(params: Anon_CommentsComputedConstructor): MethodDefinition = js.native
}

