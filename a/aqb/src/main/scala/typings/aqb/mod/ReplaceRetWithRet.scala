package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceRetWithRet extends StObject {
  
  def in(collection: js.Any): ReplaceExpression
  
  def in_(collection: js.Any): ReplaceExpression
  
  @JSName("in")
  var in_Original: js.Function1[/* collection */ js.Any, ReplaceExpression]
  
  @JSName("in_")
  var in__Original: js.Function1[/* collection */ js.Any, ReplaceExpression]
  
  def into(collection: js.Any): ReplaceExpression
  
  def `with`(collection: js.Any): ReplaceRetWithRet
}
object ReplaceRetWithRet {
  
  @scala.inline
  def apply(
    in: /* collection */ js.Any => ReplaceExpression,
    in_ : /* collection */ js.Any => ReplaceExpression,
    into: js.Any => ReplaceExpression,
    `with`: js.Any => ReplaceRetWithRet
  ): ReplaceRetWithRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_), into = js.Any.fromFunction1(into))
    __obj.updateDynamic("with")(js.Any.fromFunction1(`with`))
    __obj.asInstanceOf[ReplaceRetWithRet]
  }
  
  @scala.inline
  implicit class ReplaceRetWithRetMutableBuilder[Self <: ReplaceRetWithRet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: /* collection */ js.Any => ReplaceExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn_(value: /* collection */ js.Any => ReplaceExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInto(value: js.Any => ReplaceExpression): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWith(value: js.Any => ReplaceRetWithRet): Self = StObject.set(x, "with", js.Any.fromFunction1(value))
  }
}
