package typings.astTypes.buildersMod

import typings.astTypes.AnonArgumentCommentsLocQualifier
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typings.astTypes.namedTypesMod.namedTypes.TSImportType
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
  def from(params: AnonArgumentCommentsLocQualifier): TSImportType = js.native
}

