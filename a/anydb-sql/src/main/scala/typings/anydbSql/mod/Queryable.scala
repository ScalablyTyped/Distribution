package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queryable[T] extends StObject {
  
  def delete(): ModifyingQuery = js.native
  
  def select[U](nodes: js.Any*): Query[U] = js.native
  
  def selectDeep[U](nodesOrTables: js.Any*): Query[U] = js.native
  
  def where(nodes: js.Any*): Query[T] = js.native
}
object Queryable {
  
  @scala.inline
  def apply[T](
    delete: () => ModifyingQuery,
    select: /* repeated */ js.Any => Query[js.Any],
    selectDeep: /* repeated */ js.Any => Query[js.Any],
    where: /* repeated */ js.Any => Query[T]
  ): Queryable[T] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), select = js.Any.fromFunction1(select), selectDeep = js.Any.fromFunction1(selectDeep), where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[Queryable[T]]
  }
  
  @scala.inline
  implicit class QueryableMutableBuilder[Self <: Queryable[_], T] (val x: Self with Queryable[T]) extends AnyVal {
    
    @scala.inline
    def setDelete(value: () => ModifyingQuery): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelect(value: /* repeated */ js.Any => Query[js.Any]): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectDeep(value: /* repeated */ js.Any => Query[js.Any]): Self = StObject.set(x, "selectDeep", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhere(value: /* repeated */ js.Any => Query[T]): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
  }
}
