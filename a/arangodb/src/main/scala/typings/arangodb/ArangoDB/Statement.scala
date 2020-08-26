package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement[T] extends js.Object {
  def bind(name: String, value: js.Any): Unit = js.native
  def execute(): Cursor[T] = js.native
  def getBatchSize(): Double = js.native
  def setBatchSize(size: Double): Unit = js.native
}

object Statement {
  @scala.inline
  def apply[T](
    bind: (String, js.Any) => Unit,
    execute: () => Cursor[T],
    getBatchSize: () => Double,
    setBatchSize: Double => Unit
  ): Statement[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), execute = js.Any.fromFunction0(execute), getBatchSize = js.Any.fromFunction0(getBatchSize), setBatchSize = js.Any.fromFunction1(setBatchSize))
    __obj.asInstanceOf[Statement[T]]
  }
  @scala.inline
  implicit class StatementOps[Self <: Statement[_], T] (val x: Self with Statement[T]) extends AnyVal {
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
    def setBind(value: (String, js.Any) => Unit): Self = this.set("bind", js.Any.fromFunction2(value))
    @scala.inline
    def setExecute(value: () => Cursor[T]): Self = this.set("execute", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBatchSize(value: () => Double): Self = this.set("getBatchSize", js.Any.fromFunction0(value))
    @scala.inline
    def setSetBatchSize(value: Double => Unit): Self = this.set("setBatchSize", js.Any.fromFunction1(value))
  }
  
}

