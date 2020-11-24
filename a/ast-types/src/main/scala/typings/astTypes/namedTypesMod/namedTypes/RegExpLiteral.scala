package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.anon.Flags
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> */
@js.native
trait RegExpLiteral
  extends ASTNode
     with ExpressionKind
     with LiteralKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var flags: String = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var pattern: String = js.native
  
  var regex: js.UndefOr[Flags | Null] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.RegExpLiteral = js.native
  
  var value: js.UndefOr[RegExp] = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.RegExpLiteral")
@js.native
object RegExpLiteral extends TopLevel[Type[RegExpLiteral]]
