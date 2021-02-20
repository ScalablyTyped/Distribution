package typings.astTypes.buildersMod

import typings.astTypes.anon.BodyCommentsIdLoc
import typings.astTypes.kindsMod.EnumBooleanBodyKind
import typings.astTypes.kindsMod.EnumNumberBodyKind
import typings.astTypes.kindsMod.EnumStringBodyKind
import typings.astTypes.kindsMod.EnumSymbolBodyKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumDeclarationBuilder extends StObject {
  
  def apply(id: IdentifierKind, body: EnumBooleanBodyKind): EnumDeclaration = js.native
  def apply(id: IdentifierKind, body: EnumNumberBodyKind): EnumDeclaration = js.native
  def apply(id: IdentifierKind, body: EnumStringBodyKind): EnumDeclaration = js.native
  def apply(id: IdentifierKind, body: EnumSymbolBodyKind): EnumDeclaration = js.native
  
  def from(params: BodyCommentsIdLoc): EnumDeclaration = js.native
}
