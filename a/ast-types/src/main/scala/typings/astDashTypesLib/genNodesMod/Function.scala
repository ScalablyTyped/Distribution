package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function extends Node {
  var async: scala.Boolean = js.native
  var body: astDashTypesLib.genKindsMod.BlockStatementKind = js.native
  var defaults: js.Array[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.native
  var expression: scala.Boolean = js.native
  var generator: scala.Boolean = js.native
  var id: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null = js.native
  var params: js.Array[astDashTypesLib.genKindsMod.PatternKind] = js.native
  var rest: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null = js.native
  var returnType: astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null = js.native
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null = js.native
}

