package typings.astTypes.buildersMod

import typings.astTypes.anon.Declaration
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.ExportSpecifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportNamedDeclarationBuilder extends StObject {
  
  def apply(): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: Unit, source: LiteralKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: Unit, source: LiteralKind): ExportNamedDeclaration = js.native
  
  def from(params: Declaration): ExportNamedDeclaration = js.native
}
