package typings.astTypes.buildersMod

import typings.astTypes.anon.Declarations
import typings.astTypes.astTypesStrings.`var`
import typings.astTypes.astTypesStrings.const
import typings.astTypes.astTypesStrings.let
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.VariableDeclaratorKind
import typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclarationBuilder extends StObject {
  
  def apply(kind: `var`, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: const, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: let, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  
  def from(params: Declarations): VariableDeclaration = js.native
}
