package typings.arangodb.queuesMod

import typings.arangodb.DocumentJob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends js.Object {
  def all(): js.Array[String] = js.native
  def all(script: Script): js.Array[String] = js.native
  def complete(): js.Array[String] = js.native
  def complete(script: Script): js.Array[String] = js.native
  def delete(jobId: String): Boolean = js.native
  def failed(): js.Array[String] = js.native
  def failed(script: Script): js.Array[String] = js.native
  def get(jobId: String): DocumentJob = js.native
  def pending(): js.Array[String] = js.native
  def pending(script: Script): js.Array[String] = js.native
  def progress(): js.Array[String] = js.native
  def progress(script: Script): js.Array[String] = js.native
  def push(item: QueueItem, data: js.Any): Unit = js.native
  def push(item: QueueItem, data: js.Any, opts: JobOptions): Unit = js.native
}

