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
    bind: js.Function2[java.lang.String, js.Any, scala.Unit],
    execute: js.Function0[Cursor[T]],
    getBatchSize: js.Function0[scala.Double],
    setBatchSize: js.Function1[scala.Double, scala.Unit]
  ): Statement[T] = {
    val __obj = js.Dynamic.literal(bind = bind, execute = execute, getBatchSize = getBatchSize, setBatchSize = setBatchSize)
  
    __obj.asInstanceOf[Statement[T]]
  }
}

