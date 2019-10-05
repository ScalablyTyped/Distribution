package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statement[T] extends js.Object {
  def bind(name: String, value: js.Any): Unit
  def execute(): Cursor[T]
  def getBatchSize(): Double
  def setBatchSize(size: Double): Unit
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
}

