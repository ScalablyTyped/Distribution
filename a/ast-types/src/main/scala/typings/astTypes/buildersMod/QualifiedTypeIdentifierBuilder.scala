package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdLocQualification
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualifiedTypeIdentifierBuilder extends js.Object {
  def apply(qualification: IdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def apply(qualification: QualifiedTypeIdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def from(params: AnonCommentsIdLocQualification): QualifiedTypeIdentifier = js.native
}

