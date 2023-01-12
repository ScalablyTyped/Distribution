package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsertRet extends StObject {
  
  def insert(insertExpr: Any): UpsertRetInsertRet
}
object UpsertRet {
  
  inline def apply(insert: Any => UpsertRetInsertRet): UpsertRet = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[UpsertRet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpsertRet] (val x: Self) extends AnyVal {
    
    inline def setInsert(value: Any => UpsertRetInsertRet): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
  }
}
