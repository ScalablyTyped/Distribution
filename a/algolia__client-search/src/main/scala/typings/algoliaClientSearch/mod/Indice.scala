package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indice extends js.Object {
  /**
    * Index creation date.
    */
  val createdAt: Double
  /**
    * Number of bytes of the index in minified format.
    */
  val dataSize: Double
  /**
    * Number of records contained in the index
    */
  val entries: Double
  /**
    * Number of bytes of the index binary file.
    */
  val fileSize: Double
  /**
    * Last build time in seconds.
    */
  val lastBuildTimes: Double
  /**
    * Index name.
    */
  val name: String
  /**
    * Number of pending indexing operations.
    */
  val numberOfPendingTasks: Double
  /**
    * A boolean which says whether the index has pending tasks.
    */
  val pendingTask: Boolean
  /**
    * Date of last update.
    */
  val updatedAt: Double
}

object Indice {
  @scala.inline
  def apply(
    createdAt: Double,
    dataSize: Double,
    entries: Double,
    fileSize: Double,
    lastBuildTimes: Double,
    name: String,
    numberOfPendingTasks: Double,
    pendingTask: Boolean,
    updatedAt: Double
  ): Indice = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], lastBuildTimes = lastBuildTimes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberOfPendingTasks = numberOfPendingTasks.asInstanceOf[js.Any], pendingTask = pendingTask.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Indice]
  }
}

