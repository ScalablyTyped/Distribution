package typings.astTypes.buildersMod

import typings.astTypes.anon.Impltype
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.OpaqueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpaqueTypeBuilder extends StObject {
  
  def apply(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind): OpaqueType = js.native
  def apply(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind, supertype: FlowTypeKind): OpaqueType = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, impltype: FlowTypeKind): OpaqueType = js.native
  def apply(
    id: IdentifierKind,
    typeParameters: TypeParameterDeclarationKind,
    impltype: FlowTypeKind,
    supertype: FlowTypeKind
  ): OpaqueType = js.native
  
  def from(params: Impltype): OpaqueType = js.native
}
