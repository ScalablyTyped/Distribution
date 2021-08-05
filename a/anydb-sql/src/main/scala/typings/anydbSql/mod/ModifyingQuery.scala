package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyingQuery
  extends StObject
     with Executable[Unit] {
  
  def returning[U](nodes: js.Any*): Query[U]
  
  def where(nodes: js.Any*): ModifyingQuery
}
object ModifyingQuery {
  
  inline def apply(
    all: () => typings.bluebird.mod.^[js.Array[Unit]],
    allWithin: DatabaseConnection => typings.bluebird.mod.^[js.Array[Unit]],
    exec: () => typings.bluebird.mod.^[Unit],
    execWithin: DatabaseConnection => typings.bluebird.mod.^[Unit],
    get: () => typings.bluebird.mod.^[Unit],
    getWithin: DatabaseConnection => typings.bluebird.mod.^[Unit],
    returning: /* repeated */ js.Any => Query[js.Any],
    toQuery: () => QueryLike,
    where: /* repeated */ js.Any => ModifyingQuery
  ): ModifyingQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), returning = js.Any.fromFunction1(returning), toQuery = js.Any.fromFunction0(toQuery), where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[ModifyingQuery]
  }
  
  extension [Self <: ModifyingQuery](x: Self) {
    
    inline def setReturning(value: /* repeated */ js.Any => Query[js.Any]): Self = StObject.set(x, "returning", js.Any.fromFunction1(value))
    
    inline def setWhere(value: /* repeated */ js.Any => ModifyingQuery): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
  }
}
