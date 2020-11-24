package typings.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queryable[T] extends js.Object {
  
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
  implicit class QueryableOps[Self <: Queryable[_], T] (val x: Self with Queryable[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelete(value: () => ModifyingQuery): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelect(value: /* repeated */ js.Any => Query[js.Any]): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectDeep(value: /* repeated */ js.Any => Query[js.Any]): Self = this.set("selectDeep", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhere(value: /* repeated */ js.Any => Query[T]): Self = this.set("where", js.Any.fromFunction1(value))
  }
}
