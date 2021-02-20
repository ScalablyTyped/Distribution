package typings.astTypes.buildersMod

import typings.astTypes.anon.Source
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAllDeclarationBuilder extends StObject {
  
  def apply(source: LiteralKind): ExportAllDeclaration = js.native
  def apply(source: LiteralKind, exported: IdentifierKind): ExportAllDeclaration = js.native
  
  def from(params: Source): ExportAllDeclaration = js.native
}
