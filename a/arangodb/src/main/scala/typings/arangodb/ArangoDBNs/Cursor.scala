package typings.arangodb.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor[T] extends js.Object {
  def count(): Double = js.native
  def count(count: Boolean): Double = js.native
  def dispose(): Unit = js.native
  def execute(): Unit = js.native
  def execute(batchSize: Double): Unit = js.native
  def getBatchSize(): Double = js.native
  def getExtra(): QueryExtra = js.native
  def hasNext(): Boolean = js.native
  def next(): T = js.native
  def setBatchSize(size: Double): Unit = js.native
  def toArray(): js.Array[T] = js.native
}

