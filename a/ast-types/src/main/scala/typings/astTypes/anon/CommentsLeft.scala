package typings.astTypes.anon

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
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentsLeft extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var left: PatternKind | MemberExpressionKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign
  
  var right: ExpressionKind
}
object CommentsLeft {
  
  @scala.inline
  def apply(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign,
    right: ExpressionKind
  ): CommentsLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsLeft]
  }
  
  @scala.inline
  implicit class CommentsLeftMutableBuilder[Self <: CommentsLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: PatternKind | MemberExpressionKind): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setOperator(
      value: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: ExpressionKind): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
