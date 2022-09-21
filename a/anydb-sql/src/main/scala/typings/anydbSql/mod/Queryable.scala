package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queryable[T] extends StObject {
  
  def delete(): ModifyingQuery
  
  def select[U](nodes: Any*): Query[U]
  
  def selectDeep[U](nodesOrTables: Any*): Query[U]
  
  def where(nodes: Any*): Query[T]
}
object Queryable {
  
  inline def apply[T](
    delete: () => ModifyingQuery,
    select: /* repeated */ Any => Query[Any],
    selectDeep: /* repeated */ Any => Query[Any],
    where: /* repeated */ Any => Query[T]
  ): Queryable[T] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), select = js.Any.fromFunction1(select), selectDeep = js.Any.fromFunction1(selectDeep), where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[Queryable[T]]
  }
  
  extension [Self <: Queryable[?], T](x: Self & Queryable[T]) {
    
    inline def setDelete(value: () => ModifyingQuery): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    inline def setSelect(value: /* repeated */ Any => Query[Any]): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectDeep(value: /* repeated */ Any => Query[Any]): Self = StObject.set(x, "selectDeep", js.Any.fromFunction1(value))
    
    inline def setWhere(value: /* repeated */ Any => Query[T]): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
  }
}
