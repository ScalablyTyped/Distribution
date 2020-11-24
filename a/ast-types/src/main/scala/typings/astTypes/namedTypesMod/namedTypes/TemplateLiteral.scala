package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TemplateElementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait TemplateLiteral
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var expressions: js.Array[ExpressionKind] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var quasis: js.Array[TemplateElementKind] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.TemplateLiteral = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.TemplateLiteral")
@js.native
object TemplateLiteral extends TopLevel[Type[TemplateLiteral]]
