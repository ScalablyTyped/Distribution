package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.ModuleSpecifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.SpecifierKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier, 'type'> */
@js.native
trait ImportSpecifier
  extends ASTNode
     with ModuleSpecifierKind
     with NodeKind
     with PrintableKind
     with SpecifierKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var id: js.UndefOr[IdentifierKind | Null] = js.native
  
  var imported: IdentifierKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var local: js.UndefOr[IdentifierKind | Null] = js.native
  
  var name: js.UndefOr[IdentifierKind | Null] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.ImportSpecifier = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.ImportSpecifier")
@js.native
object ImportSpecifier extends TopLevel[Type[ImportSpecifier]]
