package typings.astTypes.buildersMod

import typings.astTypes.anon.RightTypeParameters
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareTypeAliasBuilder extends StObject {
  
  def apply(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): DeclareTypeAlias = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): DeclareTypeAlias = js.native
  
  def from(params: RightTypeParameters): DeclareTypeAlias = js.native
}
