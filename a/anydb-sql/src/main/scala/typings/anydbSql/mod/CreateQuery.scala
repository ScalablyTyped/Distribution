package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuery
  extends StObject
     with Executable[Unit] {
  
  def ifNotExists(): Executable[Unit]
}
object CreateQuery {
  
  inline def apply(
    all: () => typings.bluebird.mod.^[js.Array[Unit]],
    allWithin: DatabaseConnection => typings.bluebird.mod.^[js.Array[Unit]],
    exec: () => typings.bluebird.mod.^[Unit],
    execWithin: DatabaseConnection => typings.bluebird.mod.^[Unit],
    get: () => typings.bluebird.mod.^[Unit],
    getWithin: DatabaseConnection => typings.bluebird.mod.^[Unit],
    ifNotExists: () => Executable[Unit],
    toQuery: () => QueryLike
  ): CreateQuery = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), ifNotExists = js.Any.fromFunction0(ifNotExists), toQuery = js.Any.fromFunction0(toQuery))
    __obj.asInstanceOf[CreateQuery]
  }
  
  extension [Self <: CreateQuery](x: Self) {
    
    inline def setIfNotExists(value: () => Executable[Unit]): Self = StObject.set(x, "ifNotExists", js.Any.fromFunction0(value))
  }
}
