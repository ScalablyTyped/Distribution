package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TSTypeParameterDeclarationKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
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

