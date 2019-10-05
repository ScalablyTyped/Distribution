package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsExprName
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSImportTypeKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeQueryBuilder extends js.Object {
  def apply(exprName: IdentifierKind): TSTypeQuery = js.native
  def apply(exprName: TSImportTypeKind): TSTypeQuery = js.native
  def apply(exprName: TSQualifiedNameKind): TSTypeQuery = js.native
  def from(params: Anon_CommentsExprName): TSTypeQuery = js.native
}

