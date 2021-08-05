package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Executable[T] extends StObject {
  
  def all(): typings.bluebird.mod.^[js.Array[T]]
  
  def allWithin(tx: DatabaseConnection): typings.bluebird.mod.^[js.Array[T]]
  
  def exec(): typings.bluebird.mod.^[Unit]
  
  def execWithin(tx: DatabaseConnection): typings.bluebird.mod.^[Unit]
  
  def get(): typings.bluebird.mod.^[T]
  
  def getWithin(tx: DatabaseConnection): typings.bluebird.mod.^[T]
  
  def toQuery(): QueryLike
}
object Executable {
  
  inline def apply[T](
    all: () => typings.bluebird.mod.^[js.Array[T]],
    allWithin: DatabaseConnection => typings.bluebird.mod.^[js.Array[T]],
    exec: () => typings.bluebird.mod.^[Unit],
    execWithin: DatabaseConnection => typings.bluebird.mod.^[Unit],
    get: () => typings.bluebird.mod.^[T],
    getWithin: DatabaseConnection => typings.bluebird.mod.^[T],
    toQuery: () => QueryLike
  ): Executable[T] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allWithin = js.Any.fromFunction1(allWithin), exec = js.Any.fromFunction0(exec), execWithin = js.Any.fromFunction1(execWithin), get = js.Any.fromFunction0(get), getWithin = js.Any.fromFunction1(getWithin), toQuery = js.Any.fromFunction0(toQuery))
    __obj.asInstanceOf[Executable[T]]
  }
  
  extension [Self <: Executable[?], T](x: Self & Executable[T]) {
    
    inline def setAll(value: () => typings.bluebird.mod.^[js.Array[T]]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
    
    inline def setAllWithin(value: DatabaseConnection => typings.bluebird.mod.^[js.Array[T]]): Self = StObject.set(x, "allWithin", js.Any.fromFunction1(value))
    
    inline def setExec(value: () => typings.bluebird.mod.^[Unit]): Self = StObject.set(x, "exec", js.Any.fromFunction0(value))
    
    inline def setExecWithin(value: DatabaseConnection => typings.bluebird.mod.^[Unit]): Self = StObject.set(x, "execWithin", js.Any.fromFunction1(value))
    
    inline def setGet(value: () => typings.bluebird.mod.^[T]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setGetWithin(value: DatabaseConnection => typings.bluebird.mod.^[T]): Self = StObject.set(x, "getWithin", js.Any.fromFunction1(value))
    
    inline def setToQuery(value: () => QueryLike): Self = StObject.set(x, "toQuery", js.Any.fromFunction0(value))
  }
}
