package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.FlowKind
import typings.astTypes.kindsMod.FlowPredicateKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.FlowPredicate, 'type'> */
@js.native
trait DeclaredPredicate
  extends ASTNode
     with FlowKind
     with FlowPredicateKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.DeclaredPredicate = js.native
  
  var value: ExpressionKind = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclaredPredicate")
@js.native
object DeclaredPredicate extends TopLevel[Type[DeclaredPredicate]]
