package typings.astTypes.buildersMod

import typings.astTypes.anon.ExprName
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSImportTypeKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeQueryBuilder extends StObject {
  
  def apply(exprName: IdentifierKind): TSTypeQuery = js.native
  def apply(exprName: TSImportTypeKind): TSTypeQuery = js.native
  def apply(exprName: TSQualifiedNameKind): TSTypeQuery = js.native
  
  def from(params: ExprName): TSTypeQuery = js.native
}
