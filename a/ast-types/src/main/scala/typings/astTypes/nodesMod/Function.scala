package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function extends Node {
  var async: Boolean = js.native
  var body: BlockStatementKind = js.native
  var defaults: js.Array[ExpressionKind | Null] = js.native
  var expression: Boolean = js.native
  var generator: Boolean = js.native
  var id: IdentifierKind | Null = js.native
  var params: js.Array[PatternKind] = js.native
  var rest: IdentifierKind | Null = js.native
  var returnType: TypeAnnotationKind | TSTypeAnnotationKind | Null = js.native
  var typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null = js.native
}

