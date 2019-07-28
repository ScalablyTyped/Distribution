package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsIdIsExport
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSExternalModuleReferenceKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSImportEqualsDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSImportEqualsDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, moduleReference: IdentifierKind): TSImportEqualsDeclaration = js.native
  def apply(id: IdentifierKind, moduleReference: TSExternalModuleReferenceKind): TSImportEqualsDeclaration = js.native
  def apply(id: IdentifierKind, moduleReference: TSQualifiedNameKind): TSImportEqualsDeclaration = js.native
  def from(params: Anon_CommentsIdIsExport): TSImportEqualsDeclaration = js.native
}

