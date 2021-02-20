package typings.astTypes.buildersMod

import typings.astTypes.anon.TypeName
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeReferenceBuilder extends StObject {
  
  def apply(typeName: IdentifierKind): TSTypeReference = js.native
  def apply(typeName: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def apply(typeName: TSQualifiedNameKind): TSTypeReference = js.native
  def apply(typeName: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  
  def from(params: TypeName): TSTypeReference = js.native
}
