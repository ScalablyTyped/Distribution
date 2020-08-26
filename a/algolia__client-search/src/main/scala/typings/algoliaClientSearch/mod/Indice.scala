package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indice extends js.Object {
  /**
    * Index creation date.
    */
  val createdAt: Double = js.native
  /**
    * Number of bytes of the index in minified format.
    */
  val dataSize: Double = js.native
  /**
    * Number of records contained in the index
    */
  val entries: Double = js.native
  /**
    * Number of bytes of the index binary file.
    */
  val fileSize: Double = js.native
  /**
    * Last build time in seconds.
    */
  val lastBuildTimes: Double = js.native
  /**
    * Index name.
    */
  val name: String = js.native
  /**
    * Number of pending indexing operations.
    */
  val numberOfPendingTasks: Double = js.native
  /**
    * A boolean which says whether the index has pending tasks.
    */
  val pendingTask: Boolean = js.native
  /**
    * Date of last update.
    */
  val updatedAt: Double = js.native
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
  @scala.inline
  implicit class IndiceOps[Self <: Indice] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Double): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSize(value: Double): Self = this.set("dataSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntries(value: Double): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastBuildTimes(value: Double): Self = this.set("lastBuildTimes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfPendingTasks(value: Double): Self = this.set("numberOfPendingTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def setPendingTask(value: Boolean): Self = this.set("pendingTask", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: Double): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
  }
  
}

