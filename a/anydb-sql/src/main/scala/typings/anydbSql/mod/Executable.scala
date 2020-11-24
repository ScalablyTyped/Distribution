package typings.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Executable[T] extends js.Object {
  
  def all(): typings.bluebird.mod.^[js.Array[T]] = js.native
  
  def allWithin(tx: DatabaseConnection): typings.bluebird.mod.^[js.Array[T]] = js.native
  
  def exec(): typings.bluebird.mod.^[Unit] = js.native
  
  def execWithin(tx: DatabaseConnection): typings.bluebird.mod.^[Unit] = js.native
  
  def get(): typings.bluebird.mod.^[T] = js.native
  
  def getWithin(tx: DatabaseConnection): typings.bluebird.mod.^[T] = js.native
  
  def toQuery(): QueryLike = js.native
}
object Executable {
  
  @scala.inline
  def apply[T](
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
  
  @scala.inline
  implicit class ExecutableOps[Self <: Executable[_], T] (val x: Self with Executable[T]) extends AnyVal {
    
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
    def setAll(value: () => typings.bluebird.mod.^[js.Array[T]]): Self = this.set("all", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllWithin(value: DatabaseConnection => typings.bluebird.mod.^[js.Array[T]]): Self = this.set("allWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExec(value: () => typings.bluebird.mod.^[Unit]): Self = this.set("exec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecWithin(value: DatabaseConnection => typings.bluebird.mod.^[Unit]): Self = this.set("execWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: () => typings.bluebird.mod.^[T]): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWithin(value: DatabaseConnection => typings.bluebird.mod.^[T]): Self = this.set("getWithin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToQuery(value: () => QueryLike): Self = this.set("toQuery", js.Any.fromFunction0(value))
  }
}
