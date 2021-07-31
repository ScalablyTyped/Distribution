package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsertRet extends StObject {
  
  def insert(insertExpr: js.Any): UpsertRetInsertRet
}
object UpsertRet {
  
  @scala.inline
  def apply(insert: js.Any => UpsertRetInsertRet): UpsertRet = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[UpsertRet]
  }
  
  @scala.inline
  implicit class UpsertRetMutableBuilder[Self <: UpsertRet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsert(value: js.Any => UpsertRetInsertRet): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
  }
}
