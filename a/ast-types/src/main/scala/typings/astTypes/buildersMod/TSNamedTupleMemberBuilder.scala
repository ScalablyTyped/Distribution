package typings.astTypes.buildersMod

import typings.astTypes.anon.ElementTypeLabel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNamedTupleMemberBuilder extends js.Object {
  
  def apply(label: IdentifierKind, elementType: TSTypeKind): TSNamedTupleMember = js.native
  def apply(label: IdentifierKind, elementType: TSTypeKind, optional: Boolean): TSNamedTupleMember = js.native
  
  def from(params: ElementTypeLabel): TSNamedTupleMember = js.native
}
