package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_AbstractAccessAccessibility
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NoopKind
import typings.astDashTypes.genKindsMod.NumericLiteralKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSDeclareMethodBuilder extends js.Object {
  def apply(key: ExpressionKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: ExpressionKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: ExpressionKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def apply(key: IdentifierKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def apply(key: NumericLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def apply(key: StringLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: StringLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: StringLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def from(params: Anon_AbstractAccessAccessibility): TSDeclareMethod = js.native
}

