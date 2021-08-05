package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.astTypesStrings.AmpersandEqualssign
import typings.astTypes.astTypesStrings.AsteriskAsteriskEqualssign
import typings.astTypes.astTypesStrings.AsteriskEqualssign
import typings.astTypes.astTypesStrings.Equalssign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansignEqualssign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typings.astTypes.astTypesStrings.LessthansignLessthansignEqualssign
import typings.astTypes.astTypesStrings.PercentsignEqualssign
import typings.astTypes.astTypesStrings.PlussignEqualssign
import typings.astTypes.astTypesStrings.SlashEqualssign
import typings.astTypes.astTypesStrings.VerticallineEqualssign
import typings.astTypes.astTypesStrings.`-Equalssign`
import typings.astTypes.astTypesStrings.`^Equalssign`
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.MemberExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
trait AssignmentExpression
  extends StObject
     with ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var left: PatternKind | MemberExpressionKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign
  
  var right: ExpressionKind
  
  var `type`: typings.astTypes.astTypesStrings.AssignmentExpression
}
object AssignmentExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.AssignmentExpression")
  @js.native
  val ^ : Type[AssignmentExpression] = js.native
  
  extension [Self <: AssignmentExpression](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLeft(value: PatternKind | MemberExpressionKind): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setOperator(
      value: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: ExpressionKind): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.astTypes.astTypesStrings.AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
