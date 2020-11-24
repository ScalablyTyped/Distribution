package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.CallExpressionKind
import typings.astTypes.kindsMod.ChainElementKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.kindsMod.TypeParameterInstantiationKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.CallExpression, 'type' | 'optional'> */
@js.native
trait OptionalCallExpression
  extends ASTNode
     with CallExpressionKind
     with ChainElementKind
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var arguments: js.Array[ExpressionKind | SpreadElementKind] = js.native
  
  var callee: ExpressionKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.OptionalCallExpression = js.native
  
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.OptionalCallExpression")
@js.native
object OptionalCallExpression extends TopLevel[Type[OptionalCallExpression]]
