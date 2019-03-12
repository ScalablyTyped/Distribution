package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statement[T] extends js.Object {
  def bind(name: java.lang.String, value: js.Any): scala.Unit
  def execute(): Cursor[T]
  def getBatchSize(): scala.Double
  def setBatchSize(size: scala.Double): scala.Unit
}

object Statement {
  @scala.inline
  def apply[T](
    bind: (java.lang.String, js.Any) => scala.Unit,
    execute: () => Cursor[T],
    getBatchSize: () => scala.Double,
    setBatchSize: scala.Double => scala.Unit
  ): Statement[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), execute = js.Any.fromFunction0(execute), getBatchSize = js.Any.fromFunction0(getBatchSize), setBatchSize = js.Any.fromFunction1(setBatchSize))
  
    __obj.asInstanceOf[Statement[T]]
  }
}

