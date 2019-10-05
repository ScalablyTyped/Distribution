package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsIdLocQualification
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.QualifiedTypeIdentifierKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.QualifiedTypeIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualifiedTypeIdentifierBuilder extends js.Object {
  def apply(qualification: IdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def apply(qualification: QualifiedTypeIdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def from(params: Anon_CommentsIdLocQualification): QualifiedTypeIdentifier = js.native
}

