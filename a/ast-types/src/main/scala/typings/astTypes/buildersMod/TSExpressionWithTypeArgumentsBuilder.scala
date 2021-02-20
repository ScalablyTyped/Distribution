package typings.astTypes.buildersMod

import typings.astTypes.anon.LocTypeParameters
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSExpressionWithTypeArgumentsBuilder extends StObject {
  
  def apply(expression: IdentifierKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSQualifiedNameKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  
  def from(params: LocTypeParameters): TSExpressionWithTypeArguments = js.native
}
