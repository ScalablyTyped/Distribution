package typings.astTypes.anon

import typings.astTypes.astTypesStrings.Ampersand
import typings.astTypes.astTypesStrings.Asterisk
import typings.astTypes.astTypesStrings.AsteriskAsterisk
import typings.astTypes.astTypesStrings.EqualssignEqualssign
import typings.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typings.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typings.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.astTypes.astTypesStrings.Greaterthansign
import typings.astTypes.astTypesStrings.GreaterthansignEqualssign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.astTypes.astTypesStrings.Lessthansign
import typings.astTypes.astTypesStrings.LessthansignEqualssign
import typings.astTypes.astTypesStrings.LessthansignLessthansign
import typings.astTypes.astTypesStrings.Percentsign
import typings.astTypes.astTypesStrings.Plussign
import typings.astTypes.astTypesStrings.Slash
import typings.astTypes.astTypesStrings.Verticalline
import typings.astTypes.astTypesStrings.^
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.astTypesStrings.in
import typings.astTypes.astTypesStrings.instanceof
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Right extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var left: ExpressionKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | ^ | in | instanceof | AsteriskAsterisk
  
  var right: ExpressionKind
}
object Right {
  
  inline def apply(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | ^ | in | instanceof | AsteriskAsterisk,
    right: ExpressionKind
  ): Right = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
  
  extension [Self <: Right](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLeft(value: ExpressionKind): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setOperator(
      value: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | ^ | in | instanceof | AsteriskAsterisk
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: ExpressionKind): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
