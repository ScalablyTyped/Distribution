package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExprName
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSImportTypeKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeQueryBuilder extends js.Object {
  def apply(exprName: IdentifierKind): TSTypeQuery = js.native
  def apply(exprName: TSImportTypeKind): TSTypeQuery = js.native
  def apply(exprName: TSQualifiedNameKind): TSTypeQuery = js.native
  def from(params: AnonCommentsExprName): TSTypeQuery = js.native
}

