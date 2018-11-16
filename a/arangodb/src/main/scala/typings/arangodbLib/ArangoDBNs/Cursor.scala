package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor[T] extends js.Object {
  def count(): scala.Double = js.native
  def count(count: scala.Boolean): scala.Double = js.native
  def dispose(): scala.Unit = js.native
  def execute(): scala.Unit = js.native
  def execute(batchSize: scala.Double): scala.Unit = js.native
  def getBatchSize(): scala.Double = js.native
  def getExtra(): QueryExtra = js.native
  def hasNext(): scala.Boolean = js.native
  def next(): T = js.native
  def setBatchSize(size: scala.Double): scala.Unit = js.native
  def toArray(): js.Array[T] = js.native
}

