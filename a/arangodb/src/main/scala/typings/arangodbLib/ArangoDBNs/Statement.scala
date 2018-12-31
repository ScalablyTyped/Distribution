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

