package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Abstract
import typings.astDashTypes.astDashTypesStrings.constructor
import typings.astDashTypes.astDashTypesStrings.get
import typings.astDashTypes.astDashTypesStrings.method
import typings.astDashTypes.astDashTypesStrings.set
import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ClassMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassMethodBuilder extends js.Object {
  def apply(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind
  ): ClassMethod = js.native
  def apply(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ClassMethod = js.native
  def apply(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean,
    staticParam: Boolean
  ): ClassMethod = js.native
  def from(params: Anon_Abstract): ClassMethod = js.native
}

