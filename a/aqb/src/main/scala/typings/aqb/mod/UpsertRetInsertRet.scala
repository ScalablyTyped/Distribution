package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsertRetInsertRet extends StObject {
  
  def replace(updateOrReplaceExpr: js.Any): UpsertRetInsertRetUpdateRet
  @JSName("replace")
  var replace_Original: js.Function1[/* updateOrReplaceExpr */ js.Any, UpsertRetInsertRetUpdateRet]
  
  def update(updateOrReplaceExpr: js.Any): UpsertRetInsertRetUpdateRet
}
object UpsertRetInsertRet {
  
  @scala.inline
  def apply(
    replace: /* updateOrReplaceExpr */ js.Any => UpsertRetInsertRetUpdateRet,
    update: js.Any => UpsertRetInsertRetUpdateRet
  ): UpsertRetInsertRet = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction1(replace), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UpsertRetInsertRet]
  }
  
  @scala.inline
  implicit class UpsertRetInsertRetMutableBuilder[Self <: UpsertRetInsertRet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplace(value: /* updateOrReplaceExpr */ js.Any => UpsertRetInsertRetUpdateRet): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: js.Any => UpsertRetInsertRetUpdateRet): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
