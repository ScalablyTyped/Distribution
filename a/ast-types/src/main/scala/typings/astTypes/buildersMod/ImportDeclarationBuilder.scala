package typings.astTypes.buildersMod

import typings.astTypes.anon.ImportKind
import typings.astTypes.astTypesStrings.`type`
import typings.astTypes.astTypesStrings.typeof
import typings.astTypes.astTypesStrings.value
import typings.astTypes.kindsMod.ImportDefaultSpecifierKind
import typings.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typings.astTypes.kindsMod.ImportSpecifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDeclarationBuilder extends StObject {
  
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: `type`
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: typeof
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: value
  ): ImportDeclaration = js.native
  def apply(specifiers: Unit, source: LiteralKind): ImportDeclaration = js.native
  def apply(specifiers: Unit, source: LiteralKind, importKind: `type`): ImportDeclaration = js.native
  def apply(specifiers: Unit, source: LiteralKind, importKind: typeof): ImportDeclaration = js.native
  def apply(specifiers: Unit, source: LiteralKind, importKind: value): ImportDeclaration = js.native
  
  def from(params: ImportKind): ImportDeclaration = js.native
}
