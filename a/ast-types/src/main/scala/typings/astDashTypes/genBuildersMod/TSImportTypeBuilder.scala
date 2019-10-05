package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_ArgumentCommentsLocQualifier
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genKindsMod.TSTypeParameterInstantiationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSImportTypeBuilder extends js.Object {
  def apply(argument: StringLiteralKind): TSImportType = js.native
  def apply(
    argument: StringLiteralKind,
    qualifier: js.UndefOr[scala.Nothing],
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def apply(argument: StringLiteralKind, qualifier: IdentifierKind): TSImportType = js.native
  def apply(
    argument: StringLiteralKind,
    qualifier: IdentifierKind,
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def apply(argument: StringLiteralKind, qualifier: TSQualifiedNameKind): TSImportType = js.native
  def apply(
    argument: StringLiteralKind,
    qualifier: TSQualifiedNameKind,
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def from(params: Anon_ArgumentCommentsLocQualifier): TSImportType = js.native
}

