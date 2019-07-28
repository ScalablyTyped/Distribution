package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsKey
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ObjectTypeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypePropertyBuilder extends js.Object {
  def apply(key: IdentifierKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  def apply(key: LiteralKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  def from(params: Anon_CommentsKey): ObjectTypeProperty = js.native
}

