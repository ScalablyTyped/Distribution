package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.FlowPredicateKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.^
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Function
  extends StObject
     with Node {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var body: BlockStatementKind = js.native
  
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.native
  
  var expression: js.UndefOr[Boolean] = js.native
  
  var generator: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[IdentifierKind | Null] = js.native
  
  var params: js.Array[PatternKind] = js.native
  
  var predicate: js.UndefOr[FlowPredicateKind | Null] = js.native
  
  var rest: js.UndefOr[IdentifierKind | Null] = js.native
  
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.native
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.native
}
object Function {
  
  @scala.inline
  def apply: Type[Function] = ^.asInstanceOf[js.Dynamic].selectDynamic("Function").asInstanceOf[Type[Function]]
}
