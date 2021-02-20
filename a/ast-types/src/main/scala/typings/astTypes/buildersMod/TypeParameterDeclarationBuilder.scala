package typings.astTypes.buildersMod

import typings.astTypes.anon.Params
import typings.astTypes.kindsMod.TypeParameterKind
import typings.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeParameterDeclarationBuilder extends StObject {
  
  def apply(params: js.Array[TypeParameterKind]): TypeParameterDeclaration = js.native
  
  def from(params: Params): TypeParameterDeclaration = js.native
}
