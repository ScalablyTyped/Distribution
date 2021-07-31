package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indice extends StObject {
  
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
  
  @scala.inline
  implicit class IndiceMutableBuilder[Self <: Indice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntries(value: Double): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastBuildTimes(value: Double): Self = StObject.set(x, "lastBuildTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfPendingTasks(value: Double): Self = StObject.set(x, "numberOfPendingTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingTask(value: Boolean): Self = StObject.set(x, "pendingTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Double): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
