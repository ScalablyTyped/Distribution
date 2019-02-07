package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassMethodBuilder extends js.Object {
  def apply(
    kind: js.UndefOr[
      astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor
    ],
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.ClassMethod = js.native
  def apply(
    kind: js.UndefOr[
      astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor
    ],
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    computed: scala.Boolean
  ): astDashTypesLib.genNodesMod.ClassMethod = js.native
  def apply(
    kind: js.UndefOr[
      astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor
    ],
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    computed: scala.Boolean,
    staticParam: scala.Boolean
  ): astDashTypesLib.genNodesMod.ClassMethod = js.native
  def from(params: astDashTypesLib.Anon_Abstract): astDashTypesLib.genNodesMod.ClassMethod = js.native
}

