package typings.astTypes.buildersMod

import typings.astTypes.anon.Kind
import typings.astTypes.astTypesStrings.constructor
import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.FunctionKind
import typings.astTypes.namedTypesMod.namedTypes.MethodDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def from(params: Kind): MethodDefinition = js.native
}
