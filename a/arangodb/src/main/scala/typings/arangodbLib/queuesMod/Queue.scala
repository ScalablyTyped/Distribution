package typings
package arangodbLib.queuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends js.Object {
  def all(): js.Array[java.lang.String] = js.native
  def all(script: Script): js.Array[java.lang.String] = js.native
  def complete(): js.Array[java.lang.String] = js.native
  def complete(script: Script): js.Array[java.lang.String] = js.native
  def delete(jobId: java.lang.String): scala.Boolean = js.native
  def failed(): js.Array[java.lang.String] = js.native
  def failed(script: Script): js.Array[java.lang.String] = js.native
  def get(jobId: java.lang.String): arangodbLib.ArangoDBNs.Document[Job] = js.native
  def pending(): js.Array[java.lang.String] = js.native
  def pending(script: Script): js.Array[java.lang.String] = js.native
  def progress(): js.Array[java.lang.String] = js.native
  def progress(script: Script): js.Array[java.lang.String] = js.native
  def push(item: QueueItem, data: js.Any): scala.Unit = js.native
  def push(item: QueueItem, data: js.Any, opts: JobOptions): scala.Unit = js.native
}

