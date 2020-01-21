package typings.astTypes.buildersMod

import typings.astTypes.AnonAccessibility
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.ObjectProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPropertyBuilder extends js.Object {
  def apply(key: ExpressionKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: ExpressionKind, value: PatternKind): ObjectProperty = js.native
  def apply(key: IdentifierKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: IdentifierKind, value: PatternKind): ObjectProperty = js.native
  def apply(key: LiteralKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: LiteralKind, value: PatternKind): ObjectProperty = js.native
  def from(params: AnonAccessibility): ObjectProperty = js.native
}

